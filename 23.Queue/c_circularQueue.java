import java.util.*;
public class c_circularQueue{
    //We can also implement circular queue using arrays.The benefit of circular queue is that we can remove element from queue in O(1) instead O(n)

    static class Cqueue{
        static int size;
        static int rear;
        static int front;
        static int arr[];
        public Cqueue(int n){
            size = n;
            rear = -1;
            front = -1;
            arr = new int[n];
        }

        public static boolean isFull(){
            return (rear+1)%size==front;//if our front is presnt just after our rear then it means that our queue has been filled.
        }
        public static boolean isEmpty(){
            return front==-1 && rear==-1;
        }

        public static void add(int data){
            if(isFull()){
                System.out.println("Cannot add more elements bcz queue is full now");
                return;
            }
            if(isEmpty()){//at additon of first element
                front++;
            }
            rear = (rear+1)%size;//place rear at fine position as rear may be at last index of array then in this case we will shift at 0 index and then from there so on 
            arr[rear]=data;

        }

        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is already empty");
                return Integer.MIN_VALUE;
            }
            int res = arr[front];
            if(front==rear){//if our front index becomes equall to our rear index then it means that current element is the last element in oue queue so now we show our queue as empty.
                front=rear=-1;
            }
            else{
                
                front = (front+1)%size;//else increase place front one index ahead as current element of front has be removed from queue.
            }
            return res;
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue already empty");
            }
            return arr[front];
        }
    }
    public static void main(String args[]){
        Cqueue q = new Cqueue(3);
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.remove());
        q.add(4);
        System.out.println(q.remove());
        q.add(5);
        while(!q.isEmpty()){
            System.out.print(q.remove()+" ");
        }
    }
}