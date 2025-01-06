//first of all for using hashmap in code we have to add library
// import java.util.HashMap;  or
import java.util.*;
public class C_HashMap_Basic_Operations{
    public static void main(String args[]){
        //lets create a hashmap for storing population of some countries with counntry name and population counnt  
        HashMap<String,Integer> map = new HashMap<>();

        //Insert
        //for inserting some value we use 'put' method.Syntax-> HashMapName.put(key,value);
        map.put("Pak",30);
        map.put("Ind",100);
        map.put("China",150);
        //time complexity of 'put' is O(1)
        //if we see output the we will see that data will not be available the sequence in which it was inserted.So it means that data in HashMap does not stored in some particular sequence.It is store in randome sequence.
        System.out.println(map);
        //If we want to update value of some key then we will use same put method where we will write out keyName and new value we want to assign to our Key .For example if we want to update "China"'s population to 130 then
        map.put("China",130);//this will see if any key with same name is existed then it will just change its value,other wise it will add this one also.And it will not create more then one keys with same 
        System.out.println(map);


        //Get:- If we want to get value of any key the we use 'get' method for this
        //Synatx -> HashMapName.get(key);
        //this method returns value with time complexity of O(1)
        System.out.println(map.get("Pak"));
        //if given key is not present in HashMap then this will not generate an error message and null value will be returned
        System.out.println(map.get("USA"));


        //containsKey :- It is used to check prescence of any key in the HashMap
        //Syntax->  HashMapName.containsKey(keyName);
        //It returns true if key is present else false is returned
        System.out.println(map.containsKey("Pak"));//true
        System.out.println(map.containsKey("UAE"));//false
        //we can also store this value in any variable like
        boolean a = map.containsKey("Ind");


        //remove:- It is used to remove any (key,value) pair from HashMap.After removing it also return value of that key.
        //syntax->  hashMapName.remove(keyName);
        //And if given key is not present in the hashMap then no error will be generated only null value will be return
        System.out.println(map.remove("China"));//key,value pair will be also removed and value of this key will be also returned
        System.out.println(map.remove("Afg"));//null
        //let print our whole hashmap now 
        System.out.println(map);

        //size:- This method is used to get size of hashmap.It counts (key,value) pair entry as single.Mean if there are three key,value pairs then it will return 3 as size of hashmap.
        //syntax->  hashmapName.size();
        System.out.println(map.size());

        
        //isEmpty:-it is used to check whether our hashMap is empty or not.If empty then true will be returned else false will be returned.
        //Syntax->  hashMapName.isEmpty();
        System.out.println(map.isEmpty());//false will be output as our hashmap contains some values.


        //clear:-This method is used to clear all data of HashMap.It will mmake ouur whole hashmap empty.
        //syntax->  hashmapName.clear();
        //this method does not return values of hashmap after.It just clears them
        map.clear();
        //let now check whether our hashMap is empty or not
        boolean res = map.isEmpty();
        System.out.println(res); 
        




    }
}