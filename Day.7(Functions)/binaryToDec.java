import java.util.*;
public class binaryToDec{
    public static void binConv(int binNum){
        int myNum=binNum;
        int dec=0;
        int pow = 0;
        while(binNum>0){
            int lastDigit = binNum%10;
            dec = dec + (lastDigit *(int) Math.pow(2,pow));//here we are using typecasting
            // because math function always return value in double form and here we are saving it in int type variale so we will convert it first
            binNum/=10;
            pow++;
        }
        System.out.println("Decimal of "+myNum+" = "+dec);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter binary number (0-1):");
        int binNum = sc.nextInt();
        binConv(binNum);
    }
}