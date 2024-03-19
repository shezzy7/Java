//function overloading refers to case when there are multiple functions in the program with same name but difeerent no of parameters or different 
//type of parameters. 
public class funcOverloading{
    public static void  add(int a,int b){
        System.out.println(a+b);
    }
    public static void add(int a){
        System.out.println(a);
    }
    public static void add(float a,int b){
        System.out.print(a+b);
    }
    public static void main(String args[]){
        add(4,5);
        add(10);
        add(5.3f,4);
        //here function will be called according to type of parameters or no of parameters
    }
} 