import java.util.*;
public class B_detectCycleII{
    Node head;
    public class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next=null;
        }
       

    }
     public void addLast(int data){
            Node newNode = new Node(data);
            if(head==null){
                head=newNode;
                return;
            }
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;
        }
        public void createCycle(){
            //lets make a cycle from last node to second node
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=head.next;
        }
        public Node detectNode(){
            //first of all we check whether cycle is present.For this we will use same approach as we do in previous program we will run slow and fast pointers if they meet at any point then it means that cycle is present.
            Node slow=head;
            Node fast = head;
            while(fast!=null && fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
                if(slow==fast){
                    break;
                }
            }
            //now we will check that why we come out of our loop whet fats pointer reaches at null or slow and fast reaches at same point showing that cycle is present
            if(slow==fast){
                //now if we come here we know that cycle is present in list.And now we have to fid starting point of this cycle.
                //To do this there is a mathematical approach which say that if we run two pointer one from head and other from that point where our slow and fast pointer  meetup while detecting a cycle and then start moving these two pointers one step ahead,then there will be a point at which these both pointers will meetup and this meetup point will be our startign node.
                //lets place our slow pointer at head and then start moving these two pointers fast and slow one step each time
                slow=head;
                while(slow!=fast){
                    fast = fast.next;
                    slow = slow.next;
                } 
                //now we will return any of these two pointers as our resultant node
                
            }
            return slow;
        }
    public static void main(String args[]){
        B_detectCycleII list = new B_detectCycleII();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        list.createCycle();
        //Here we have to find that from which node our cycle starts.Here as we have started our cycle from second node.But we have to find it through code.
        Node res = list.detectNode();
        System.out.print(res.data);
    }
}
