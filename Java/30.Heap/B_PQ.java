//first we have to add PQ from utilities
import java.util.Comparator;
import java.util.PriorityQueue;
public class B_PQ{

    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        //by default in PQ of Integer data type , priority is setted.And gives priority to smallest value and then goes on decreasing by highest values
        pq.add(3);//3      //O(logn)
        pq.add(4);//3,4
        pq.add(1);//1,3,4
        pq.add(7);//1,3,4,7
        System.out.print("Priority from lower to higher values : ");
        while(!pq.isEmpty()){
            System.out.print(pq.peek()+" ");//O(1)
            pq.remove();//O(logn)
        }
        //So here as we see priority is given to smaller values but if we want to give priority to higher values then we pass a comparator in PQ while initializing it,like
        PriorityQueue<Integer> pq2 = new PriorityQueue<>(Comparator.reverseOrder());
        //now if we add values then they will get priority by higher to values values.
        pq2.add(3);//3      //O(logn)
        pq2.add(4);//4,3
        pq2.add(1);//4,3,1
        pq2.add(7);//7,4,3,1
        System.out.print("\nPriority from higher to lower values : ");
        while(!pq2.isEmpty()){
            System.out.print(pq2.peek()+" ");//O(1)
            pq2.remove();//O(logn)
        }



    }
}