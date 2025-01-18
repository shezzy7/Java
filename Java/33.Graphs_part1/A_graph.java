public class A_graph {
    
    /*  Graph:-A graph is a network of nodes , in which multiple node are connected tohether with help of edges.Each node in graph is called vertex, and each connecting line connecting a vertex to other is called edge.
     Graph is implemented in many application like google maps etc.

      Types of edges:-
        Edges can be Uni-directional Or Bi-directional.Uni directional mean we can go from one vertix to other but can't from second to first vertix.In Bi-directional edges we can to both vertices from any vertix.Uni directional are like one way road , while bi-directional are like two way road.We also call bi-directional as un-directed edges.

        Each edge can contain some weight(+ve/-ve).Graphs those edges contain some weight are called weighted graphs and others are called un-weighted graphs.Weight can be positive or negative.So can see them in pics given here.
        Weight is not like kgs etc.It is just a value setted for a specific edge connecting to vertices.

        Representation:-
          We can represent graphs in many ways.
          i-Adjacency List:-List of lists
              In this method we represent  a graph in such a way tha we create a list which contains all the vertices in it.And each element in this list contains a list of all the neighbours connected to it.
              Basically we store info of edges for each vertix.Starting position of a edge,ending position and weight of the edge.
          ii-Adjacency Matrix:-
              In this type of presentation of graph we present our graph in a matrix , where in each cell that a vertex is making with other , we store weight of edge,so that we can see that this vertex is connected to which other vertices and what is weight of each edge
              In the graph below is vertex 0 is connected to 1,1 is connected to 4 and 3,with weights 4,1,2 respectively.

                   0
                  /4 
                 1  
               1/ \2
               4   3

               If we have to respresnt this graph in adjacency matrix then we will present it as follows:

                  0     1     3     4
                ----------------------
              0 | 0  |  4  | 0  |  0
                |---------------------
              1 | 4  |  0  | 2  |  1
                |---------------------
              3 | 0  |  2  | 0  |  0
                |---------------------
              4 | 0  |  1  | 0  |  0



              iii-Edge list:-
                 In an edge list representation, we store information about the edges of
                 the graph. This information typically includes the starting position (or vertex) of
                 an edge, the ending position (or vertex) of that edge, and optionally the weight of
                 that edge.

                       0
                      /4 
                     1  
                   1/ \2
                   4   3

                 we will present this as follows-> {{0,1,4},{1,4,1},{1,3,2}}
                 In this list ,each element is containing info of each edge.Starting position of that edge,ending position and weight respecively.
                 This presentation of graph is helpfull for sorting and some specific conditions else this is not advisible.

              iv-Implicit Graph
               



              

     */
    
}
