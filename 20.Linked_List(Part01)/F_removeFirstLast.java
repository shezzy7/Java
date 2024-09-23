public class F_removeFirstLast{
    Node head;

    public class Node{
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
            head= newNode;
            return;
        }
        Node curNode = head;
        while(curNode.next!=null){
            curNode = curNode.next;
        }
        curNode.next = newNode;
    }

    public void removeFirst(){
        //first of all we will check whether our list is empty or not if empty then we don't have any any node to remove then we will just return.
        if(head==null){
            System.out.print("Linked List is empty!");
            return;
        }
        //For removing our first node we will just move our head one step forward as our head is present at very first node of linked list
        head = head.next;
    }

    public void print(){
        if(head==null){
            System.out.print("Lit is empty!");
            return;
        }
        Node curNode = head;
        while(curNode!=null){
            System.outt.print(curNode.data+" ");
            curNode = curNode.next;
        }
    }
    public void removeLast(){
        if(head==null){ //corner case
            System.out.print("List is empty!");
            return;
        }
        //first of all we have to reach at second last node of our linked list
        //but before this we may assume if there is only single node inn our list then we will jsut make it null
        if(head.next==null){//corner case
            head = null;
            return;
        }
        //  here to find second last node of list we will define two nodes.In which one node will be 
        // pointing to head and second will be poing to head.next. And then we will run loop  in 
        // which we will move these two pointers one step forward each time.And we will go on moving 
        // until our second node reaaches at last node and when this second node will reach at last 
        // node then our first node which is one step behind from this will be at second last node and
        //  we will make this seconLast nodes next null.So in this case our last node will be removed 
        //  from our list and will be stored in java garbage collection 
        Node secondLastNode = head;
        Node lastNode = head.next;
        while(lastNode.next!=null){
            lastNode = lastNode.next;
            secondLastNode = secondLastNode.next;
        }
        secondLastNode.next = null;
    }
    public static void main(String args[]){
        F_removeFirstLast list = new F_removeFirstLast();
        list.addLast(15);
        list.addLast(12);
        list.addLast(19);
        list.addLast(114);
        //now we have list 15,12,19,114
        //lets print our list
        list.print();
        //noe lets remove frist element 15 from our list
        list.removeFirst();
        //now our linked list has become 12,19,114
        //lets print our list 
        list.print();
        //now lets remove lastNode from our linked list
        list.removeLast();
        //now lets print our list
        list.print();
        


    }
}