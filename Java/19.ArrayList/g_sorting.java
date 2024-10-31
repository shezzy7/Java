import java.util.ArrayList;
import java.util.Collections;
public class g_sorting{
    public static void main(String args[]){
        ArrayList<Integer> list  = new ArrayList<>();
        list.add(10);
        list.add(1);
        list.add(60);
        list.add(15);
        list.add(9);
        list.add(20);
        System.out.println("Original list -> "+list);

        //For sorting an ArrayList we cann use sorting techniques which we used in sorting arrays like bubble,insertion,selection,merge,quick etc.
        //We can also sort ArrayList using a built in method
        //Syntax -> Collections.sort(listName);
        //For using collections class we have to  import it first
        //And this method will sort our list in ascending order.
        Collections.sort(list);
        System.out.println("Sorted in ascending order -> "+list);
    
        //we can also sort arraylist in descending order
        //syntax -> Collections.sort(listName,Collections.reverseOrder());
        //here Collections.reverseOrder() is a comparator.Comparator is function in java which defines logic of sorting
        Collections.sort(list,Collections.reverseOrder());
        System.out.println("Sorted in descending order -> "+list);
    }
}