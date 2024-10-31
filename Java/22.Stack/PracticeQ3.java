import java.util.*;
public class PracticeQ3{
    public static String decodeString(String str){
//         We have an encoded string s and the task is to decode it. The pattern in which the strings are
// encoded is as follows.
// Sample Input 1 : 2[cv]
// Sample Output 1 : cvcv
// Sample Input 2 : 3[b2[v]]L
// Sample Output 2 : bvvbvvbvv
        Stack<Integer> integerstack = new Stack<>();
        Stack<Character> stringstack = new Stack<>();
        String temp = "", result = "";
        for (int i = 0; i < str.length(); i++){
            int count = 0;
            if (Character.isDigit(str.charAt(i))){
                while (Character.isDigit(str.charAt(i))){
                    count = count * 10 + str.charAt(i) - '0';
                    i++;
                }
                i--;
                integerstack.push(count);
            }
            else if (str.charAt(i) == ']'){
                temp = "";
                count = 0;
                if (!integerstack.isEmpty()){
                    count = integerstack.peek();
                    integerstack.pop();
                }
                while (!stringstack.isEmpty() && stringstack.peek()!='[' ){
            
                    temp = stringstack.peek() + temp;
                    stringstack.pop();
                }
                if (!stringstack.empty() && stringstack.peek() == '[')
                    stringstack.pop();
                for (int j = 0; j < count; j++)
                    result = result + temp;
                for (int j = 0; j < result.length(); j++)
                    stringstack.push(result.charAt(j));
                result = "";
            }
            else if (str.charAt(i) == '['){
                if (Character.isDigit(str.charAt(i-1)))
                    stringstack.push(str.charAt(i));
                else{
                    stringstack.push(str.charAt(i));
                    integerstack.push(1);
                }
            }
            else
                stringstack.push(str.charAt(i));
        }
        while (!stringstack.isEmpty()){
            result = stringstack.peek() + result;
            stringstack.pop();
        }
        return result;
}
    public static void main(String args[]){
        String str = "[2[cv]2[gh4[j]b]k";
        System.out.println(decodeString(str));
    }
}