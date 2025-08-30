import java.util.*;
public class F_DFS {
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

    public static void dfs(ArrayList<Edge>[] graph , boolean visited[] , int curr_vertex){ //O(V+E)
/* 
         in graphs depth first search means when we are at our starting vertex.We will visit(print or perform any desired operation) it.Then we will check its neighbours.We will pick one of its neighbours.Visit it.Then before going back to visit other neighbours of starting vertex like in bfs, we will first traverse over neighbours of this current vertex.We will pick one neighbour of it and will make a dfs traversal over it.Then will pick another neighbour of it and will visit it.

         In DFS, when we start from a vertex:

         -We visit the starting vertex (perform any desired operation like printing or marking).

         -Then, we recursively explore one of its neighbors.

         -Before returning to the starting vertex to check other neighbors (as we would in BFS), we go deeper into the neighbor's neighbors first.

         -This continues until we reach a vertex with no unvisited neighbors.

         -Then we backtrack and continue with the next unvisited neighbor of the previous verteces.

*/
        // Visit current vertex
        System.out.print(curr_vertex+" ");
        visited[curr_vertex] = true; //mark it as visited before going to its neighbours
        // dfs over its neighbours
        for(Edge e : graph[curr_vertex]){
            if(!visited[e.dest]){//if this vertex has not been visited so far then visit it
                dfs(graph , visited , e.dest);
            }
        }

    }
    public static void main(String[] args) {
        
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

        // make a depth first traversal over graph
        // before visiting we must have a list that will be helping us to identify wheather a vertex is visited or not
        boolean visited[] = new boolean[V]; //by default value of each index is setted to false.
        
        dfs( graph , visited , 0);

    }
}
