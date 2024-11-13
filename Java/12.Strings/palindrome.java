import java.util.*;
public class palindrome{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        //check whether the given string is palindrom or not 
        //palondrome mean reverse of the string is same like original string
        String str;
        System.out.print("Enter string : ");
        str = sc.nextLine();
        //for this purpose we will check first half of string with 2nd hald half if any elements does equal to its camparative element then string is not a palindrome.
        
        boolean n = true;
        for(int i=0;i<str.length()/2;i++){
            
            if(str.charAt(i) != str.charAt(str.length()-1-i)){
                System.out.print("Not a palindrome!");
                n = false;
                break;
            }
        }
        if(n){
            System.out.print("Palindrome\n");
        }
    }
}