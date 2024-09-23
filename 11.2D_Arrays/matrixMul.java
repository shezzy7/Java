import java.util.*;
public class matrixMul{
    public static void MUL( int A[][],int B[][],int C[][],int M,int N,int P ){
        for(int i=0;i<M;i++){
            for(int j=0;j<N;j++){
                C[i][j]=0;
                for(int k=0;k<P;k++){
                    C[i][j] += A[i][k]*B[k][j]; 
                }
            }
        }
        for(int i=0;i<M;i++){
            for(int j=0;j<N;j++){
                System.out.print(C[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int M = 2;
        int N = 3;
        int P = 3;
        
        int A[][] = new int[M][P];
        int B[][] = new int[P][N];
        int C[][] = new int[M][N];
        //multiplication b\w tow matrices can be done only if the colSize of 1st array is equall to rowSize of 2nd array
        //for storing their product in a new array can be done if the rowSize of that resulting array  is equal to rowSize of 1st array and colSide of that resulting array is equall to colSize of 2nd array
        System.out.print("Enter "+(M*P)+" elements of A : ");
        for(int i=0;i<M;i++){
            for(int j=0;j<P;j++){
                A[i][j]=sc.nextInt();
            }
        }
        System.out.print("Enter "+(P*N)+" elements of B : ");
        for(int i=0;i<P;i++){
            for(int j=0;j<N;j++){
                B[i][j]=sc.nextInt();
            }
        }
        MUL(A,B,C,M,N,P);

    } 
}
