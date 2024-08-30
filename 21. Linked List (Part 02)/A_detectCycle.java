public class A_detectCycle{
    public Node head;

    public class Node{
        int value;
        Node next;
        public Node(int value){
            this.value = value;
            this.next = null;
        }
    }
    public void setNodes(){
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = head.next;//here we connectng last node with the head.next so there is no null value in our list.
    }
    public boolean detectCycle(){
        if(head==null || head.next==null){
            return false;
        }
        //for detecing a cycle we use Floyed's method of detecting a cycle which says if we make two pointers pointing to head initially.And then moving them forward in such a way that at each iteration first pointer takes one step and 2nd pointer takes two steps.If teher is a cycle in list then tehere comes a point when both pointer meetup.So if they meetup theen it mean that there is a cycle in linked list.
        Node slow  = head;
        Node fast  = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        //if no cycle present in the list then there will be a point when fast reaches at null or fast.next reaches at null.And our loop breaks and we will return false.
        return false;

    }
    
    public static void main(String args[]){
        //In cyclic linked list last node is connected to some middle node of the list.So thee is no null value in the list.
        //lets make a cyclicic linked llist first
        A_detectCycle list = new A_detectCycle();
        list.setNodes();
        boolean res = list.detectCycle();
        if(res){
            System.out.print("Cycle present in list");
        }
        else{

            System.out.print("Cycle not present");
        }
    }


}