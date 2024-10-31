
public class h_gridWays{
    public static int gridWays(int i,int j,int n,int m){
        // base case
        if(n-1==i && m-1==j){
            return 1;
        }
        else if(i==n || j==m){ // edge case(if we are at last col then we cannot go to right or if we are at last row then we cannot go downward more.)
            return 0;
        }
        

        // kaam
        int ways1 = gridWays(i+1,j,n,m);//ways by going downward from this box
        int ways2 = gridWays(i,j+1,n,m);//ways by going rightward by this box
        return ways1+ways2;
    }
    public static void main(String args[]){
        // we are given a matrix of size m*n,And we are standing at box of (0,0) and we have to find total number of ways to reach at last
        int n=3,m=3;
        System.out.println(gridWays(0,0,n,m));

    }
}