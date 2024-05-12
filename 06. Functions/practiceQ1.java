import java.util.*;
public class practiceQ1 {
    public static void prime1(int n){
        System.out.print("Prime number between to "+n+" are these : ");
        for(int i=2;i<=n;i++){
           
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }
    public static boolean isPrime(int i){
        for(int k=2;k<=Math.sqrt(i);k++){
            if(i%k==0){
                return false;
            }

        }
        return true;
    }
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number : ");
        int n = sc.nextInt();
        prime1(n);
    }
}
