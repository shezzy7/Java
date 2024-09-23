import java.util.*;
public class E_mergeSort{
    public static Node head;

    public class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next=null;
        }
    }
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            return ;
        }
        newNode.next=head;
        head=newNode;
    }
    public void printList(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;

        }
        System.out.println("null");
    }

    //find mid
    public Node findMid(Node head){
        Node slow=head;
        Node fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    //merging
    public Node merge(Node lHead,Node rHead){
        Node tempList = new Node(-1);
        Node temp = tempList;
        while(lHead!=null && rHead!=null){
            if(lHead.data<=rHead.data){
                tempList.next=lHead;
                lHead=lHead.next;
            }
            else{
                tempList.next=rHead;
                rHead=rHead.next;
            }
            
            tempList=tempList.next;
        }
        while(lHead!=null){
            tempList.next=lHead;
            lHead=lHead.next;
            tempList=tempList.next;
        }
        while(rHead!=null){
            tempList.next=rHead;
            rHead=rHead.next;
            tempList=tempList.next;
        }
        return temp.next;
    }
    //merge Sort
    public Node mergeSort(Node head){
        if(head==null || head.next==null){
            return head;
        }
        Node mid = findMid(head);
        Node rightHead=mid.next;
        mid.next=null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);
        return merge(newLeft,newRight);
    }
    public static void main(String args[]){
        E_mergeSort LL = new E_mergeSort();
        LL.addFirst(1);
        LL.addFirst(19);
        LL.addFirst(5);
        LL.addFirst(4);
        LL.addFirst(20);
        LL.addFirst(15);
        LL.addFirst(19);


        LL.printList();

        LL.head=LL.mergeSort(head);
        LL.printList();
    }
}