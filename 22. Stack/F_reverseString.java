import java.util.*;
public class F_reverseString{
    public static String reverseStr(String str){
        //lets create a stack and insert elements in it 
        Stack<Character> s = new Stack<>();
        for(int i=0;i<str.length();i++){
            s.push(str.charAt(i));
        }
        //now the elements in stack are stored in follwing order from top -> a,i,n,a,h
        //now if we statrt getting elements from stack from top and then adding them one by one in a new string will give us a string reverse of original
        StringBuilder res = new StringBuilder("");
        
        while(!s.isEmpty()){
            res.append(s.pop());
        }
        return res.toString();
    }
    public static void main(String args[]){
        
        //we are given a string and we have to reverse this string uusing stack
        String str = "hania";
        
        String res = reverseStr(str);
        System.out.println("original string was -> "+str);
        System.out.println("reversed string is -> "+res);
    }
}