import java.util.*;
public class butterflyPatteren {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        //first Part
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int k=1;k<=n-i;k++){
                System.out.print(" ");
            }
            for(int l=1;l<=n-i;l++){
                System.out.print(" ");
            }
            for(int m=1;m<=i;m++){
                System.out.print("*");
            }
            System.out.print("\n");
        }

        //Second Part
        
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int k=1;k<=n-i;k++){
                System.out.print(" ");
            }
            for(int l=1;l<=n-i;l++){
                System.out.print(" ");
            }
            for(int m=1;m<=i;m++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        // for(int i = 1;i<=n;i++){
        //     for( int j=n;j>=i;j--){
        //         System.out.print("*");
        //     }
        //     for(int k=1;k<i;k++){
        //         System.out.print(" ");
        //     }
        //     for(int l=1;l<i;l++){
        //         System.out.print(" ");
        //     }
        //     for(int m=i;m<=n;m++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
    }
}
