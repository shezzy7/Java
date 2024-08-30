import java.util.*;
public class i_queueReversal{
    public static void reverseQueue(Queue<Integer> q){
        //we are given a queue we have to reverse it
        //for example if elements in it are in order 1,2,3,4,5 then we have to reverse them like as 5,4,3,2,1
        
        //Approach:- for reversing a queue we can use a stack.In this stack we will put all the elements of queue and then from this stack we will put our elements back into queue and our elements will be in reversed order now
        Stack<Integer> s = new Stack<>();
        //inserting queue's elements to stack
        while(!q.isEmpty()){
            s.push(q.remove());
        }
        //inserting stacks element back to queue
        while(!s.isEmpty()){
            q.add(s.pop());
        }
    }
    public static void main(String args[]){
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        reverseQueue(q);

        //now lets print our queue
        while(!q.isEmpty()){
            System.out.print(q.remove()+" ");
        }
    }
}