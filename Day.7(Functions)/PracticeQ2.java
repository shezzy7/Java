//find factorial of a given number using function
import java.util.*;
public class PracticeQ2{
    public static void factorial(int n){
        int fact = 1;
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        System.out.println("Factorial of "+n+" is = "+fact);

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to get factorial : ");
        int n =sc.nextInt();
        factorial(n);
    }
}