//Either we can import java.util.HashSet in our code to use hashset or universal library.
import java.util.HashSet;
public class J_HashSet{
    public static void main(String args[]){
        // HashSet :- HashSet is just like HashMap.But it has some its own properties like: HashSet does not contains duplicates.It stores keys only not key,value pairs(single value).All the keys inserted in it are present in unordered form.NULL is allowed in it.HashSet is implemented by hashmap.
        //Syntax -> HashSet<dataType> setName = new HashSet<>();
        HashSet<Integer> set = new HashSet<>();
        //Operations:- HashSet has three major operations 
        // i-add(key) -> to add some key in hashset
        //ii-contains(key) -> to check prescence of a key in our hashset
        //iii-remove(key) -> to remove any key from set
        //All of these operations contain time complexity of O(1)
        
        //lets ads some keys in it
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        //lets print it
        System.out.println(set);

        //lets try to insert some duplicates to check whether HashSet repeates them or not
        set.add(2);
        set.add(1);
        System.out.println(set);

        //now lets check presence of any key in our set
        System.out.println(set.contains(2));//this will return true if key is present in our set else false will be returned
        System.out.println(set.contains(6));

        //now lets remove some keys from set
        set.remove(3);
        System.out.println(set);

        //we can also check size of our set
        System.out.println(set.size());
        //we can also check whether our hashSet is empty or not
        System.out.println(set.isEmpty());//this will return true if empty else false will be returned
        //we can also clear our set by a built in method
        set.clear();
        //now lets check size of our set it will be 0 bcz our set is clear now
        System.out.println(set.size());
        
    }
}