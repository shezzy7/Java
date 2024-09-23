import java.util.*;
public class F_zigzag{
    Node head;

    public class Node{
        Node next;
        int data;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    //add last
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

    public void printList(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public void zigZag(){
        //Approach: we will solve this problem in 3 steps 
        //find mid node
        Node slow=head;
        Node fast=head.next;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        Node mid = slow;
        

        //reverse 2nd half of the list
        Node cur=mid.next;
        mid.next=null;
        Node prev=null;
        while(cur!=null){
            Node curNext=cur.next;
            cur.next=prev;
            prev=cur;
            cur=curNext;
        }
        //merge both of these list
        Node lHead=head;
        Node rHead=prev;
        Node lNext;
        Node rNext;
        while(lHead!=null && rHead!=null){
            lNext=lHead.next;
            lHead.next=rHead;
            rNext=rHead.next;
            rHead.next=lNext;
            lHead=lNext;
            rHead=rNext;
        }

    }
    public static void main(String args[]){
        //we are given a sigly linked list and we to convert it to a zigzag list like that LL(1)->LL(N)->LL(2)->LL(N-1)->LL(3)->(N-2)......
        //mean first node will point to last node,last node will point to 2nd node ,2nd node will point to second last node and so on..

        F_zigzag LL = new F_zigzag();
        LL.addLast(1);
        LL.addLast(2);
        LL.addLast(3);
        LL.addLast(4);
        LL.addLast(5);
        LL.addLast(6);
        LL.printList();
        LL.zigZag();
        LL.printList();
    }
}