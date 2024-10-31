public class j_optimized_power{
    public static int Power(int n,int pow){
        if(pow==0){
            return 1;
        }
        int halfSq = Power(n,pow/2)*Power(n,pow/2);
        if(pow%2!=0){
            halfSq*=n;
        }
        return halfSq;
    }
    public static void main(String args[]){
        int n=2;
        int pow=6;
        System.out.print(Power(n,pow));

        //Time complexity -> log(n)

    }
}