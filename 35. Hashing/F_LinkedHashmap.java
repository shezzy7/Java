import java.util.*;
public class F_LinkedHashmap{

    public static void main(String args[]){
        //Linked HashMap is just like hashmap.the difference is that keys are in insertion order.For example if we put some key value pair in our Linked HashMap.When we will print our hashmap then all the pairs will be in same order as they were added in linkedhashmapp.
        //Syntax -> LinkedHashMap<keyType,valueType> mapName = new LinkedHashMap<>();
        LinkedHashMap<String,Integer> map1 = new LinkedHashMap<>();
        //all the methods like put,get,remove etc are same in linked hashmap aas of simple hashmap.And they also work in O(1) time complexity.
        map1.put("Pak",30);
        map1.put("China",150);
        map1.put("Ind",100);
        map1.put("Gaza",5);
        System.out.println(map1);//here we will see that in output first pair will be of 'Pak,30',second will be of 'China,150',third will be of 'Ind,100' and laast will be of 'Gaza,5'
        //but if we do this in simple hashmap then all the pairs will be stored in raandomm order
        HashMap<String,Integer> map2 = new HashMap<>();
        map2.put("Pak",30);
        map2.put("China",150);
        map2.put("Ind",100);
        map2.put("Gaza",5);
        System.out.println(map2);

        //So basically when we need to maintaain order of insertion then we use linked hashmap.LinkedHashMap uses doubly linked list

    }

}