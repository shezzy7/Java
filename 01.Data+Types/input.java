import java.util.*;
public class input {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name : ");
        String name = sc.nextLine();

        System.out.print("Enter age : ");
        int age = sc.nextInt();

        // System.out.print("Enter color : ");
        // char color = sc.next();

        System.out.print("Enter marks : ");
        float marks = sc.nextFloat();

        System.out.print("18+ : ");
        boolean age2 = sc.nextBoolean();

        System.out.print("name : " +name );

    }
}
