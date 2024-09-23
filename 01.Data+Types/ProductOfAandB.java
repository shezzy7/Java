import java.util.*;
public class ProductOfAandB {
    public static void main(String arg[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter 1st num : ");
    int a = sc.nextInt();
    System.out.print("Enter 2nd num : ");
    int b = sc.nextInt();
    int product = a*b;
    System.out.print("Product of " + a + " and " + b +" = " + product);
    }
}
