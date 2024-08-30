public class i_power_of_n{
    public static int res(int n,int pow){
        if(pow==1){
            return n*1;
        }
        int pnm1 = res(n,pow-1); 
        return n*pnm1;

    }
    public static void main(String args[]){
        int n=3;
        int pow=4;
        System.out.print(n*res(n,pow-1));

        //time complexity-> O(n)
    }
}