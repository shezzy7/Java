import java.util.*;
public class ith_Bit{
    public static void main(String args[]){
        //If we are given a number and we have to find the value of a specific bit in that number whether it is 0 or 1.We can find this following method .
        //if a number is given like 15=00001111 and we have to find value of 4th bit here numbering will be also like in arrays mean starting from 0.So we will do what we will just make a AND operation of that will with (1<<i) here i is the number bit(4).As 00000001<<4=00010000 and when we will perform AND with 00001111 result will be equall to 00000000 which is zero ,and when result equalls 0 then it means that our bit is 0.And like this if we have to find 2nd bit then 00000001<<2=00000100 and when we will AND with value 00001111  result will be 00000100 which is non-zero value and when the result is other zero it means ith bit is 1.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        System.out.print("Enter bit number to be find : ");
        int i = sc.nextInt();
        //finding
        int ithBit = n&(1<<i);
        if(ithBit==0){
            System.out.println("Our "+i+"th bit in integer is = 0");
        }
        else{
            System.out.println("Our "+i+"th bit in integer is = 1");
        }
    }
}