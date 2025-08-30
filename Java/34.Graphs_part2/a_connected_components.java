import java.util.*;

public class a_connected_components {
    static class Edge {
        int src, dest;

        public Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
        
    }

    // create graph
    public static void createGraph(ArrayList<Edge>[] graph) {
        // vertex 0
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        // vertex 1
        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));

        // vertex 2
        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));

        // vertex 3
        graph[3].add(new Edge(3, 4));


        // vertex 4
        graph[4].add(new Edge(4, 3));

        // vertex 5
        graph[5].add(new Edge(5, 6)); // here -1 representing that it has not neighbours at all

        // vertex 6
        graph[6].add(new Edge(6, 5)); // here -1 representing that it has not neighbours at all
    }

    // dfs
    public static void dfs(ArrayList<Edge>[] graph) {

        boolean visited[] = new boolean[graph.length+1];

        for (int i = 0; i < graph.length; i++) {
            
                if(!visited[i]){
                    dfs_util(graph, i, visited);
                }
            
        }
    }

    // dfs_util
    public static void dfs_util(ArrayList<Edge>[] graph, int curr, boolean visited[]) {
        
        System.out.println(curr);
        visited[curr] = true;
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!visited[e.dest]) {
                dfs_util(graph, e.dest, visited);
            }
        }
    }

    public static void main(String args[]) {

        /*
         * In graph it is not necessary that all the vertces should be connected.A graph
         * can be a combination of different separeted components.For the structurs
         * given below can be representing a single graph.Mean it's not necarry that all
         * the vertices should be connected.And other thing is that if we see below we
         * might think that representation given below is a single graph.Which is
         * true.But it is also possible that all the representations given below are
         * forming a single graph.These all components are part of a single graph.
         * 
         * 
         * 0------1   3-----4     5-----6
         *  \    /
         *   \  /
         *    2
         * 
         */
        ArrayList<Edge>[] graph = new ArrayList[7];
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<Edge>();
        }
        // create graph
        createGraph(graph);

        // dfs
        // for performing depth first traversel on such type of graphs where some
        // vertces are not connected to each other we use two functions.One main dfs
        // function other util function for dfs.In dfs function we will traversing over
        // each vertex using for loop , for each non visited vertex we will be calling
        // dfs_util which will perform traversing over this vertex and all the
        // neighbours connected to this vertex will be traversed through this way.When
        // all the verteces present in this component will be traversed we will moving
        // forward to other components which are not traversed yet.
        dfs(graph);

    }
}