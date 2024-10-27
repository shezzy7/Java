public class w_totalCharsAfterRemoval{

    public static int lengthAfterTransformations(String s, int t) {
        
    StringBuilder temp = new StringBuilder(""); 
        for(int i=0;i<t;i++){
            temp = new StringBuilder(""); 
            for(int j=0;j<s.length();j++){
                if(s.charAt(j)=='z'){
                    temp.append("ab");
                    
                }
                else{
                    temp.append((char)(s.charAt(j)+1));
                }
            }
            s = temp.toString();
            System.out.println(s);
            
        }
        return temp.toString().length();
    }
    public static void main(String[] args) {
        // You are given a string s and an integer t, representing the number of transformations to perform. In one transformation, every character in s is replaced according to the following rules:

// If the character is 'z', replace it with the string "ab".
// Otherwise, replace it with the next character in the alphabet. For example, 'a' is replaced with 'b', 'b' is replaced with 'c', and so on.
// Return the length of the resulting string after exactly t transformations.

// Note: Please do not copy the description during the contest to maintain the integrity of your submissions.
        System.out.println(lengthAfterTransformations("abcyy",2));
    }
    }