import java.util.*;
public class switchStatement {
    public static void main(String arg[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();
        switch(num){
            case 1:
            System.out.print("One");
            break;
            case 2:
            System.out.print("Two");
            break;
            case 3:
            System.out.print("three");
            break;
            default:
            System.out.print("Invalid number");
        }

    }
}
