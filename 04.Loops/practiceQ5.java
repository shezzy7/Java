import java.util.*;
public class practiceQ5 {
    public static void main(String arg[]){
        //print the reverse of a given number 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();
        while(num!=0){
            //for getting the last digit of a number gets its reminder by 10
            int number = num%10;
            System.out.print(number);
            //now after getting last digit we have to remove it from number
            //so removing any element from a number divide it by 10
            num/=10;
        }
    }
}
