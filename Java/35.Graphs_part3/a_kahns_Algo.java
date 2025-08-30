import java.util.*;

public class a_kahns_Algo {
    static class Edge {
        int src, dest;

        public Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    // create graph
    public static void create_graph(ArrayList<Edge>[] Graph) {

        for (int i = 0; i < Graph.length; i++) {
            Graph[i] = new ArrayList<>();
        }

        Graph[2].add(new Edge(2, 3));

        Graph[3].add(new Edge(3, 1));

        Graph[4].add(new Edge(4, 0));
        Graph[4].add(new Edge(4, 1));

        Graph[5].add(new Edge(5, 0));
        Graph[5].add(new Edge(5, 2));
    }

    public static void calculate_indegree(ArrayList<Edge>[] Graph, int indegree[]) {
        // to calculate in degree we need to go to each vertex and to its destination's
        // indegree count we have to increase by 1.As from this vertex we can go to its
        // destination's vertex.
        for (int i = 0; i < Graph.length; i++) {
            for (int j = 0; j < Graph[i].size(); j++) {
                Edge e = Graph[i].get(j);
                indegree[e.dest]++;
            }
        }
    }

    public static void Kahns_algo(ArrayList<Edge>[] Graph) {
        /*
         * we have done simple topological with the help of DFS.Now we are going to do
         * this with the help of modified BFS.
         * This technique of using BFS for topological sort is known as Kahn's Algo
         * Kahn’s Algorithm uses Breadth-First Search (BFS) and in-degree counting to
         * perform topological sorting.
         * ✅In-degree:
         * The in-degree of a node is the number of edges coming into it.
         * The out-degree of a node is the number of edges going out of it.
         * In a DAG(Directed acyclic graph) there's always vertex with in-degree
         * 0(starting vertex) and a vertex with out-degree 0(ending vertex).
         * ✅ Kahn’s Strategy:
         * i-Count the in-degree for each node.
         * ii-Start with nodes having in-degree 0 (no dependencies).
         * iii-Repeatedly remove those nodes and reduce in-degree of their neighbors.
         * Firt of all we will add vertex with indegree 0 into queue and then we will
         * start traversing , over queue.We will remove first vertex,decrease its
         * neighbours indegree by 1 as we have removed an edge with the help of which we
         * can go to this.Then we will check if any of its neighbours indegree has
         * become 0 then we will add this into queue.
         * The order in which we are removing elements from queue is our topological
         * order.
         */
        // calculate in degree of each
        int indegree[] = new int[Graph.length];
        calculate_indegree(Graph, indegree);
        Queue<Integer> q = new LinkedList<>();
        // push elements with indegree 0 in stack
        for (int i = 0; i < indegree.length; i++) {
            if (indegree[i] == 0) {
                q.add(i);
            }
        }
        System.out.println("Topological order");
        while (!q.isEmpty()) {
            int curr = q.remove();
            System.out.print(curr + " ");
            for (int i = 0; i < Graph[curr].size(); i++) {
                Edge e = Graph[curr].get(i);
                indegree[e.dest]--;
                if (indegree[e.dest] == 0) {
                    q.add(e.dest);
                }
            }
        }
    }

    public static void main(String args[]) {
        int V = 6;
        ArrayList<Edge>[] Graph = new ArrayList[V];
        create_graph(Graph);
        Kahns_algo(Graph); // 4 5 0 2 3 1
    }
}