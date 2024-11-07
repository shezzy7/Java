import java.util.Scanner;

public class even_odd{
    public static void main(String args[]){
        //To check if a number is power of 2 or not, we can use a simple approach.
        //if we are given for example 16=00010000, and we will do that make an AND operation of the given number with 1 less than this number as 16-1=15=00001111. So when we will make an AND operation of 16 and 15 then if result comes 0 then it mean that numebr is power of two else not.Like here 
        // 16&15=00010000 & 00001111 = 00000000
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number two check if its power of 2 : ");
        int n = sc.nextInt();

        int x = n&(n-1);
        if (x==0){
            System.out.println(n+" is Power of 2");
        }
        else{
            System.out.println(n+" is Not Power of 2");
        }
        //but if we check 15 then 15&14=00001111 & 00001110=00001110 which is not equall to 0 so number is not power of two
        
    }
}