import java.util.*;
public class D_createGraph {
    
    static class Edge{
        int src;
        int des;
        int weight;

        public Edge(int s , int e , int w){
            this.src = s;
            this.des = e;
            this.weight = w;
        }
    }
    public static void main(String args[]){
        // Here we will create a graph by using adjacency list(List of lists).
        // For doing so ,  we will creat an array of arraylists.Each arraylist will contain all the newtwork of a vertix.Mean type of each arraylist will be of Edge.An edge is contains all the the information about a node(node's start,node's end , wight of edge connecting these nodes.)
        // If a vertex is making some connections to other edges then , we will store  info its value , value of node connected to it and weight of edge connecting them.
        /* 

                       (5) 
                    0------1
                          / \
                     (1) /   \ (3)
                        2-----3
                       /  (1)
                  (2) /
                     4
                     
                     
        */
        // here we are going to build graph using above representation.
        ArrayList<Edge>[] graph = new ArrayList[5];
        for(int i=0;i<5;i++){
            graph[i] = new ArrayList<>();
        }
        // 0 edge
        graph[0].add(new Edge(0 , 1 , 5));

        // 1 edge
        graph[1].add(new Edge(1,0,5));
        graph[1].add(new Edge(1,2,1));
        graph[1].add(new Edge(1,3,3));

        // edge 2
        graph[2].add(new Edge(2,1,1));
        graph[2].add(new Edge(2,3,1));
        graph[2].add(new Edge(2,4,2));

        // 3 edge
        graph[3].add(new Edge(3,2,1));
        graph[3].add(new Edge(3,1,3));

        // edge 4
        graph[4].add(new Edge(4, 2, 2));


        // lets print neighbours of each vertex
        for(int i=0;i<graph.length;i++){
            
            System.out.print("Neighbours of "+i+" are -> ");
            for(int j=0;j<graph[i].size();j++){
                Edge e = graph[i].get(j);
                System.out.print(e.des+" ");
            }
            System.out.println();
        }
        



    }
}
