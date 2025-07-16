import java.util.ArrayList;
import java.util.Stack;

public class e_topological_sort {
    static class Edge {
        int src, dest;
        
        public Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
        
    }
    
    // create graph
    public static void createGraph(ArrayList<Edge>[] graph) {
        // vertex 2
        graph[2].add(new Edge(2, 3));
        
        // vertex 3
        graph[3].add(new Edge(3, 1));
        
        // vertex 4
        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));

        // vertex 5
        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));
        

    }

    public static void topological_sort(ArrayList<Edge> Graph[]){
        // We will perform topological sort using modified form of dfs
        boolean visited[] = new boolean[Graph.length];
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<Graph.length;i++){
            if(!visited[i]){
                topological_sort_util(Graph , i , visited , st);//this will give us topological order of given DAG stored in st.
            }
        }
        System.out.println("Topological order of graph is");
        while(!st.isEmpty()){
            System.out.print(st.pop()+" ");
        }

    }

    public static void topological_sort_util(ArrayList<Edge>graph[] , int curr , boolean visit[] , Stack<Integer>st ){
        visit[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            int neighbour = graph[curr].get(i).dest;
            if(!visit[neighbour]){
                topological_sort_util(graph, neighbour, visit, st);
            }
        }
        st.push(curr);
    }
    public static void main(String args[]){
        // Directed Acylic Graph (DAG): Directed graph with no cycle is know as DAG
        /*
            Topological Sort: It is a linear order of vertices such that every directed edge u->v, the vertex u comes before v in the order.
            A term known as topological sort can only be applied on DAGs.
        


         */
        /*
         5---->0<------4
         |             |
         |             |
         \/            \/
         3----->1<-----2      
          
         
         */
        int V = 6;
        ArrayList<Edge> Graph[] = new ArrayList[V];
        for (int i = 0; i < Graph.length; i++) {
            Graph[i] = new ArrayList<Edge>();
        }

        createGraph(Graph);
        topological_sort(Graph);


    }
}
