import java.util.*;
public class Assignment {
    public static void main(String arg[]){
        //Q1
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number : ");
    int num = sc.nextInt();
    if(num<0){
        System.out.println("Negative number");
    }
    else {
        System.out.println("Positive number");
    }

    //Q2
    double temp = 103.5;
    if(temp>100){
        System.out.println("You've fever");
    }
    else{
        System.out.println("You don't have fever");
    }

    //Q3
    System.out.print("Enter day no(1-7) : ");
    int day = sc.nextInt();
    switch(day){
        case 1:
        System.out.println("Monday");
        break;
        case 2:
        System.out.println("Tuesday");
        break;
        case 3:
        System.out.println("Wednesday");
        break;
        case 4:
        System.out.println("Thursday");
        break;
        case 5:
        System.out.println("Friday");
        break;
        case 6:
        System.out.println("Saturday");
        break;
        case 7:
        System.out.println("Sunday");
        break;
        default:
        System.out.println("invalid day");
    }
    //Q4
    int a = 63, b=36;
    boolean x = (a<b)? true:false;//x=false
    int y = (a>b)? a:b;//y=a
    System.out.println("Value of a = "+x+"  value of y = "+y);

    //Q5
    System.out.print("Enter days of year : ");
    int year = sc.nextInt();
    // if(year%4==0){
    //     if(year%100!=0){
    //         System.out.println("Leap year!");
    //     }
    //     else if(year%400==0){
    //         System.out.println("Leap year");
    //     }
    //     else{
    //         System.out.println("Not a leap year");
    //     }
    // }
    // else{
    //     System.out.print("No leap year");
    // }
    boolean v = (year%4==0);
    boolean w = (year%100!=0);
    boolean u = (year%400==0);
    if(v&&(w||u)){
        System.out.println("Leap year");
    }
    else {
        System.out.println("Not leap year");
    }


    }
}
