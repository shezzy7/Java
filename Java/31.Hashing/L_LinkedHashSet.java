import java.util.*;
public class L_LinkedHashSet{

    public static void main(String args[]){
        // LinkedHashSet is a type of hashset.The difference is that data is present in it in the form in which it was inserted to linkedHashSet.So when we have to use hashset and also want to maitain order of insertion then we use LinkedHashSet.
        //Performance of LHS is less then HS in some cases.So when we don't need to maintain order of insertion then we shouldn't use LHS.
        //lets create a simple hashSet and a linked hashset and insert same values in same order and then print both sets to check order
        HashSet<String> cities1 = new HashSet<>();
        cities1.add("Multan");
        cities1.add("Lahore");
        cities1.add("Karachi");
        cities1.add("Islamabad");

        LinkedHashSet<String> cities2 = new LinkedHashSet<>();
        cities2.add("Lahore");
        cities2.add("Multan");
        cities2.add("Karachi");
        cities2.add("Islamabad");
        System.out.println("Data of HashSet");
        for(String data : cities2){
        System.out.print(data +" ");
        }
        System.out.println();
        System.out.println("Data of LinkedHashSet");
        //lets print it using iterator
        Iterator itr = cities2.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next() + " ");
        }
        //here data of hashset may or may not be in insertion order but data of of linkedhashset will be in insertion order.
    }
}