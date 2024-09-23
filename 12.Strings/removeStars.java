import java.util.*;
public class removeStars{
    public static String removeStar(String str){
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
        String str = "eraase*****";
        String res = removeStar(str);
        System.out.print(res);
    }
}