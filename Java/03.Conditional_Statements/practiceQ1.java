import java.util.*;
public class practiceQ1 {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number 1 : ");
        int num1 = sc.nextInt();
        System.out.print("Enter number 2 : ");
        int num2 = sc.nextInt();
        if(num1>num2){
            System.out.print("The largest number is = "+num1);
        }
        else{
            System.out.print("The largest number is = "+num2);
        }
    }
}
