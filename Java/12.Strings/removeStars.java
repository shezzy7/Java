import java.util.*;
public class removeStars{
    public static String removeStar(String str){
        //We are given a string of alphabets and stars(*).We have to traverse over this string,whenever we see a '*' n string remove an alphabet present just before this star.
        Stack<Character> st = new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch=='*'){
                st.pop();
            }
            else{
                st.push(ch);
            }
        }
        Stack<Character> st2 = new Stack<>();
        while(!st.isEmpty()){
            st2.push(st.pop());
        }
        StringBuilder res = new StringBuilder("");
        while(!st2.isEmpty()){
            res.append(st2.pop());
        }
        return res.toString();
    }

    public static void main(String args[]){
        String str = "eraasse*****";
        String res = removeStar(str);
        System.out.print(res);
    }
}