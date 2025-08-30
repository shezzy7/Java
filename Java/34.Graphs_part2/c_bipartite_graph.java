import java.util.*;
public class c_bipartite_graph {
    
    static class Edge{
        int src ,dest;
        public Edge(int src , int dest){
            this.src = src;
            this.dest = dest;
        }
    }

    // check bipartite
    public static boolean check_bipartite(ArrayList<Edge>[] graph){
        /*  Bipartite Graph
        First see what is a bipartite graph(use chatgpt)...

        In this problem we are give a graph and we have to see weahter this graph is a partite graph or not.

        Approach:-
        Here to make two sets of vertices , we will use two colors.Blue and Yellow.Lets suppose Blue colour is represented by 0 and yellow by 1.A vertex with 0 colour is in set blue while with 1 is in set of yellow. 
        -First of all we will pick one element and give it a color lets suppose we give it blue color.Then will see its neighbours , to its neighbours we will give opposite colour of this (yellow).Then we will go to its neighbours we will pick one of them and will check its neighours.
        At this point three conditions are possible for its neighbours
            i- a neighbour is not coloured yet
            ii- a neighbour is coloured but has different colour
            iii- a neighbour is coloured and the colour is same as of this
        in first we will just give this neighbour opposite color of current element and will continue checking other neighbours , in second case we will do nothing and will move to check other neighbours , and third case we see that the neighbour and current vertex came in same set, this means that our graph is not a bipartite and in this case we will return false.
        If third case doesn't came in whole process then it means that our graph can be a partite graph and we will return true in this case.

        For this whole approach we will use a modified form of BFS.Where we will be using an array in which we will be storing color for each vertex.
        */

        int colour[] = new int[graph.length]; //in this array 0 means blue color , 1 means yellow and -1 means not coloured yet.
        for(int i=0;i<colour.length;i++){
            colour[i]=-1; //first we will initialize colour array with values -1.-1 means no color
        }
        boolean visited[] = new boolean[graph.length];
        Queue<Integer> q = new LinkedList<>();
        colour[0]=0; //setting color of first vertex as blue 0
        q.add(graph[0].get(0).src);
        while(!q.isEmpty()){
            int curr = q.remove();
            // pick an unvisited node and traverse to its neighbours and check which case is true from above three given and perform operation according to them.
            if(!visited[curr]){

                for(int i=0;i<graph[curr].size();i++){
                     int neighbour = graph[curr].get(i).dest;
                     if(colour[neighbour]==-1){ // case i here in this case we have to give an opposite color to our neighbour just to make sure that it is present other set.
                        if(colour[curr]==1){ 

                            colour[neighbour]= 0;
                        }else{
                            colour[neighbour]=1;
                        }
                     }else if(colour[neighbour]==colour[curr]){ //case iii in this case it means that both of these vertices are present in same set and we have to return fasle in this case.
                        return false;
                     }
                     else{ //case ii , in this case we have to do nothing just continue(we can remove this else statement from here)
                        continue;
                     }
                     q.add(neighbour);
                }

            }
            visited[curr]=true;
        }
        return true;
        // a graph with no cycle is always a bipartite graph
        //  a cyclic graph where count of verteces present in the cycle is an even number then it is a bipartite graph
        // a cyclic graph where count of verteces present in cycle is an odd number than graph is not a bipartie graph
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
        graph[2].add(new Edge(2, 4));
        
        // vertex 3
        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));
        // graph[3].add(new Edge(3, 4));

        // vertex 4
        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 2));
    }
    

    public static void main(String args[]){
        
        int V = 5;
        ArrayList<Edge> Graph[] = new ArrayList[V];
        for(int i=0;i<Graph.length;i++){
            Graph[i] = new ArrayList<Edge>();
        }

        createGraph(Graph);

        System.out.println(check_bipartite(Graph));
    }
}
