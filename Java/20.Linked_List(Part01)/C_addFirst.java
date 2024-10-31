public class C_addFirst{
    Node head;
    public class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
        }
        //as onward from first addition in our list our head no more null so we have to add furthure elements in list
        //As our sended value to this has become a node now and we want to add them from first side so we will do it as 
        newNode.next = head;
        head=newNode;
        //we have done what?we have just stored adress of head as next value adress in newNode and then setted thid newNode as our head.
        //now as we add as many elements as we want all those will be added in list from first side.

    }
    public void printList(){
        // while(head!=null){
        //     System.out.print(head.data+ " ");
        //     head = head.next;
        // }
        System.out.print(head.data+  " ");
        System.out.print(head.next.data+  " ");
        System.out.print(head.next.next.data+  " ");
        System.out.print(head.next.next.next.data+  " ");
        System.out.print(head.next.next.next.next.data+  " ");
        System.out.print(head.next.next.next.next.next.data+  " ");
        System.out.print(head.next.next.next.next.next.next.next.next.data+  " ");
        System.out.print(head.next.next.next.next.next.next.next.next.data+  " ");
    }

    public static void main(String args[]){
        C_addFirst list = new C_addFirst();
        //lets set our head's value
        list.addFirst(6);//first of all as our head is null so this 6 will become value of head.
        //lets add further elements in list and we want to be added from left side of list.Mean from firstside of list.For example if list has two elements 5,6 and we want to add to add 4 from first side then it will be added as 4,5,6
        list.addFirst(5);
        //lets add some other elements
        list.addFirst(4);//4,5
        list.addFirst(3);//3,4,5
        list.addFirst(2);//2,3,4,5
        //now our list has become as -> 2,3,4,5,6
        // lets print our list
        list.printList();

    }
}