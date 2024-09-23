import java.util.*;
public class Assignment {
    public static void main(String arg[]){

        //Q1-input three numbers and give avg
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num1(int) : ");
        int a = sc.nextInt();
        System.out.print("Enter num2(int) : ");
        int b = sc.nextInt();
        System.out.print("Enter num3(int) : ");
        int c = sc.nextInt();
        float avg = (a+b+c)/3.0f;
        System.out.println("Average = "+avg);

        //Q2-Input side of a square and print area of square (area=side*side);
        System.out.println("Enter side of square(float) : ");
        float side = sc.nextFloat();
        double area = side*side;
        System.out.println("Area of that square is = "+area);

        //Q3-Enter cost of three items and return total of items as bill(add 18% tax)
        System.out.println("Enter pencil price(float) : ");
        float price1 = sc.nextFloat();
        System.out.println("Enter pen's price(float) : ");
        float price2 = sc.nextFloat();
        System.out.println("Enter eraser's price(float) : ");
        float price3 = sc.nextFloat();
        float total = (price1*0.18f)+(price2*0.18f)+(price3*0.18f);
        System.out.println("Total price including 18% tax = "+total);
        

        //Q4-What will be type of result in the following
        byte l =4;
        char e = 'a';
        short s = 512;
        int i = 1000;
        float f = 3.14f;
        double d = 99.9954;
        double result = (f*l)+(i%e)-(d*5);
        System.out.print("Result = "+result);
        //its result type will be double bcz big type is double

        //Q5-is the following variable declaration is fine
        int $ = 25;//it is fine bcz we can start name by any alphabet or "_" or "$"

    }
}
