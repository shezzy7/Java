import java.util.*;
public class U_sortByFrequency{
    public static String sort(String str){
        //We are given a string sorted in descending order by the frequency of their characters.We have to sort this string in ascending order according to the frequency of their characters and return it.If some letters appears for the same frequency then we can take any of them
        //For Example : Input -> str = "tree"  ,  Output -> str = "eert"
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<str.length();i++){
            Character ch = str.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }
            else{
            map.put(ch,1);
            }
        }
        //lets reverse this map into tree map
        TreeMap<Integer,Character> map2 = new TreeMap<>();
        for(Character key : map.keySet()){
            map2.put(map.get(key),key);
        }
        StringBuilder sb  = new StringBuilder("");
        for(Integer key : map2.keySet()){
            int i=0;
            while(i>key){
                System.out.print(map2.get(key));
                sb.append(map2.get(key));
                i++;
            }
        }
        System.out.print(sb);
        return sb.toString();
    }
    public static void main(String args[]){
        String str = "tree";
        System.out.println(sort(str));
    }
}