import java.util.*;
public class d_implByLL{
    
    static class Node{
        
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next = null;
        }

    }
    static class Queue{
        static Node head = null;
        static Node tail = null;

    //isEmpty
    public static boolean isEmpty(){
        return head==null && tail==null;
    }
    //push at rear
    public static void add(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            tail = head;
            return;
        }
        tail.next = newNode;
        tail = tail.next;
    }
    //remove from front
    public static int remove(){
        if(head==null){
            System.out.println("Queue already empty");
            return Integer.MIN_VALUE;
        }
        int front = head.data;
        if(head==tail){
            head=tail=null;
        }
        else{
            
        head=head.next;
        }
        return front;
    }
    //get value of front element
    public static int peek(){
        if(head==null){
            System.out.println("Queue already empty");
            return Integer.MIN_VALUE;
        }
        return head.data;
    }
    }


    public static void main(String args[]){
        //Queue can also be implemeneted using Linked list.
        //This question of implementing a queue by using linked list has been asked in a microsoft interview.
        Queue q = new Queue();
        q.add(5);
        q.add(4);
        q.add(3);
        System.out.println(q.peek());
        System.out.println(q.remove());
        q.add(7);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }

    }
}