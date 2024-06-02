public class K_reverseLL{
    Node head;
    int size;
    public K_reverseLL(){
        size=0;
    }
     
    public class Node{
        int value;
        Node next;
        public Node(int value){
            this.value = value;
        }

    }

    public void addFirst(int value){
        Node newNode = new Node(value);
        if(head==null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void print(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value+"->");
            temp = temp.next;
        }
        System.out.println("null");

    }

    //reversing linked list
    public void reverseList(){
        if(head==null || head.next==null){
            return;
        }
        Node prev = null;
        Node curr = head;
        while(curr!=null){
            Node nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        head = prev;
    }

    public static void main(String args[]){
        K_reverseLL list = new K_reverseLL();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);
        list.addFirst(5);
        list.addFirst(6);
        list.addFirst(7);
        //lets print original list
        System.out.print("List before : ");
        list.print();
        //lets reverse list
        list.reverseList();
        //now lets print list after reversing
        System.out.print("List after : ");
        list.print();
    }
}