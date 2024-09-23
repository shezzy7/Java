import java.util.*;
public class b_implByArrays{
    static class Queue{
        static int arr[];
        static int size;
        static int rear;//var to track index of back side
        Queue(int n){
            arr = new int[n];
            size=n;
            rear = -1;
        }

        //isEmpty   O(1)
        public static boolean isEmpty(){
            return rear == -1 && front==-1;
        }
        //add   O(1)
        public static void add(int data){
            if(rear == size-1){
                System.out.print("Cannot add more elements as Queue is full now");
                return;
            }
            rear++;
            arr[rear] = data;
        }

        //remove    O(n):works in O(n) as we have to move all the elements one step ahead after removing first element from stack.
        public static int remove(){
            if(isEmpty()){
                System.out.print("Queue empty");
                return Integer.MIN_VALUE;
            }
            int front = arr[0];
            for(int i=0;i<rear;i++){
                arr[i] = arr[i+1];
            }
            rear--;//an element has been removed now decrease the size of our stack/position of last element.
            return front;
        }

        //peek   O(1)
        public static int peek(){
            if(isEmpty()){
                 System.out.println("Queue empty");
            }
            return arr[0];
        }

    }
    public static void main(String args[]){
        //Queue can be implemented by using arrays but it has some cons.One is that arrays are of fixed size and second one is that we can perform our removing operation in time complexity of O(n).
        //But it also a pros that says we implement circular queue by using arrays

        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.peek());//1
        //let print our whole queue
        while(!q.isEmpty()){
            System.out.print(q.peek()+"->");
            q.remove();
            
        }
        System.out.print("null");
    }

}