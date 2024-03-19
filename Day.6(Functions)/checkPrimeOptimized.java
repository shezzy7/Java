import java.util.*;
public class checkPrimeOptimized { //there different ways to gey prime of a number but the optimised way is follwing
public static boolean prime(int n){
    for(int i=2;i<=Math.sqrt(n);i++){
        if(n%i==0){
            return false;
        }
    }
    return true;
}
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number : ");
    int n = sc.nextInt();
    boolean x = prime(n);
    if(x==true){
        System.out.print("Prime");
    }
    else{
        System.out.print("non prime");
    }
}
    
}
