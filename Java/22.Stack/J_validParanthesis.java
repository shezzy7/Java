import java.util.*;
public class J_validParanthesis{
    public static boolean validParanthesis(String str){
        //we are given a string which only contains paranthesis characters like '{','}','(',')','[' and ']'.We have to check whether input string is valid or not.
        //An input string is valid if 
        // a) Open brackets must be closed with the same type of brackets
        // b) Open brackets must be closed with in the correct order 
        // c) Every close bracket has a correspending open bracket of same type 
        //example1 -> i) input -> "[]{{}}"  output -> true 
        //example2 -> i) input -> "[]{{}"  output -> false

            //Approach
        //This problem can be solved in many ways but we will use stack to solve it.We will iterate over string from start and we insert open bracket to our stack.If we encounter a closing bracket then we will check whether top of stack is opening bracket of this closing bracket if it is then we will pop it from stack and if not then it means that it is some wrong order so we will return false.
        //But if some opening brackets remain in stack after complete iteration then it means that string ws invalid , but if all the opening brackets were poped out from stack and stack was emty after complete iteration then it means that our string was having valid order of paranthesis
        Stack<Character> st = new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch=='{' || ch=='[' || ch=='('){
                st.push(ch);
            }
            else if(!st.isEmpty()){//this condition will check if we encounter a closing bracket but our stack is emty then it means that we got a invalid order and in this case we will return false
                if((ch==')' && st.peek()=='(') //()
                    || (ch=='}' && st.peek()=='{') //{}
                    || (ch==']' && st.peek()=='[') )//[]
                    {
                    st.pop();
                }
                else{
                        return false;
                }
            }
            
            else{
                return false;
            }
        }
        return st.isEmpty();
    }
    public static void main(String args[]){
        String str = "{{()}[]}";
        System.out.print(validParanthesis(str));
    }
}