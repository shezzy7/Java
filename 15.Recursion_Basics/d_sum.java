public class d_sum{
    
    public static int sum(int n){

        if(n==1){
            return n;
        }
        int curSum =sum(n-1);
        int res = n+curSum;
        return res;
    }

    public static void main(String args[]){
        //WAP to get sum of first n numbers
        int n = 7;
        int add = sum(n);
        System.out.println("Sum of first "+n+" natural numbers = "+add);
    }
}