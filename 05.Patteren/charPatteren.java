import java.util.*;
public class charPatteren {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int n = sc.nextInt();
        char ch = 'A';
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
        int x = 1;
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print(x);
                x++;
            }
            System.out.println();
        }
    }
}
