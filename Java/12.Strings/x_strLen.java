import java.util.Stack;

public class x_strLen{

    public static int minLengthAfterRemoving(String s) {
        if(s.length()==0 || s.length()==1){
            return s.length();
        }
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
           if(st.isEmpty()){
            st.push(ch);
            continue;
           }
           else if((st.peek()=='A' && ch=='B') || (st.peek()=='C' && ch=='D')){
            st.pop();
           }
           else{
            st.push(ch);
           }
        }
        return st.size();
        
    }
    public static void main(String[] args) {
//         You are given a string s consisting only of uppercase English letters.

// You can apply some operations to this string where, in one operation, you can remove any occurrence of one of the substrings "AB" or "CD" from s.

// Return the minimum possible length of the resulting string that you can obtain.

// Note that the string concatenates after removing the substring and could produce new "AB" or "CD" substrings.

 

// Example 1:

// Input: s = "ABFCACDB"
// Output: 2
// Explanation: We can do the following operations:
// - Remove the substring "ABFCACDB", so s = "FCACDB".
// - Remove the substring "FCACDB", so s = "FCAB".
// - Remove the substring "FCAB", so s = "FC".
// So the resulting length of the string is 2.
// It can be shown that it is the minimum length that we can obtain.
        String s = "CCCCDDDD";
        System.out.print(minLengthAfterRemoving(s));
    }
}