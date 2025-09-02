public class c_01_knapsack_memoization {

    public static int knapsack(int val[] , int wt[] , int W , int n , int dp[][]){
        if(n==0 || W==0){
            return 0;
        }
        // we can solve that with the help of memoization that if we have already calculated the value for a particular n and W then we can return that value directly.
        // so here we are making a 2D array of size n+1 and W+1 and initializing it with -1.
        // then we are checking if the value for a particular n and W is already calculated then we can return that value directly.
        // otherwise we will calculate the value for a particular n and W.
        if(dp[n][W] != -1){
            return dp[n][W];
        }
        if(wt[n-1]<=W){
            int ans1 = val[n-1] + knapsack(val, wt, W-wt[n-1], n-1, dp);
            int ans2 = knapsack(val, wt, W, n-1, dp);
            dp[n][W] = Math.max(ans1, ans2);
            return dp[n][W];
        }
        else{
            dp[n][W] = knapsack(val, wt, W, n-1, dp);
            return dp[n][W];
        }
    }
    public static void main(String args[]) {
        int val[] = { 15, 14, 10, 45, 30 };
        int wt[] = { 2, 5, 1, 3, 4 };
        int W = 7;
        int n = val.length;
        int dp[][] = new int[n + 1][W + 1];
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < W + 1; j++) {
                dp[i][j] = -1;
            }
        }
        int ans = knapsack(val, wt, W, n, dp);
        System.out.println(ans);
    }
}
