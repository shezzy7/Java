import java.util.*;

public class Assignment{
    //Q1
    public static void countLowecaseVowels(){
        Scanner sc = new Scanner (System.in);
        String str;
        System.out.print("Enter string to count loverCase vowels : ");
        str = sc.nextLine();
        int count = 0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == Character.toLowerCase(str.charAt(i))){
                switch(str.charAt(i)){
                    case 'a': case 'e': case 'i': case 'o': case 'u':
                    count++;
                    
                }
            }
        }
        System.out.println("Count of lowecase vowels in enterd string is = "+count);
    }

    //Q2
    public static void guessOutput(){
        String s1 = "shezzyJam";
        String s2 = "ShahzadMustafai";
        String s3 = "shezzyJam";
        System.out.println(s1.equals(s2) + " " + s1.equals(s3));// false true
    }

    //Q3
    public static void guessOutput2(){
        //replace method replace all the occurences of first given element inside method   by 2nd element inside the method 
        String str1 = "shezzyJam".replace("1","");//shezzyJam
        String str2 = "shezzy1 Jam".replace("1","7");//shezzy7 Jam
        System.out.println(str1);
        System.out.println(str2);
    }

    //Q4
    public static void anagrams(){
        //check whether two given strings are angrams or not
        //Angrams -> if two strings contain the same characters ignoring their order,they can be said as anagrams
        String s1 = "race";
        String s2 = "caRe";
        if(s1.length() == s2.length()){//check whether strings length is same or not 
            s1 = s1.toLowerCase();//converting them to lowercase for not cheking for both types(lowercase and uppercase)
            s2 = s2.toLowerCase();
        
            char string1[] = s1.toCharArray();
            char string2[] = s2.toCharArray();
            Arrays.sort(string1);
            Arrays.sort(string2);
            if(Arrays.equals(string1,string2)){
                System.out.println("Strings are angrams");
            }
            else{
                System.out.println("Strings are not anagrams");
            }

        }
        
        else{
            System.out.println("Strings are not anagrams");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        //Q1
        //find count of lowerCase vowels in a given string
        countLowecaseVowels();

        //Q2
        //guess output of the given code
        guessOutput();

        //Q3
        guessOutput2();

        //Q4
        anagrams();

        //Q5
        //explore followings
        // 1-intern() methid in string
        //2-StringBuffer
        
        //Intern()
        //intern() is used to when we are going to create a string want to check that if a string is already present with the same content then point this to it and not create a new string 
        //eg.
        String intern1 = new String("HelloInter");
        String intern2 = new String("HelloInter");
        System.out.println(intern1==intern2);//false 
        //now lets create these using intern method
        String intern3 = new String("HelloIntern1").intern();
        String intern4 = new String("HelloIntern1").intern();
        System.out.println(intern3==intern4);//true
        //another example
        String intern5 = new String("shezzy");
        String intern6 = "shezzy";
        String intern7 = intern5.intern();
        System.out.println(intern5==intern6);//false
        System.out.println(intern7==intern5);//true
        
        //String Buffer
        
        
    }
}