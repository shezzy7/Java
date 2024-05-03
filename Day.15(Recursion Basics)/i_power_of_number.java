public class i_power_of_number{
    public static void res(int n,int pow){
        if(pow==1){
            return n*n;
        }
        return n*res(n,pow-1);

    }
    public static void main(String args[]){
        int n=3;
        int pow=3;
        System.out.print(res(n,pow-1));
    }
}