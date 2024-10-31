import java.util.*;
public class Assignment{

    //Q1-> 
    public static void average(){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("enter number 1 : ");
        int a = sc.nextInt();
        System.out.print("Enter number 2: ");
        int b = sc.nextInt();
        System.out.print("Enter number 3: ");
        int c = sc.nextInt();
        float avg = (a+b+c)/3.0f;
        System.out.print("Average of there numbers is = "+avg+"\n");
    }

    //Q2
    public static boolean isEven(int d){
        if(d%2==0){
            return true;
        }
        else{
            return false;
        }
    }

    //Q3
    public static void palindorm(int e){
        int rev = 0;
        int org = e;
        while(e>0){
            int rem = e%10;
            rev = (rev*10)+rem;
            e = (int) e/10;
        }
        if(org == rev){
            System.out.println("Number is palindormic!");
        }
        else{
            System.out.println("Number is not palindormic!");
        }
    }

    //Q5
    public static void digitsSum(int g){
        int sum = 0;
        int org = g;
        while(g>0){
            int rem = g%10;
            sum = sum + rem;
            g=g/10;
        }
        if(org<0){
            System.out.print("You have enetered a negative number ");

        }
        else{
            System.out.println("Sum of digits of "+org+" = "+sum);
        }

    }


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        //Q1->write a function to compute avg of three number
        average();

        //Q2->write a method to check if a number is even or not . method should return true if even else false 
        //method should take integar as parameter .Also write program to test your method
        System.out.print("Enter number to check even or odd : ");
        int d = sc.nextInt();
        boolean eve = isEven(d);
        System.out.println(eve);
        if((d%2==0 && eve==true) || (d%2==1 && eve==false)){
            System.out.println("Method is fine");
        }
        else{
            System.out.println("Methos is wrong!Please correct your code.");
        }

        //Q3
        //a function to check if a number is palindormic or not (number is equal to reverse of it eg. 121,11,55,343 etc)
        System.out.print("Enter number to check palindormic : ");
        int e = sc.nextInt();
        palindorm(e);

        //Q4
        //search about methods of class Math like Math.abs(),Math.max(),Math.min(),Math.sqrt(),Math.pow(),Math.avg()
        //There are many methods of class Math in java .Some mostly used are these 
        //1-Math.abs()->if we write any number in this . It will return absolute value(Without signed value is absolute value eg. 
        //absolute of 5 is 5 and absolute of -5 is also 5) of that number.
        int f = -5;
        System.out.println("Absolute value of "+f+" is = "+Math.abs(f));
        //2-Math.min()->this gives us lower value between two given numbers
        System.out.println("Smaller number b-w 5 and 10 is " + Math.min(5,10));
        //3-Math.max()->this gives us larger value b-w two given values
        System.out.println("Larger number b-w 5 and 10 is "+Math.max(5,10));
        //4-Math.pow()->this method gives us power of a number.In its syntax we write number first then the power of that number
        //eg. Math.pow(number,power);
        System.out.println("2 ki power 5 = "+Math.pow(2,5));
        //5-Math.sqrt()->this method is used to find the square root of a given number 
        System.out.println("Square root of 5 = "+Math.sqrt(5));

        //Q5
        //A java method to compute the sum of digits is given integar
        System.out.print("Enter number to get sum of its digits  : ");
        int g = sc.nextInt();
        digitsSum(g);





    }
}