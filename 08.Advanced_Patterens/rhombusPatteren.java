import java.util.*;
public class rhombusPatteren {
    public static void rhombus(int n){
        for(int i=1;i<=n;i++){//rows
            for(int j=1;j<=n-i;j++){//spaces
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){//stars
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no or rows : ");
        int n = sc.nextInt();
        rhombus(n);
    }
}
