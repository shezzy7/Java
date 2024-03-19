import java.util.*;
public class floyedPatteren{

    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter number of rows : ");
        int rows = sc.nextInt();
        int n = 1;
        for(int i=1;i<=rows;i++){
            for(int k=1;k<=i;k++){
                System.out.print(n+" ");//1 \n 2 3 
                n++;
            }
            System.out.println();
        }
    }
}