
public class b_0_1_knapsack{

    public static int knapsack(int val[] , int wt[] , int W , int n){

        // we are give some weights associated with some values. Value[i] shows that we can get this value by giving weight[i]. We are also given a knapsack with capacity of W. So we can store upto W in knapsack. We have to calculate maximum value that we can get by selling upto weight less then or equall to W.

        // Here we can include a item or not. There is condition of adding frictions of items.

        // so here we are going to solve this by simple recursion. The strategy that we can follow is that we have choice at each point to add or not a particular element. Before adding an elmenet we need to check wheather if we add this element then does our bag has capacity to hold this one , if so then have two cases, first we can add this and or not. First we will add and will move to other and will go on counring the profit. second we can exclude this and calculte for others by skipping this one.Then at last see which decision gives us the more benefit then we will return its answer.
        // IF current weight is more then our capacity then we have single option to eclude this and check for others.

        // Base Case : As here we see two values are changing over time , one is index and other is cpacity of our bag.So if at any time our index reaches at last then we need to stop and if any condition our capacity reaches to 0 then we need to stop here because we  can't add more profit.

        if(n==0 || W==0){
            return 0;
        }

        // check if weight of current item is in range of our capacity
        if(wt[n-1]<=W){
            // two case
            // i-Include
            int ans1 = val[n-1] + knapsack(val, wt, W-wt[n-1], n-1);
            // exclude
            int ans2 = knapsack(val, wt, W, n-1);

            // then we need to return maximum of both
            return Math.max(ans1 , ans2);
        }
        else{
            // we will exclude this
            return knapsack(val, wt, W, n-1);
        }
    }
    public static void main(String args[]){
        int val[] = {15 , 14 , 10 , 45 , 30};
        int wt[]  = {2 , 5 , 1 , 3 , 4};
        int W = 7;
        int ans = knapsack(val , wt , W , val.length);
        System.out.println(ans);
    }
}