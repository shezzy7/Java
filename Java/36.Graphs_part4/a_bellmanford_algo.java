import java.util.*;

public class a_bellmanford_algo{
    static class Edge{
        int src , dest , weight;
        public Edge(int src , int dest , int weight){
            this.src = src;
            this.dest = dest;
            this.weight = weight;
        }
    }

    public static void createGraph(ArrayList<Edge> Graph[]){
        for(int i=0;i<Graph.length;i++){
            Graph[i]= new ArrayList<>();
        }
        Graph[0].add(new Edge(0 , 1 , 2));
        Graph[0].add(new Edge(0 , 2 , 4));

        Graph[1].add(new Edge(1 , 2 , -4));

        Graph[2].add(new Edge(2 , 3 , 2));

        Graph[3].add(new Edge(3 , 4, 4));
        
        Graph[4].add(new Edge(4 , 1, -1));


    }
    public static void shortestPath(ArrayList<Edge>Graph[]){ //O(V*E)
        // lets suppose src is 0
        int src = 0;
        // distances
        int distances[]  = new int[Graph.length];
        distances[src] = 0;
        for(int i=0;i<distances.length;i++){
            if(i!=src){
                distances[i]=Integer.MAX_VALUE;
            }
        }

        for(int i=0;i<Graph.length-1;i++){
            // calculate distance for each edge from u to v
            for(int j=0;j<Graph.length;j++){
                for(int k=0;k<Graph[j].size();k++){
                    Edge e  = Graph[j].get(k);
                    int u = e.src;
                    int v = e.dest;
                    int w = e.weight;
                    // relaxtion step
                    if(distances[u]!=Integer.MAX_VALUE && distances[u]+w<distances[v]){
                        distances[v]=distances[u]+w;
                    }
                }
            }
        }
        for(int i=0;i<distances.length;i++){
            System.out.println(src+"---("+distances[i]+")-->"+i);
        }
    }
    public static void main(String args[]){

        int V = 5;
        ArrayList<Edge> Graph[] = new ArrayList[V];
        createGraph(Graph);

        // Bellmanford algo is used for find 'Shortest paths from the source to all vertices'.So basically it has same function as of Dijkstra's algo but when our edges have negative weights then we use Bellman Ford algo. Dijkstra's algo doesn't give correct answers in all cases when edges can have negative weights.
        // in this algo we find shortest distance of each node to its neighbours , for V-1 times.
        // Other constraint for Bellman Ford algo is that if there is some cycle in Graph then sum of all the weights of edge of this cycle should be a positive number.Otherwise Bellman ford will fail.
        shortestPath(Graph);
    } 
}