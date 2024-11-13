public class largestString{
    public static void main(String args[]){

        //strings are compared on the basis of sequence of alphabets and not on their length
        String str1 = "shahzad";
        String str2 = "hussain";
        //above strings are same by their their length but by their sequence str1 is larger then str2 
        String str3 = "moon";
        //this str3 is also greater then str2 bcz 'm' comes after 'h' in alphabets
        
        //for comapring strings we can use two type of functions 
        //1- compareTo
        //syntax -> str1.compareTo(str2);
        //this function also checks capitalization of words 
        //if compared strings are equall answer will be '0' and if string 1 is greator then string2 then answer will be +ve and if str2 is greater then answer will be -ve 
        System.out.println(str1.compareTo(str2));
        System.out.println(str1.compareTo(str3));

        //2- comparetoIgnoreCase
        //this function also works same but this will ignore capitialization of elements
        String str4 = "Shezzy";
        System.out.println(str1.compareTo(str4));
        System.out.println(str1.compareToIgnoreCase(str4));

        //let we have given am array of strings and we have to find largest string 
        String ptc[] = {"apple","mango","bannana"};
        String largest = ptc[0];
        for(int i=1;i<ptc.length;i++){
            if(ptc[i].compareTo(largest)>0){
                largest = ptc[i];
            }
        } 
        System.out.print(largest);
    }
}