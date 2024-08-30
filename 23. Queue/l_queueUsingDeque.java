import java.util.*;
public class l_queueUsingDeque{
    static class Queue{
        Deque<Integer> deq = new LinkedList<>();
        
        //add
        public void add(int data){
            deq.addLast(data);
        }
        //remove
        public int remove(){
            if(deq.isEmpty()){
                System.out.println("Queue empty");
                return Integer.MIN_VALUE;
            }
            return deq.removeFirst();
        }
        //peek
        public int peek(){
            if(deq.isEmpty()){
                System.out.println("Queue empty");
                return Integer.MIN_VALUE;
            }
            return deq.getFirst();
        }
        //isEmpty
        public boolean isEmpty(){
            return deq.isEmpty();
        }
    }
    public static void main(String args[]){
        Queue q = new Queue();
        System.out.println("Queue empty ? "+q.isEmpty());
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        while(!q.isEmpty()){
            System.out.print(q.peek()+" ");
            q.remove();
        }

    }
}