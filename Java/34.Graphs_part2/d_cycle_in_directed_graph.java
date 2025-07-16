import java.util.ArrayList;

public class d_cycle_in_directed_graph {
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

        // vertex 1
        graph[1].add(new Edge(1, 2));

        // vertex 2
        graph[2].add(new Edge(2, 3));

        // vertex 3
        graph[3].add(new Edge(3, 1));

    }

    public static boolean isCycle(ArrayList<Edge> Graph[], int curr, boolean visited[], boolean st[]) {
        // we have to detect cycle in directed graph.We will use a modified form of dfs
        // for this purpose.We can't apply same logic as we applied in cycle detection
        // for undirected graph.Bcz in directed graph a single vertex can be a neighbour
        // of more than one verteces.So when we visit that one vertex to whome more than
        // one verteces are directing and this vertex has no neighbours or any neighbour
        // that are not part of any cycle in graph.In this case when we will visit this
        // vertex from one of other verteces directed to it.We will set its visited
        // values as true. And when we will come to this vertex again from other node
        // directed to it then we found it as visited and also has been visited through
        // some other route(its not parent of vertex directing to it).In this case our
        // approach for undirected graph will return true.
        // So for directed graph we will use a different approach but will modify our
        // dfs.
        // here we will be using two arrays for cheking visiting status of a vertex.One
        // visiting array be working like our previous array which we used for tracking
        // visited nodes and it will work simple.But other array will be working such
        // like that if we have visited a node we will set as visited and will go to its
        // neighbours.If any of its neihbours told that cycle exists then fine else
        // while backtracking we will set it as not visited in our that other visiting
        // array.The reason is that when we go back and come to that node again from
        // some other vertex then its status will be visited here , but as we have seen
        // that this vertex is not involved in any kind of cycle then it means that here
        // no cycle is present.Otherwise if its value is true then it means that we have
        // reached to it again but its own path bcz its visiting value is true, it means
        // we have not backtracked from it still and we are checking its neighbour and
        // through its neighbours we have reached again to it and its a sign of cycle
        // hence we will return true that cycle exists.
        // here visited will be treated as simple visiting status array while st will be
        // treated as modified form of visited array
        visited[curr] = true;
        st[curr] = true;
        for (int i = 0; i < Graph[curr].size(); i++) {
            int neighbour = Graph[curr].get(i).dest;
            if (st[neighbour]) {
                return true;
            }
            if (!visited[neighbour]) {
                if (isCycle(Graph, neighbour, visited, st)) {
                    return true;
                }
                st[neighbour] = false;
            }

        }

        return false;
    }

    public static void main(String args[]) {

        /*
         * Directed Graph
         * 
         * 0--------> 1 <-------3
         * | /\
         * | /
         * \/ /
         * 2 ------
         * 
         * 
         * 
         */

        int V = 4;
        ArrayList<Edge> Graph[] = new ArrayList[V];
        for (int i = 0; i < Graph.length; i++) {
            Graph[i] = new ArrayList<Edge>();
        }

        createGraph(Graph);
        boolean visited[] = new boolean[V];
        boolean st[] = new boolean[V];

        System.out.println(isCycle(Graph, 0, visited, st));

    }
}
