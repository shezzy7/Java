public class e_factorial{
    public static int factorial(int n){
        if(n==1){
            return 1;
        }
        return n*factorial(n-1);
    }
    public static void main(String args[]){
        int n=5;
        int res = n*factorial(n-1);
        System.out.println("Factorial of "+n+" is : "+res);
    }
}