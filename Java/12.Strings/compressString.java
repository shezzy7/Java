import java.util.*;
public class compressString{
    public static String compress(String str){
        //We are given a string and we have to remove all the adjacent duplicated of this string mean if we are given "aabcccccddedd" then we havt to convert it to "abcded".
        //simple method
        
        // String compressedStr = "";
        // for(int i=0;i<str.length();i++){
        //     Integer count = 1;
        //     while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
        //         count++;
        //         i++;
        //     }
        //     compressedStr += str.charAt(i);
        //     if(count>1){
        //         compressedStr += count.toString();
        //     }

        // }
        // return compressedStr;

        //using stringbuilders
        StringBuilder str2 = new StringBuilder("");
        for(int i=0;i<str.length();i++){
            Integer count = 1;
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            str2.append(str.charAt(i));
            if(count>1){
                str2.append(count.toString());
            }
        }
        return str2.toString();
        // return str2;
    }
    public static void main(String args[]){
        String str = "aaabbbbccddddde";   
        //We are given a string that can contain multiple same characters together like above string and we have to compress this string in such a way that if any character is present more than 1 time replace all these caharacter by this character plus count of all these characters.
        // like if we compress above string then it should become "a3b4c2d5e"
        System.out.print("Compressed string is : '"+compress(str)+"'");
    }
}