public class LL{
    //define head
    Node head;
    class Node{
        //Each linked list has two types of special nodes one is Head node and other is Tail.
        //Head is the most first Node of Linked list and Tail is the last node of linked list.Last node does not mean null value it means Last node that has some value after which null value occurs in linked list.
        //Whenever we ahve to tackle with linked list then we are given only one node of that list  mostly is head node and we can traverse on linked list using this node as this node contains the address of next node and when we reach on next node then this next node contains adress of its next node ans so on.So to perform some operations on linked list we just need Head node of that linked list.
        //When there is only one node in linked list , then it is Head and Taill of linked list.And its next is null. 

        int data;
        Node next;//It is a recursive attribute(attribute o a class which is of this class type.Usually it is used when we have to store addresses of next elements in linked list,tree,graph etc)

        //lets create a consttructor of this class
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    //now  lets add element at startinng side of list
    public void addFirst(int data){

        Node newNode = new Node(data);
        if(head==null){//firsst of all if there no head present already in list then we will make this newNode our head and return from this position.
            head=newNode;
            return;
        }
        //if there was a head prsentt already in list and as we want ton nadd this newNode at first position of list so we make it our head 
        newNode.next=head;
        head=newNode;
    }

    //adding nodes at last
    public void addLast(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node curNode = head;
        while(curNode.next!=null){
            curNode=curNode.next;
        }
        curNode.next=newNode;

    }
    //print linked list
    public  void printList(){
        if(head==null){
            System.out.println("Null");
            return;
        }
        Node curNode = head;
        while(curNode!=null){
            System.out.print(curNode.data+" ");
            curNode = curNode.next;
        }
        System.out.println();
    }

    public  static void main(String args[]){

        //for definig a linked list we have to make an object f our main class
        //syntax -> mainClassName listName = new mainClassName();
        LL list = new LL();

        list.addFirst(5);
        //lets add another element at 1st position
        list.addFirst(4);
        list.addFirst(3);

        //now lest print our linked list
        list.printList();

        //lets add some nodes from ending side of linked list
        list.addLast(6);
        list.addLast(7);
        
        //now lest print our linked list
        list.printList();

    }
}

