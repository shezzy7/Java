import java.util.*;
public class evenOrodd {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();
        if(num%2==0){
            System.out.print("Even number");
        }
        else{
            System.out.print("Odd number");
        }
    }
}
