import java.util.ArrayList;
import java.util.PriorityQueue;

public class c_primes_algo {
    static class Edge{
        int src , dest  ,weight;
        public Edge(int src , int dest , int weight){
            this.src = src;
            this.dest = dest;
            this.weight = weight;
        }
    }
    
    static class Pair implements Comparable<Pair>{
        int src , cost;
        public Pair(int vertex  ,  int cost){
            this.src = vertex;
            this.cost = cost;
        }

        @Override
        public int compareTo(Pair P2){
            return this.cost-P2.cost;
        }
        
    }
    public static void buildGraph(ArrayList<Edge>Graph[]){
        for(int i=0;i<Graph.length;i++){
            Graph[i] = new ArrayList<>();
        }

        Graph[0].add(new Edge(0,1 , 7));
        Graph[0].add(new Edge(0,2 , 5)); 

        Graph[1].add(new Edge(1,0 , 7));
        Graph[1].add(new Edge(1,2 , 9));
        Graph[1].add(new Edge(1,3 , 8));
        Graph[1].add(new Edge(1,4 , 7));

        Graph[2].add(new Edge(2,0 , 5));
        Graph[2].add(new Edge(2,1 , 9));
        Graph[2].add(new Edge(2,4 , 15));
        Graph[2].add(new Edge(2,5 , 6));
        
        Graph[3].add(new Edge(3,0 , 30));
        Graph[3].add(new Edge(3,1 , 8));
        Graph[3].add(new Edge(3,4 , 5));
        
        Graph[2].add(new Edge(4,3 , 5));
        Graph[2].add(new Edge(4,1 , 7));
        Graph[2].add(new Edge(4,2 , 15));
        Graph[2].add(new Edge(4,5 , 8));
        Graph[2].add(new Edge(4,6 , 9));
        
        Graph[2].add(new Edge(5,2 , 6));
        Graph[2].add(new Edge(5,4 , 8));
        Graph[2].add(new Edge(5,6 , 11));
        
        Graph[2].add(new Edge(6,4 , 9));
        Graph[2].add(new Edge(6,5 , 11));
    }
    public static int primesAlgo(ArrayList<Edge>Graph[] , int src){

        // we can get those edges in this connected , weighted graph  , with the help of traverse over the whole graph with minimum cost.It means that we can find those edges with the help of which we can traverse over whole graph with the least cost.Here cost means weight of edges.It means that we will remove all the other paths and no cycle will be present in this graph.

        // for this purpose we will be using PQ(min-heap) and a visiting array
        // we can take any vertex as starting vertex and cost for this will be 0 as this is the starting vertex
        // In our PQ we will be adding each vertex with the cost it takes for reaching to it.
        PriorityQueue<Pair>pq = new PriorityQueue<>();
        pq.add(new Pair(src, 0));

        boolean visited[] = new boolean[Graph.length];
        int cost = 0;
        while (!pq.isEmpty()){
            Pair curr = pq.remove();
            if (visited[curr.src]){

                continue;
            }
            cost+=curr.cost;
            // System.out.println(curr.cost);
            // 0 - 0 visited 
            // 2 - 5 visited
            // 5 - 6 visited
            // 1 - 7 visited
            // 4 - 7 visited
            // 3 - 5 visited
            // 3 - 8 visited
            // 4 - 8 visited
            // 1 - 9 visited
            // 6 - 9 visited
            // 6 - 11 visited
            // 4  - 15 visited
            // cost = 0+5+6+7+7+5+9
            for(int i=0;i<Graph[curr.src].size();i++){
                Edge e = Graph[curr.src].get(i);
                int dest = e.dest;
                int weight = e.weight;
                if(visited[dest]){//if we had already visited this then we don't need to add this again.
                    continue;
                }
                pq.add(new Pair(dest, weight));
            }
            visited[curr.src] = true;

        }

        return cost;


    }
    public static void main(String args[]){
        // We are given a graph and we have to calculate sum of all the edges weights of MST from this graph
        // For this purpose we will use prime's algorithm
        int V = 7;
        ArrayList<Edge> graph[] = new ArrayList[V];
        buildGraph(graph);
        int src = 1;
        System.out.println(primesAlgo(graph , src));
        
    }
}
