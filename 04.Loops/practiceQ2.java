import java.util.*;
public class practiceQ2 {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        //print number from 1 to n
        System.out.print("Enter last numer : ");
        int n=sc.nextInt();
        int start = 1;
        while(start<n+1){
            System.out.print(start+" ");
            start++;
        }
    }
}
