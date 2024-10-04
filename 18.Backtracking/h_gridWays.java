
public class h_gridWays{
    public static int gridWays(int i,int j,int n,int m){
        // base case
        if(n-1==i && m-1==j){
            return 1;
        }
        else if(i==n || j==m){ // edge case
            return 0;
        }
        

        // kaam
        int ways1 = gridWays(i+1,j,n,m);
        int ways2 = gridWays(i,j+1,n,m);
        return ways1+ways2;
    }
    public static void main(String args[]){
        
        int n=3,m=3;
        System.out.println(gridWays(0,0,n,m));

    }
}