import java.util.*;
public class C_charAt{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //we can also access each element of a string using charAt method
        //syntax ->     stringName.charAt(index);

        String uni = "GC uni FSD";
        System.out.print(uni.charAt(0));
        //let we have given a array and we have to print no of 'a' in string
        String ptc;
        System.out.print("Enter string : ");
        ptc = sc.nextLine();
        int count = 0;
        for(int i=0;i<ptc.length();i++){
            if(ptc.charAt(i)=='a'){
                count++;
            }
        }
        System.out.println(count);
    }
}