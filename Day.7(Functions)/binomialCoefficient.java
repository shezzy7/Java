import java.util.*;
public class binomialCoefficient{
    public static int factorial( int n){
                int fact = 1;
                for(int i=1;i<=n;i++){
                    fact*=i;
                }
                return fact;
    }
    public static void coefi(int a,int b){
        int n= factorial(a);
        int m=factorial(b);
        int dif=factorial(a-b);
        int coeficient = n/(m*dif);
        System.out.print("Coeficient = "+coeficient);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
  
        System.out.print("Enter r : ");
        int r = sc.nextInt();
        coefi(n,r);
    }
}


