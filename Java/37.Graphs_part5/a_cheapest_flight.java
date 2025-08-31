import java.util.*;

public class a_cheapest_flight{

    static class Edge{
        int src , dest , wt;
        public Edge(int src , int dest , int wt){
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }

    static class Info{
        int vert , cost , stops;
        public Info(int v , int c , int s){
            this.vert = v;
            this.cost = c;
            this.stops = s;
        }
    }

    public static void creatGraph(int flights[][] , ArrayList<Edge>[] Graph ){
        for (int i=0;i<Graph.length;i++){
            Graph[i] = new ArrayList<>();
        }
        for(int i=0;i<flights.length;i++){
            int src = flights[i][0]; 
            int dest = flights[i][1];
            int price = flights[i][2];
            Graph[src].add(new Edge(src , dest , price));
        }

    }

    public static int cheapest_flights_within_k_stopes(int n , int flights [][],int src , int dst , int k ){
        // There are n  cities connected by some number of flights. You are given an array flights where flights[i]={from , to , price} indicates that there is a flight.
        // We are also given three integers src,dst and k. We had to return the cheapest price from src to dst with at most k stops.IF there is no such route , return -1.
        // All values are positive

        /*
         Example : 
            input : flights = [[0,1,100] , [1,2,100] , [0,2,500]]
                src=0 , dst=2 , k=1
            output : 200
         */

        //  As we know that dikstra's algo help us in finding shorest path from a source to destination when all the values of weights are positive. Here we can use dikstra's approach but the little issue is that we have to find shortest path within k stops. So we also need to keep track of number of stops.

        // here we will be using dikstra's algo with some modifications like we will use a simple queue instead of priority queue.As here we don't need to calculate only minimum cost but also number of stops , so we will check all the paths less then k stops that lead to our destination , and we will pick the path with least cost.

        // In our queue we will be adding three things in one entry (name of vertex , total cost to reach this vertex from src , number of stops that we take to reach this)

        // But first of all we need to create an adjacency list from our given 2d array that contains all the info , so that we can perfrom all the operations easily

        // Creating adjacency list
        ArrayList<Edge>[] Graph = new ArrayList[n];
        creatGraph(flights , Graph);

        // lets creat a queue in which we will be storing some necesarry info like name a vertex , cost to reach this vertex , number of stops to reach this vertex
        Queue<Info>q = new LinkedList<>();
        q.add(new Info(src , 0 , 0)); //cost and stops to reach src both are 0

        // we will also be using a simple array in which we will store distance for each vertex to reach it.
        int distances[] = new int[Graph.length];
        // we alos need to initialize it by infinity value for all verteces except src which is going to be 0
        for(int i=0;i<distances.length;i++){
            if (i!=src){
                distances[i]=Integer.MAX_VALUE;
            }
        }

        while (!q.isEmpty()){
            Info curr = q.remove();
            if (curr.stops>k){ //as value of stops increases k at any point then we will break out from our loop as we have traversed all the paths within limit of k.
                break;
            }
            for(int i=0;i<Graph[curr.vert].size();i++){
                Edge e = Graph[curr.vert].get(i);
                // here we have to perform our relaxation step , but here we will modify it a littel bit as compared to as we do this in pure diksra's algo

                /*  In relaxation step we check if cost to reaching current vertex + weight of edge going to current neighbour is less then cost of reaching to current neighbour thourgh some other path that is already calculated and store it in distances array.
                    e.g -> if distances[e.src]+e.wt<distance[e.dest] then distances[e.dest]=distances[e.src]+e.wt

                But here if we see in depth. If we go to some vertex c throguh path some a with cost of 2 and also some through some other path b with cost 1. Now our destination is some vertex d. We can go to d from c only and cost to reach it is 1. Now if we calcluated cost from a to c(which is 2) , stored it in distances array and also pushed the info in queue , then when we will calculate cost of path b to c which is 1 and also is less then 2(cost of path a to c) therefore our distances array will update value from 2 to 1.
                Now when we will try to go to d from c but we have chosen path a->c->d then when we will pick value from distances of c then it will absolutely give us 1 but we see that it is of path b->c.
                So to prevent this problem we will get cost from our Info object which is present in queue, that contains exact information about each vertex specifically instead of current updated value
                */

                if (curr.cost+e.wt<distances[e.dest]){
                    distances[e.dest] = curr.cost+e.wt;
                }

                // also add info about current neighbour in queue
                q.add(new Info(e.dest , curr.cost+e.wt , curr.stops+1));

                
            }
        }

        if (distances[dst]!=Integer.MAX_VALUE){ //if we can't reach to dst within k stops then it means that value for it in distances is still infinity and we will return -1 else calculated value.
            return distances[dst];
        }
        return -1;


    }

    public static void main(String args[]){

        int n = 4;

        int flight[][] = {{0,1,100} , {1,2,100} , {2,0,100} , {1,3,600},{2,3,200}};
        int src =0 , dst=3 , k=1;

        int cost = cheapest_flights_within_k_stopes(n, flight, src, dst, k);
        System.out.println(cost);

    }
}