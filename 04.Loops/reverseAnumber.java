import java.util.*;
public class reverseAnumber {
    public static void main(String arg[]){
        //reverse a given number
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int rev = 0;
        while(num>0){
            //for getting last digit of any element we get reminder by 10 of number
            int last = num%10;
            //for placing a digit at last of a number we multiply the number by 10
            //and then plus the digit in that number 
            rev = (rev*10)+last;
            //for removing last digit of a number we divide it by 10
            num/=10;
        }
        System.out.print("Reverse number is : "+rev);
    }
}
