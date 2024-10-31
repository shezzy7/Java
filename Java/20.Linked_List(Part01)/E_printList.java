public class E_printList{
    
    Node head;
    public class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public void add(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            return;
        }
        Node dummy = head;
        while(dummy.next!=null){
            dummy=dummy.next;
        }
        dummy.next = newNode;
    }
    
    public void printList(){
        //first of all we will make a node which will be pointing to ouur head node as we hane to traverse from our head to or last node
        Node curNode = head;
        while(curNode!=null){//we have to traverse to till last node our our list
            //for getting value of any node we have following syntax ->NodeNaem.data
            System.out.print(curNode.data+" ");
            //after printing our curNode we have to move to our next node
            curNode = curNode.next;
        }

    }

    public static void main(String args[]){
        E_printList list = new E_printList();
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        list.add(15);
        //now lets print this list
        list.printList();
    }
}