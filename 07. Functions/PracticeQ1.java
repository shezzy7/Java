import java.util.*;
public class PracticeQ1{

    public static int product(int a,int b){
        int pdct = a*b;
        return pdct;
    }
    public static void main(String args[]){
        
    Scanner sc1 = new Scanner (System.in);
        System.out.print("Enter num1: ");
        int num1 = sc1.nextInt();
        System.out.print("Enter num2 : ");
        int num2 = sc1.nextInt();
        System.out.print("Product = "+product(num1,num2));
    }
}