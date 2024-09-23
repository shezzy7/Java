import java.util.*;
public class C_removeCycle{
    public static Node head;
    public class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next=null;
        }


    }
    public static boolean detectCycle(){
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                return true;
            }
        }
        return false;
    }
    public static void removeCycle(){
        //first of all we will detect point at which our slow and fast pointers meetup when detecting a cycle.And from this point we willa pointer and a pointer will be runned from head .At which point these pointers will meetupt will be stating point of cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                cycle=true;
                break;
            }
        }
        if(cycle){
            slow=head;
            while(slow.next!=fast.next){
                slow=slow.next;
                fast=fast.next;
            }
            fast.next=null;
        }
        return;


    }
    public static void main(String args[]){
        //We are given a cyclic linked list.We have to remove this cycle from linked list.
        head = new Node(1);
        head.next = new Node(2);
        head.next.next=new Node(3);
        head.next.next.next = head.next;
        //We are given a cyclic linked list.We have to remove this cycle from linked list.
        System.out.println(detectCycle());
        removeCycle();
    }
}