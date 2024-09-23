public class D_addLast{
    Node head;
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public void addLast(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            return;
        }
        //for adding an element from last side(right) of linked lst 
        //we have to create a dummy node which will be intialyy pointing to head and then we will traverse this node on our linked until our dumy node reaches at last node after we have to add this newNode
        Node curNode = head;
        while(curNode.next!=null){//as the value after last node is going to be null,so it means that when we reach at this last node then we iwill break our loop

            curNode = curNode.next;
        }
        //as we reach at our last node then we make its next element  our newnode
        curNode.next = newNode;//so it is added in the list from lastSide

    }

    public static void main(String args[]){
        D_addLast list = new D_addLast();

        //lets add first elemnt in linked list
        list.addLast(5);

        //lets add other elements from right side of list 
        list.addLast(8);//5,8
        list.addLast(15);//5,8,15
        list.addLast(23);//5,8,15,23
        list.addLast(28);//5,8,15,23,28
    }
}