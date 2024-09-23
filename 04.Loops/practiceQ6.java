import java.util.*;
public class practiceQ6 {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        //keep entering till user enter a multiple of 10
        //use break statement
        System.out.print("Enter number : ");
        int num = sc.nextInt();
        while(true){
            if(num%10==0){
                break;
            }
            System.out.print("Enter number : ");
            num = sc.nextInt();

        }
        System.out.print("User enters : "+num);
        
    }
}
