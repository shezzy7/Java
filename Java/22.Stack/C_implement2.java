//now lets implement stack from scracth using linked list
public class C_implement2{
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static class Stack{
        static Node head;
        public Stack(){
            head=null;
        }

        public static boolean isEmpty(){
            return head==null;
        }

        //push
        public static void push(int data){
            Node newNode = new Node(data);
            if(head==null){
                head = newNode;
                return;
            }
            //as we add add elements in stack from top so we will add nodes from first side
            newNode.next = head;
            head = newNode;
        }

        //pop
        public static int pop(){
            if(isEmpty()){
                //if stack is already empty then we will return -1
                return -1;
            }
            int val = head.data;
            //in pop mehtod we remove top of stack,so we will remove head and move head one step ahead
            head = head.next;
            return val;
        }

        //peek
        public static int peek(){
            //in peek method we just get value of top of stack
            if(isEmpty()){
                //if stack is empty the we will return -1
                return -1;
            }
            return head.data;

        }
    }

    public static void main(String args[]){
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        //now lets print
        while(!s.isEmpty()){
            System.out.print(s.pop()+" ");
        }
    }
}