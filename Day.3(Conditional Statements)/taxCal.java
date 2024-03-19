import java.util.*;
public class taxCal {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter salary : ");
        int salary = sc.nextInt();
        int tax;
        if(salary<50000){
            
            System.out.print("No tax applied on salary");
        }
        else if(salary>=50000 && salary<=100000){
            tax=(int) (salary*0.2);
            System.out.println("20% tax applied on salary so salary is " + (salary-tax));
            System.out.print("Tax is : "+tax);
        }
        else{
            tax=(int)(salary*0.3);
            System.out.println("30% tax applied on salary so salary is : "+(salary-tax));
            System.out.print("Tax : "+tax);
        }
    }
}
