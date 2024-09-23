import java.util.*;
public class practiceQ7 {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        //display all numbers enter by user except multiples of 10
        int num;
        do{
            System.out.print("Enter numbr (enter -1 to exit) : ");
            num=sc.nextInt();
            if(num%10==0){
                continue;
            }
            if(num!=-1){
            System.out.println("Number entered is : "+num);
            }
        }while(num!=-1);
    }
}
