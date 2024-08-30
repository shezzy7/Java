import java.util.*;
public class h_interLeave{
    public static void printQueue(Queue<Integer> q){
        while(!q.isEmpty()){
            System.out.print(q.peek()+" ");
            q.remove();
        }
        System.out.println();
    }

    //interleave
    public static void interLeave(Queue<Integer> q){
        //we are given an integer queue.we have to inter leave it.
        //for example if we are given a queue 5,6,7,8,9,12 then after inter leaving it should become 5,8,6,9,7,12.
        //Example 2 : 10,11,12,13,14,15   then output should be 10,13,11,14,12,15

        //For inter leaving we will use another queue in this queue we will add first half elements of our input queue and then from this new queue we start interleaving.

        Queue<Integer> firstHalf = new LinkedList<>();
        int size = q.size()/2;
        for(int i=0;i<size;i++){
            firstHalf.add(q.remove());
        }

        while(!firstHalf.isEmpty()){
            q.add(firstHalf.remove());
            q.add(q.remove());
        }
    }
    public static void main(String args[]){
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);
        // System.out.print("Queue before interleaving : ");
        // printQueue(q);

        interLeave(q);
        System.out.print("Queue after interleaving : ");
        printQueue(q);

    }
}