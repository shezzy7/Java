import java.util.ArrayList;

public class G_hasPath {
        static class Edge{
        int src , dest , weight;
        public Edge(int src , int dest ){
            this.src = src;
            this.dest = dest;
        }
    }
    // creat graph
    public static void buildGraph(ArrayList<Edge>[] graph){
        // vertex 0
        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));

        // vertex 1
        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1, 3));

        // vertex 2
        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2 , 4));

        // vertex 3
        graph[3].add(new Edge(3,1));
        graph[3].add(new Edge(3,4));
        graph[3].add(new Edge(3,5));

        // vertex 4
        graph[4].add(new Edge(4 , 2));
        graph[4].add(new Edge(4,3));
        graph[4].add(new Edge(4,5));

        // vertex 5
        graph[5].add(new Edge(5,3));
        graph[5].add(new Edge(5,4));
        graph[5].add(new Edge(5,6));

        // vertex
        graph[6].add(new Edge(6,5));

    }


    public static boolean hasPath(ArrayList<Edge>[] graph , boolean visited[] , int src , int final_des){
        // we are given a graph,a src and a dest.We have to find whether there is a path for going to dest from src.If path is present then we will return true else false.
        // In graph it is not necessary that all the verteces will/should be connected.Like in this grpah we see all the nodes are connected to each other.But if we make another vertex of value 8 and connect it with another vertex of value 9.And we can place it in our graph but we see that 8 or 9 are not connected to any of the other vertices in the graph.So in this case if we have to find path between 3 and 9 then we will see no path going from 3 to 9.
        // So keeping this thing in mind we have to find whether a given src vertex has any path going to dest.

        if(src==final_des){//if src's value is equall to destination value then it mean we have reached the destination ,which means path exists.
            return true;
        }

        visited[src]=true;
        for(Edge e : graph[src]){
            if(!visited[e.dest] && hasPath(graph, visited, e.dest, final_des)){
                return true;
            }
        }
        return false;
    }
    public static void main(String args[]){

         /*
         
        0 ── 1 ── 3
         \       / \
          2 ── 4 ───5 ── 6

         */
        // output(dfs) -> 0 1 3 4 2 5 6
        int V = 7;
        ArrayList<Edge>[] graph = new ArrayList[V];
        for(int i=0;i<V;i++){
            graph[i] = new ArrayList<Edge>();
        }
        
        // create graph
        buildGraph(graph);

        // find if path exists between src and given destination
        int src=2;
        int des = 6;
        System.out.println(hasPath(graph , new boolean[V] , src,des));

    }
}
