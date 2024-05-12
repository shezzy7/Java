public class j_optimized_power{
    public static int Power(int n,int pow){
        if(pow==0){
            return 1;
        }
        int res = Power(n,pow/2);
        res*=res;
        if(pow%2!=0){
            res*=n;
        }
        return res;
    }
    public static void main(String args[]){
        int n=2;
        int pow=5;
        System.out.print(Power(n,pow));

        //Time complexity -> log(n)

    }
}