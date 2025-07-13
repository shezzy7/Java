// As we know cycles exist in both directed and undirected graphs.
// For detecting cycles in graphs we use different approaches.

// For detecting cycles in directed graph we can use DFS, BFS and topological sort(Kahn's algorithm)
// And for undirected graph we can use DFS , BFS and DSU(disjoint set union)

// But the main method used for both cases is DFS.It is used mostly bcz it is simple as compared to others and uses less memory as compared to bfs.


import java.util.*;

public class b_cycle_in_graph {
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
        graph[1].add(new Edge(1, 3));
        
        // vertex 2
        graph[2].add(new Edge(2, 0));
        // graph[2].add(new Edge(2, 3));
        
        // vertex 3
        graph[3].add(new Edge(3, 1));
        // graph[3].add(new Edge(3, 2));
        graph[3].add(new Edge(3, 4));

        // vertex 4
        graph[4].add(new Edge(4, 3));
    }
    
    // dfs
    public static boolean dfs(ArrayList<Edge>[] graph) {
        boolean visited[] = new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if (!visited[i]) {
                
                if (detect_cycle(graph, visited, i, -1)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    // detect_cycle
    public static boolean detect_cycle(ArrayList<Edge>[] graph, boolean visited[], int curr, int par) {
        // Approach
        // On a node there are three stages:
        //     i- a neighbour of this node is not visited
        //     ii-a neighbour of current node is visited and parent(we are coming to current node through this parent)
        //     iii- a neighbour of current node is visited but not its parent(it means that this node has been visited before and we can go to this node from another node without returning back than it means it is making a cycle at this point).So we have to check for such node if such node exists than cycle is present else not
        visited[curr] = true;

        for (Edge e : graph[curr]) {
            if (!visited[e.dest]) {
                if (detect_cycle(graph, visited, e.dest, curr)) {
                    return true;
                }
            } else {
                if (e.dest != par) {
                    return true;
                }
            }

        }
        return false;
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
         * 0------1----3-----4
         * \ |
         * \ |
         * 2--
         * 
         */
        ArrayList<Edge>[] graph = new ArrayList[5];
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
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
        // forward to other components which are not traversed ye.
        System.out.println(dfs(graph));

    }
}