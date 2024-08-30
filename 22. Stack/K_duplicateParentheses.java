import java.util.*;
public class K_duplicateParentheses{
    public static boolean findDuplicateParenthesis(String str){
        //Given a balanced expression,find if it contains duplicate parentheses or not.A set of parentheses are duplicate if the same subexpression is surrounded by multiple parentheses.
        //Return a true if it contains duplicates else return false
        //example1: ((a+b)+(c+d))        -> false
        //example2: (((a+b)+(c+d)))      -> true
        //example3: (((a+b))+c)          -> true
        //example4: (a+b+c)              -> false
        //example5: ((((a)+(b))+c+d))    -> true
        //Here duplicate parentheses means unnecessary parentheses.Any parentheses which are present over some pareenthese and don't contain any expression in them.

        //Approach:- We will use a stack to solve this problem.In stack we will continue pushing elements other a closing bracket. When we will get a closing bracket then we will start poping elements from stack unitl we get an opening brackt of this closing bracket.But our this bracket will be not a duplicate bracket if it contians some expresion like +,-,*,/, or any variable in it else if it does not contain any value in it then it will be a duplicate parentheses.
        //So to check whether whehter given bracket contains any expresion between then we will use a counter which will count number of pops when we find a closing bracket if found some values inside this bracket then it will increase count by 1 for each but if it does not find any value between parentheses then count will  remain 0 by which we will mean then there was no value between these parentheses so our parentheses will be a duplicate and we will return a true else if count was not less then 1 ,in this case we will continue cheking and if we don't find any duplicate parentheses then at last we will return false.

        //Time Complexity -> O(n)
        Stack<Character> st = new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            
            if(ch!=')'){//operator,operands,opening parentheses
                st.push(ch);
            }
            else{//closing parentheses
                int count = 0;
                while(st.peek()!='('){
                    count++;
                    st.pop();
                }
                if(count<1){
                    return true;//duplicate
                }
                else{
                    st.pop();//if count was greater then 0 and while loop breaked as it found an opening bracket on top of stack then we will pop this bracket from stack.
                }
                
            }
        }
        return false;//if we cannot find any duplicate parentheses from stack then will return false.

    }
    public static void main(String args[]){
        //Given question also came in many coding interviews
        String str = "()(a+b)+(c+d)";//true
        System.out.println(findDuplicateParenthesis(str));
    }
}