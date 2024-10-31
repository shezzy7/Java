import java.util.*;
public class G_TreeMap{
    public static void main(String args[]){
        //TreeMap is also like simple hashMap.The difference is that in this keys  are present in sorted order.Due to which time complexity of put,get,remove becomes O(log n).
        //Syntax -> TreeMap<keyType,valuetype> mapName = new TreeMap<>();
        
        TreeMap<String,Integer> map = new TreeMap<>();
        map.put("Pak",30);
        map.put("Ind",100);
        map.put("USA",50);
        map.put("Ban",35);
        System.out.println(map);//In output first pair will be greater with respect to alphabetically(Ban,35),then comes (Ind,100),then (Pak,30) and then (USA,0).Which is showing that all the pairs will be in sorted neither in insertion order nor in random order.
        //TreeMap use Red Hat Tree.
    }
}