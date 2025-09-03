public class d_01_knapsack_tabulations {
    
    public static int knapsack(int val[] , int wt[] , int W , int n){

        // No we are going to solve this problem with the help of tabulation concept , We will be doing same thing as we have done in memoization. But we will be doing this with the help of iteration instead of recursion.
        // 
        int dp[][] = new int[n+1][W+1];

        for(int i=0;i<n+1;i++){ //1st col all rows filled with 0s.
            dp[i][0]=0;

        }
        for(int i=0;i<W+1;i++){ //1st row all cols filled with 0s
            dp[0][i]=0;
        }
 
        for(int i=1;i<n+1;i++){
            for(int j=1;j<W+1;j++){
                // here in dp by i we mean number of items that we are going to use at this time and by j we mean weight of knapsack that we are dealing currently.
                // if we want to get value of first item then we will do this by i-1 , as we are running our loop by 1 instead of 0 due to traversing over dp array , so if we write i-1 then it will become 0 which is starting index. Also we can get weight of ith item by i-1
                int curr_val = val[i-1];
                int curr_w = wt[i-1];

                // if weight of current item is less then current knapsack capacity then we can add this in our dp array 
                if(curr_w<=j){
                    //And also at that point we have two choices whather to add or not this item in our current result. For this we will see if adding this gives us more profit or excluding this gives more.


                    
                    dp[i][j] = Math.max(curr_val + dp[i-1][j-curr_w], dp[i-1][j]);
                }

                else{
                    // else if capacity of knapsack is less then current items weight then we need to exclude this and for this situation we can take answer of previous situation. 
                    dp[i][j] = dp[i-1][j];
                }

            }
        }

        return dp[n][W]; //at last index our final value will be present there.

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
