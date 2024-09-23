import java.util.*;
public class practiceQ2 {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num1 : ");
        int num1 = sc.nextInt();
        System.out.print("Enter num2 : ");
        int num2 = sc.nextInt();
        System.out.print("Enter num3 : ");
        int num3 = sc.nextInt();
        if(num1>num2){
            if(num1>num3){
                System.out.print("Largest number is : "+num1);
            }
        }
        else if(num2>num1 && num2>num3){
            System.out.print("Largest number is : "+num2);
        }
        else{
            System.out.print("Largest num is : "+num3);
        }
    }
}
