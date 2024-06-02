import java.util.*;
public class I_removeNthNodefromLast{
    int size;
    Node head;
    public I_removeNthNodefromLast(){
        size=0;
    }

    public class Node{
        int val;
        Node next;
        public Node(int val){
            this.val = val;
            this.next=null;
            size++;
        }
        
    }
    //add elements 
    public void addLast(int val){
            Node newNode = new Node(val);
            if(head==null){
                head=newNode;
                return;
            }
            Node curNode = head;
            while(curNode.next!=null){
                curNode = curNode.next;
            }
            curNode.next=newNode;

        }
    public void removeNth(int n){
        if(n>size){
            System.out.print("OOps! n is greater then size of list");
            return;
        }
        if(size==1){
            head = null;
            return;
        }
        if(n==size){//if we have to remove head
            head=head.next;
            return;
        }
        Node temp = head;
        for(int i=1;i<size-n;i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
    }
    public void print(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        I_removeNthNodefromLast ll = new I_removeNthNodefromLast();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);
        System.out.print("Enter number of node : ");
        int n = sc.nextInt();
        ll.removeNth(n);

        ll.print();
        
    }
}