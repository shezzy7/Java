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
        //we are given width of floor(n).Height of floor is 2.And we have to find number of ways to palce tiles in this floor.Each tile is of 2*1(height,width). 
        int n=5;
        
        System.out.print(ways(n));
    }
}