import java.util.*;
public class M_TreeSet{
    public static void main(String args[]){
        //TreeSet are also like hashSet the difference is that they maintain data in sorted(ascending) order. NULL value is not allowed to insert in treemap bcz treemap has to compare elements to maintain their order and null is not a value so it cannot be compared to other values to maintain order.
        //add/remove operations have time complexity of O(logn) due to sorting operations.

        //lets create a treeSet and insert some values
        TreeSet<Integer> tSet = new TreeSet<>();
        tSet.add(3); 
        tSet.add(1); 
        tSet.add(2); 
        tSet.add(56); 
        tSet.add(30);
        
        Iterator itr = tSet.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+" ");// we will see output will be in ascending order 1 2 3 30 56
        }
    }
}