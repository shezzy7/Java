import java.util.*;
public class areaOfCircle {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of circle : ");
        int rad = sc.nextInt();
        double area = 3.14f * rad * rad;
        System.out.print("Area of circle is = "+area);
    }
}
