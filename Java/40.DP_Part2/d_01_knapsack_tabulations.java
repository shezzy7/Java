public class d_01_knapsack_tabulations {
    
    public static int knapsack(int val[] , int wt[] , int W , int n){
        int dp[][] = new int[n+1][W+1];
        for(int i=0;i<n+1;i++){
            for(int j=0;j<W+1;j++){
                dp[i][j] = -1;
            }
        }
        for(int i=0;i<n+1;i++){
            for(int j=0;j<W+1;j++){
                if(i==0 || j==0){
                    dp[i][j] = 0;
                }
                else if(wt[i-1]<=j){
                    dp[i][j] = Math.max(val[i-1] + dp[i-1][j-wt[i-1]], dp[i-1][j]);
                }
                else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[n][W];
    }
    public static void main(String args[]){
        int val[] = {15 , 14 , 10 , 45 , 30};
        int wt[] = {2 , 5 , 1 , 3 , 4};
        int W = 7;
        int n = val.length;
        int ans = knapsack(val, wt, W, n);
        System.out.println(ans);
    }
}
