public class k_tilling{
    public static int ways(int n){
        if(n==0 || n==1){
            return 1;
        }
        int fnm1 = ways(n-1);

        int fnm2 = ways(n-2);

        return fnm1+fnm2;
    }
    public static void main(String args[]){
        int n=5;
        System.out.print(ways(n));
    }
}