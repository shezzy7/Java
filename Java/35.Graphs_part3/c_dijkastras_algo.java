import java.util.*;

public class c_dijkastras_algo {
    
    static class Edge{
        int src,dest,weight;
        public Edge(int src,int dest , int weight){
            this.src = src;
            this.dest = dest;
            this.weight = weight;
        }
    }
    public static void create_graph(ArrayList<Edge> Graph[]){
        for(int i=0;i<Graph.length;i++){
            Graph[i] = new ArrayList<>();
        }

        Graph[0].add(new Edge(0, 1, 2));
        Graph[0].add(new Edge(0, 2, 4));
        Graph[0].add(new Edge(0, 3, 4));

        Graph[1].add(new Edge(1, 2, 1));
        Graph[1].add(new Edge(1, 3, 7));

        Graph[2].add(new Edge(2, 4, 3));

        Graph[3].add(new Edge(3, 5, 1));

        Graph[4].add(new Edge(4, 3, 2));
        Graph[4].add(new Edge(4, 5, 5));




        


    }
    static class Pair implements Comparable<Pair>{
        int src , d;
        public Pair(int v , int d){
            this.src = v;
            this.d = d;
        }

        @Override
        public int compareTo(Pair p2){
            return this.d-p2.d;
        }
    }
    public static void dfs(ArrayList<Edge>Graph[] , int src){
        int distances[] = new int[Graph.length];
        // set distances for each node from src.At first we will set infinite distance for each so that at first time we can compare distance of current path with distance already node have, and we can update it with our new value
        // we will set distances of src from itself as 0 bcz it is 0
        for(int i=0;i<Graph.length;i++){
            // distance for src should be 0 and for all other should be positive infinity as we have to compare it later.
            if(i==src){
                distances[i]=0;
            }
            else{
                distances[i]=Integer.MAX_VALUE;
            }
        }
        boolean visited[] = new boolean[Graph.length];
        // min distance of a vertex v to vertex u is = min(distce[v]+wieght(v,u) , distance(u))
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(src,0)); //distance of src will be 0 to itself
        while(!pq.isEmpty()){
            Pair p = pq.remove();
            if(!visited[p.src]){
                
                visited[p.src]=true;
                for(int i=0;i<Graph[p.src].size();i++){
                    Edge e = Graph[p.src].get(i);
                    
                        if(distances[e.dest]>distances[e.src]+e.weight){
                            distances[e.dest] = distances[e.src]+e.weight;
                            if(!visited[e.dest]){

                                pq.add(new Pair(e.dest, distances[e.dest]));
                            }
                        }
                        
                    
                    
                }
            }
        }
        for(int i=0;i<distances.length;i++){
            
            System.out.println(src+"----"+distances[i]+"--->"+i);
        }



    }
    
    public static void main(String args[]){
        int V = 6;
        ArrayList<Edge> Graph[] = new ArrayList[V];
        create_graph(Graph);

        /*  Dijkstra's Algo
            🧠 Imagine this:
                You're on a bicycle 🚴 and you're in a town full of roads and houses. You want to go from your house to your friend’s house, but you want to take the fastest way (the one that takes the least time or distance).
                But here’s the twist:
                    The town has lots of roads of different lengths.
                    Some roads are short, some are really long.
                    And you can go through different houses and paths to reach your friend.

            💡 So how do you find the shortest way?
                That’s where Dijkstra’s Algorithm comes in. It’s like a magic notebook that helps you remember:
                i-How far every house is from your own.
                ii-Which path you took to get there.
                
            🪄 Here's how Dijkstra works (like steps in a game):
                Start at your house 🏠 (we call this the source).

                Write in your notebook:
                    i- "I am at my house. Distance = 0"
                    ii- For every other house: "I don’t know how far yet, so I’ll write ∞ (infinity)."
                    iii- Now, look at all the roads going from your house. For each neighbor, write down how far it is from you.
                    iv-  Choose the closest house you haven’t visited yet, and go there.

                At each house:

                    i- Look at all the roads going out from it.
                    ii- If going through this house gives a shorter path to other houses, update the distance in your notebook.

                Repeat this:
                    i- Always go to the nearest unvisited house.
                   ii- Update distances if you find a better way.

                When you finally reach your friend’s house, the notebook will tell you:

                    i- “Here’s the shortest distance.”

                    ii- And if you traced back, you’d see which way you came!
                📦 Real-World Use:
                        Google Maps 🗺️
                        GPS Navigation 🛰️
                        Games (finding shortest path to enemies or treasures) 🎮



        */

        // So here we will find shortest path from a source vertex to each other vertex.And for this purpose we will use a modifies DFS.

        // we will use dijkstra's algo's approach given above
        int src=0;
        dfs(Graph,src);


    }
}
