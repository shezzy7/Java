import java.util.*;
public class E_BFS {
    static class Edge{
        int src , des , weight;
        public Edge(int src , int des , int weight){
            this.src = src;
            this.des = des;
            this.weight = weight;
        }
    }
    public static void buildGraph(ArrayList<Edge> graph[]){
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

    }

    public static void BFS_Traversal(ArrayList<Edge>[] graph){
        // Unlike Trees in Graphs there's no specific starting node.We can take start from any node to traverse.The reason is that in trees we have parent child combination,when we are present at a child then we can't access its parent from it.But in graph there is node parent child combination.We can go to any vertex from anyother vertext.
        // Ulike trees in graphs Cycle's can be created.If we try to traverse over a graph then we can stuck in an infinite loop bcz cycle can be present there.To avoid this we can track visiting of each vertext when we visit a vertext we can set it as visited for this purpose we can use an array of boolean type.Where we will track visit status of each vertex.
        // For Breadth firsr traversel we will be using a Queue.In this queue we will first of all push our starting vertex's value then we will run a loop over this queue which will run until our queue becomes empty.We will pick our starting vertex from queue and will check if it has some neighbours then we will push all of them in queue and will set this vertex's as visited in boolean array.And then we will move forward and will reapeat the above process.If at any place we found a vertex who visiting value is true we will be not storing its neighbours in our queue as we have visited this vertex earlier and if we don't skip it then it will make our loop run infinitely as it is making a cycle in graph.
        Queue<Integer> q   = new LinkedList<Integer>();//In java queue is implemented with the help of linkedlist so we initialize it with the help linkedlist's constructor.
        boolean visited[] = new boolean[graph.length];
        // here we are taking 0 as our starting vertex
        q.add(graph[0].get(0).src);
        
        // lets start the main process
        while(!q.isEmpty()){
            int curr = q.remove();
            // check whether it is visited earlier 
            if(!visited[curr]){
                for(int i=0;i<graph[curr].size();i++){
                    q.add(graph[curr].get(i).des);//push all of its neighbours in the queu
                }
                // set is as visited
                visited[curr] = true;
                System.out.print(curr+" ");
            }
        }

    }

    public static void main(String args[]){
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

        ArrayList<Edge>[] graph = new ArrayList[5];

        for(int i =0;i<graph.length;i++){
            graph[i]=new ArrayList<Edge>();
        }

        buildGraph(graph);

        // Make Traversal
        BFS_Traversal(graph);
    }
}
