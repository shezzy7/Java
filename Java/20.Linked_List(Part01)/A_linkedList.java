
        
    //Linked List is most important data structure.In this elemenrs are present in the form of nodes.In this elements are present in no contiguous memory.And their size is variable.
    //Time complexity for Inserting a node in linked list is O(1)
    //And for searching operation it has time complexity of O(n)
    //So due this reason whenever we need many time insertin in elements then we prefer likedlist over arraylist  and when we have to search some element then we prefer arraylist over linked list. 
        //Linked list is like a chain of elements connected togehter through some links.Each element in linked list is called a Node.
        //Each node has two parts.One part contains data(value) and 2nd part contains reference to next node(address of next connected node).
        //For defining a linked list we need to make class and then create nodes using objects of this class

    // Types:-There are three types of linked list 
    //      i- Singular Linked List :-
                     // Linked list in which each node has oly address of its next node.And at some node this list enede and null comes after this last node.
    //     ii- Doubler Linked List :-
                    // In doubler linked list each node has two adresses its next node address and its previous nodes address.And there is also null values after ending node.
    //    iii- Circular Linked List :-
                    // In circular Linked list there is a node which is connected to its prevoius node.So due to this this type of linked list don't have a null value it does not ended at any node.

  
        //Head and Tail
        //Each linked list has two types of special nodes one is Head node and other is Tail.
        //Head is the most first Node of Linked list and Tail is the last node of linked list.Last node does not mean null value it means Last node that has some value after which null value occurs in linked list.
        //Whenever we have to tackle with linked list then we are given only one node of that list  mostly is head node and we can traverse on linked list using this node as this node contains the address of next node and when we reach on next node then this next node contains adress of its next node ans so on.So to perform some operations on linked list we just need Head node of that linked list.
        //When there is only one node in linked list , then it is Head and Taill of linked list.And its next is null. 
        
