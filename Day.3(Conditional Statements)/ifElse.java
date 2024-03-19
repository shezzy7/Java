import java.util.*;
public class ifElse{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age : ");
        int age = sc.nextInt();
        if(age>=18){
            System.out.print("Adult");
        }
        else{
            System.out.print("Not adult");
        }
    }
}