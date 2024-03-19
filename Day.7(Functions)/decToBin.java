//a program to convert decimal to binary
import java.util.*;
public class decToBin{
    public static void binConv(int decNum){
        int myNum = decNum;
        int binNum = 0;
        int pow=0;
        while(decNum>0){
                int rem = decNum%2;//keep in mind remaineder of 1 by 2 is 1
                binNum=binNum+(rem*(int)Math.pow(10,pow));
                decNum=(decNum/2);
                pow++;
            
        }
        System.out.println("Binary number of "+myNum+" = "+binNum);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter you decimal number : ");
        int decNum = sc.nextInt();
        binConv(decNum);
    }
}