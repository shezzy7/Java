import java.util.*;
public class halfPyramidNumbers {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter number of rows : ");
        int n = sc.nextInt();
        int org = n;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=org;j++){
                System.out.print(j +" ");
            }
            org--;
            System.out.println();
        } 
    }
}
