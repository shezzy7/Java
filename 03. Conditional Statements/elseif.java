import java.util.*;
public class elseif {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age : ");
        int age = sc.nextInt();
        if(age>=18){
            System.out.print("Adult");
        }
        else if(age>=13 && age<18){
            System.out.print("Teenage");
        }
        else{
            System.out.print("Child");
        }
    }
}
