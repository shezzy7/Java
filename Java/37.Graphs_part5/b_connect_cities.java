import java.util.*;
public class b_connect_cities {
    
    static class Edge implements Comparable<Edge>{
        int dst , wt;
        public Edge(int d , int w){

            this.dst = d;
            this.wt = w;

        }
        @Override
        public int compareTo(Edge e){
            return this.wt-e.wt;
        }
        
    }

    public static int connectCities(int cities[][] , int n){
        // Find the minimum cost for connecting all the cities on the map.
        // here in our 2d array arr[i][j] means , is there any edge connectin ith vertex with jth vertex. If value at that index is not 0 then its mean there is an edge between i and j with weight of arr[i][j].If arr[i][j] is 0 then its mean there is no edge between i and j.
        // Keeping this thing in mind , lets create an adjacency list.
        int cost = 0;
        PriorityQueue<Edge>q = new PriorityQueue<>();
        boolean visited[] = new boolean[n];
        q.add(new Edge(0, 0));

        while(!q.isEmpty()){
            Edge e = q.remove();
            if(!visited[e.dst]){
                visited[e.dst] = true;
                cost+=e.wt;

                // now add neighbours of first vertex
                for(int i=0;i<cities[e.dst].length;i++){
                    if(cities[e.dst][i]!=0){

                        q.add(new Edge(i,cities[e.dst][i]));
                    }
                }


            }

        }

         
        return cost;
    }
    public static void main(String args[]){
        int cities[][] = {
            {0,1,2,3,4},
            {1,0,5,0,7},
            {2,5,0,6,0},
            {3,0,6,0,0},
            {4,7,0,0,0}
        };

        int ans = connectCities(cities , cities.length);
        System.out.print(ans);
    }
}
