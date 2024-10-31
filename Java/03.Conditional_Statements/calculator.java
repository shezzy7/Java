import java.util.*;
public class calculator {
    public static void main(String arg[]){
        Scanner sc =new Scanner (System.in);
        System.out.print("Enter num1 : ");
        int a = sc.nextInt();
        System.out.print("Enter num2 : ");
        int b = sc.nextInt();
        System.out.print("Enter operator(*,-,/,+) : ");
        char op = sc.next().charAt(0);
        switch(op){
            case '+':
            System.out.print("Sum = "+(a+b));
            break;
            case '-':
            System.out.print("Sub = "+(a-b));
            break;
            case '*':
            System.out.print("Mul = "+(a*b));
            break;
            case '/':
            System.out.print("Div = "+(a/b));
            break;
            default:
            System.out.print("Invalid operator");
        }
        
    }
}
