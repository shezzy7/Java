import java.util.*;
public class Assignment {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        //Q1
        //how many times hello will print
        for(int i=0;i<5;i++){
            System.out.print("Hello \n");
            i+=2;
        }

        //Q2
        //a programm that reads a set of integars and then print sum of even and odd integars
        int number;
        int evenSum=0;
        int oddSum=0;
        do{
            System.out.print("Enter no : ");
            number=sc.nextInt();
            if(number%2==0){
                evenSum+=number;
            }
            else{
                oddSum+=number;
            }
            System.out.print("Do you want to continue? press 1 for yes or -1 for no : ");
            number=sc.nextInt();
        }while(number!=-1);
        System.out.println("Sum of even numbers = "+evenSum+"\nSum of odd numbers = "+oddSum);

        //Q3
        //find factorial of any given number
        System.out.println("Enter number for factorial : ");
        int num1= sc.nextInt();
        int fact=1;
        for(int i=1;i<=num1;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of given number is = "+fact);

        //Q4
        //a programm to print multiplication table of a given number
        System.out.print("Enter to get multiplication table : ");
        int tab = sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(i+" * "+tab+" = "+i*tab);
        }

        
    }
}
