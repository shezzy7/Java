import java.util.*;
public class practiceQ3 {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        //print sum of number from 1 to n
        System.out.print("Enter last number : ");
        int n= sc.nextInt();
        int start=1;
        int sum = 0;
        while(start<=n){
            sum+=start;
            start++;
        }
        System.out.print("Sum is = "+sum);
    }
}
