public class y_firstPalindrom{
    public static boolean palindrome(String str){
        int i=0;
        int j=str.length()-1;
        while(i<=j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static String fPalindrome(String words[]){
        //Given an array of Strings find the first Palindrom String from it and return it as answer if there is no palindrom string then return an empty string.
        for(int i=0;i<words.length;i++){
            if(palindrome(words[i])){
                return words[i];
            }
        }
        return "";
    }
    public static void main(String args[]){
        
        String str[]={"abc","def","ada","raceacar","tre"};
        System.out.println(fPalindrome(str));
    }
}