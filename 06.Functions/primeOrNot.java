import java.util.*;
public class primeOrNot {
    public static boolean prime(int n){
       
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    } 
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        boolean p = prime(n);
        if(p==true){
            System.out.print("Prime");
        }
        else{
            System.out.println("Non prime");
        }

    }
}
