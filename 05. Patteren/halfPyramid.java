import java.util.*;
public class halfPyramid {
    public static void main(String arg[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter last number : ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
}
