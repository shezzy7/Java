import java.util.*;
public class i_gridWaysTrick {
    public static int countWays(int n,int m){

        // formual-> (n-1+m-1)!/(n-1)!(m-1)!
        int fact1 = 1;
        for(int i=(n-1)+(m-1);i>=1;i--){
            fact1*=i;
        }
        
        int fact2=1;
        for(int i=n-1;i>=1;i--){
            fact2*=i;
        }

        int fact3=1;
        for(int i=m-1;i>=1;i--){
            fact3*=i;
        }

        fact2*=fact3;
        return fact1/fact2;


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int m;
        System.out.print("Enter m : ");
        m=sc.nextInt();
        System.out.print("Enter n : ");
        n=sc.nextInt();
        int ways = countWays(n,m);
        System.out.println(ways);

    }
}
