import java.util.ArrayList;

public class b_all_paths_from_src_to_target {

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
        Graph[0].add(new Edge(0, 3));

        Graph[2].add(new Edge(2,3));

        Graph[3].add(new Edge(3,1));

        Graph[4].add(new Edge(4,0));
        Graph[4].add(new Edge(4,1));

        Graph[5].add(new Edge(5,0));
        Graph[5].add(new Edge(5,2)); 
 

    }

    public static void dfs(ArrayList<Edge>Graph []){
        // In this problem we have to print all the paths from a given src to given target.
        // we can take start fro src and then start traversing to its neighbours one by one.By traversing through one neighbour continue adding their values to current path.If target found through this path then add that path in all paths container.
        // Then coming back from this path to check all the other neighbours remove nextly added vertex from current path.
        // For this purpose we can use an arraylist of arraylist for storing all the paths.And a single arraylist for storing current path. 
        ArrayList<ArrayList<Integer>> ls = new ArrayList<>();
        int target = 1;
        int src = 5;
        if(src==target){
            System.out.println(src);
            return;
        }
        for(int i=0;i<Graph[src].size();i++){
            Edge e =  Graph[src].get(i);
            ArrayList<Integer>temp = new ArrayList<>();

            temp.add(src);
            check_path(Graph , e.dest , ls , temp , target);

        }
        for(int i=0;i<ls.size();i++){
            System.out.println("Path "+(i+1));
            for(int j=0;j<ls.get(i).size();j++){
                System.out.print(ls.get(i).get(j)+" ");
            }
            System.out.println();
        }
        
    }

    public static void check_path(ArrayList<Edge>Graph [] ,int curr ,  ArrayList<ArrayList<Integer>> ls , ArrayList<Integer>temp , int target ){
        temp.add(curr);//adding current vertex in temp path
        if(curr==target){
            ls.add(new ArrayList<>(temp)); //if a path has been found than add it to result list and return.
            return;
        }
        for(int i=0;i<Graph[curr].size();i++){ //traverse over all the neighbours of current vertex
            Edge e = Graph[curr].get(i);
            check_path(Graph, e.dest, ls, temp , target);//check weather a path goes through neighbour
            temp.remove(temp.size()-1);//coming back from this neighbour , remove it from current path we have check all the paths through this neighbour.
        }

    }
    public static void main(String args[]){
        int V = 6;
        ArrayList<Edge>[] Graph = new ArrayList[V];
        create_graph(Graph);
        dfs(Graph);




    }
}
