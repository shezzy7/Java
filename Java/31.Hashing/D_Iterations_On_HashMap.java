import java.util.*;
public class D_Iterations_On_HashMap{
    public static void main(String args[]){
        //For iterating a HashMap we use a set.Set is discussed in later topics.But for this cncept we are just using set.
        //In this set we will store key of our hashmap and we will iterater on hashmap using these keys stores in set
        //syntax -> Set<keyDataType> setName = HashMapName.keySet(); this stoe al the keys of any particular hashmap
        //lets create a hashmap
        HashMap <String,Integer> hs = new HashMap<>();
        //Inserting some values in it
        hs.put("Phy",75);
        hs.put("Chem",82);
        hs.put("Bio",77);
        //Now lets store its keys in a set
        Set<String> hashKeys = hs.keySet();
        //we can also  print all thee keys present in this set
        System.out.println(hashKeys);//These keys will be in random order.
        //Now lets iterate over hashmap using for each loop
        for(String k : hashKeys){
            System.out.println("Key : " + k + ", Value -> " + hs.get(k));
        }
        
    }
}