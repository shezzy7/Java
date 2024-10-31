import java.util.*;
public class practiceQ3 {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks : ");
        int marks = sc.nextInt();
        String res = (marks>=33)?"Pass":"Fail";
        System.out.println(res);
    }
}
