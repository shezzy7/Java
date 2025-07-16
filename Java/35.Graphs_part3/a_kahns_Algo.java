import java.util.*;
public class a_kahns_Algo{
    static class Edge{
        int src , dest;
        public Edge(int src , int dest){
            this.src = src;
            this.dest = dest;
        }
    }
    // create graph
    public static void create_graph(ArrayList<Edge>[] Graph){

        for(int i=0;i<Graph.length;i++){
            Graph[i]=new ArrayList<>();
        }

        Graph[2].add(new Edge(2,3));

        Graph[3].add(new Edge(3,1));

        Graph[4].add(new Edge(4,0));
        Graph[4].add(new Edge(4,1));

        Graph[5].add(new Edge(5,0));
        Graph[5].add(new Edge(5,2));

    }

    public static void calculate_indegree(ArrayList<Edge>[] Graph , int indegree[]){
        
    }

    public static void main(String args[]){
        


    }
}

