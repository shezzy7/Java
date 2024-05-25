public class b_Head_Tail{
    public static class Node{
        //Each linked list has two types of special nodes one is Head node and other is Tail.Head is the most first Node of Linked list and Tail is the last node of linked list.Last node does not mean null value it means Last node that has some value after which null value occurs in linked list.
        //Whenever we ahve to tackle with linked list then we are given only one node of that list  mostly is head node and we can traverse on linked list using this node as this node contains the address of next node and when we reach on next node then this next node contains adress of its next node ans so on.So to perform some operations on linked list we just need Head node of that linked list.
        //When there is only one node in linked list , then it is Head and Taill of linked list.And its next is null. 

        int data;
        Node next;
    }
    public static Node head;
    public static Node tail;


    public static void main(String args[]){
        
    }
}

