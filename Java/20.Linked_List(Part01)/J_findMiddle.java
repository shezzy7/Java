public class J_findMiddle{
    Node head;
    private int size;
    public J_findMiddle(){
        size=0;
    }

    public class Node{
        int value;
        Node next;
        public Node(int value){
            this.value = value;
            this.next = null;
            size++;
        }
    }
    //method to add elements in the list from first side
    public void addFirst(int value){
        Node newNode = new Node(value);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next = head;
        head=newNode;
    }
    public Node findMid(){
        //to find a mid of a linked list we use 2 pointer approach in which both are initilized with head.
        //And then we iterate them on our list one is slow and othe is fast.slow moves one step and fast moves 2 steps.And a points comes when our fast reaches at null or fast.next becomes null.When there are even number of nodes then there comes a point when fast becomes null and if there are odd number of nodes then there comes  point when fast.next becomes null.As we don't know number of eleemts so we have to iterate our list until our fast reaches null or fast.next reaches null.And when this point comes our slow pointer will be at mid of our list
        Node fast = head;
        Node slow = head;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    public static void main(String args[]){

        J_findMiddle list = new J_findMiddle();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);
        list.addFirst(5);
        list.addFirst(6);
        list.addFirst(7);
        list.addFirst(8);
        list.addFirst(9);
        //in this node aas we know the middle node is 4 
        //Now we will find it 
        Node mid = list.findMid();
        System.out.print("Our middle node is at "+mid.value);
    }

}