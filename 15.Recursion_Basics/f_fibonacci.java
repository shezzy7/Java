public class f_fibonacci{
    public static int fib(int n){
        if(n==0 || n==1){
            
            return n;
        }
        int fibnm1=fib(n-1);
        int fibnm2=fib(n-2);
        System.out.println(fibnm1+fibnm2+" ");
        return fibnm1+fibnm2;
    }
    public static void main(String args[]){
        //calculate last fibbonacci of n
        int n=7;
        int res = fib(n);
        System.out.println("Fibonacci of "+n+" is = "+res);
    }
}