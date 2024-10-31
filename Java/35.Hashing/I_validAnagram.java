import java.util.*;
public class I_validAnagram{
    public static boolean isAnagram(String s,String t){
        //if both strings length is not equall then they are not anagram 
        if(s.length()!=t.length()){
            return false;
        }

        HashMap <Character,Integer> map = new HashMap<>();
        //inserting each character and addding its count
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);//if character already present then get its frequency and increase by 1 if not present then take its value as 0 and add  one in it and put it in hashmap
        }
        
        for(int i=0;i<t.length();i++){
            char ch = t.charAt(i);
            if(map.get(ch)!=null){//whether character is present or not
                if(map.get(ch)==1){//if its count is 1 then remove it from map
                    map.remove(ch);
                }
                else{
                    map.put(ch,map.get(ch)-1);//if count is not 1 then decreae it by 1
                }
            }
            else{//if character is not present then return false
                return false;
            }
        }
        return map.isEmpty();//if hashmap
    }
    public static void main(String args[]){
        //We are given 2 string s and t. We have to check whether t is angram of s or not.
        //An anagram is a word or phrase formed by rearranging the letters of a different word or phrase,typically using all the original letters exactly once.
        // for example
        // s="race" t="care" ->true
        // s="heart" t="earth" ->true
        // s="Heart" t="earth" ->false
        // s="tulip" t="lipid" ->false

        String s = "care";
        String t = "race";
        System.out.print(isAnagram(s,t));
    }
}