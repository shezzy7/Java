import java.util.*;
public class K_Iteration{
    public static void main(String args[]){
        //first lets create a hashset and add some values to it
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(4);
        set.add(8);
        set.add(12);

        //we can iterate over hashsets using two methods one is by using iterators and other is using enhanced for loop.
        //Iterator is a interface in java. 
        //syntax -> Iterator itName = setName.iterator();
        //this itName will be used as iterator.First of all it is present at some null/dummy value but its next will be hashset values.
        Iterator itr = set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
            //as we print itr.next this will go to next value automaticlly and also return it
        }

        // we can also iterate over set using for each loop
        for(int ele : set){
            System.out.print(ele + " ");
        }
        
    }
}