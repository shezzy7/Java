import java.util.*;
public class B_input_output{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //String name;
        //System.out.print("Enter name : ");
        //name = sc.next();//we don't need to tell type of data while inputing string 
        //System.out.println("Name : "+name);
        //but this next function will only input one word 
        //so for inputing a line we use nextLine function
        String intro;
        System.out.print("Short intro : ");
        intro = sc.nextLine();
        System.out.println(intro);
        //if we use next function in code and then use nextLine function in code then nextLine function will not get input
    }
}