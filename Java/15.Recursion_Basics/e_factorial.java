public class e_factorial{
    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        return n*factorial(n-1);
    }
    public static void main(String args[]){
        int n=5;
        int res = factorial(n);
        System.out.println("Factorial of "+n+" is : "+res);
    }
}