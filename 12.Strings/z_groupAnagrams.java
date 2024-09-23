import java.util.*;
public class z_groupAnagrams{
    public static ArrayList<ArrayList<String>> groupAnagrams(String strs[]){
        //we are given an array of strings.We to find find anagrams and group them individualyy and return the result in the form of arrayList
        //for example:input-> str={'care','race','bat','tab','fan','abt'};
        //expected output-> {{'care','race'},{,'bat','tab','abt'},{'fan'}}
        
        //approach:- lets iterate over each word and count frequency of each character.And put the result and currrent element in map.Then count frequency of second word in input array and then check whether any word with common number of character is present in map if present then add this word in map with the word already present in it in form of arraylist
        //hashmap for storing results
        HashMap<String,ArrayList<String>> res = new HashMap<>();
        for(int i=0;i<strs.length;i++){
            String frequencyOfCurWord=getFrequecny(strs[i]);
            if(res.containsKey(frequencyOfCurWord)){
                res.get(frequencyOfCurWord).add(strs[i]);
            }
            else{
                ArrayList<String> curList=new ArrayList<>();
                curList.add(strs[i]);
                res.put(frequencyOfCurWord,curList);


            }
        }
        return new ArrayList<>(res.values());

    }
    public static String getFrequecny(String str){
        int freq[] = new int[26];
        for(int i=0;i<str.length();i++){
            freq[str.charAt(i)-'a']++;
        }
        StringBuilder sb = new StringBuilder("");
        char c='a';
        for(int i:freq){
            sb.append(c);
            sb.append(i);
            c++;
        }
        return sb.toString();
    }
    public static void main(String args[]){
        String strs[] = {"bat","tab","tea","eat","fan"};
        System.out.print(groupAnagrams(strs));
    }
}