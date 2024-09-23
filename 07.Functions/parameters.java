//parameter :- data that we take as input in function 
//syntax->
            // returnType funcName(type param1,type param2....type paramN){
            //     //body
            //     return statement;
            // }

public class parameters{
    public static int sum(int a,int b){//values that a function receive are called parameters
        int add = a+b;
        return add;
    }
    public static void main(String args[]){
       System.out.print(sum(5,6)); //values that we pass to the function while calling are called arguments
    }
}