//function overloading using parameters. we can also create functions with same name and same number of parameters but different type of 
//variable/parameters
public class funcOverloading2{
    public static void sum(int a,int b){
        System.out.println("Sum = "+(a+b));
    }
    public static void sum(float a,float b){
        System.out.println("Sum = "+(a+b));
    }
    public static void sum(int a,float b){
        System.out.println("Sum = "+(a+b));
    }
    public static void sum(float a,int b){
        System.out.println("Sum = "+(a+b));
    }
    public static void main(String args[]){
        sum(5.6f,5.9f);// functions  will be called according to type and align of parameters 
        sum(5,8);
        sum(5,10.5f);
        sum(6.3f,7);
    }
}