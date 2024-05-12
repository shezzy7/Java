import java.util.*;
public class primeOrNot {
    public static void main(String arg[]){
        //check if a number is prime or not
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();
        int x=1;
        for(int i=2;i<num;i++){
            if(num%i==0){
                System.out.print("Not Prime number!");
                x=-1;
                break;
            }
        }
        if(x!=-1){
            System.out.print("Prime number!");
        }
    }
}
