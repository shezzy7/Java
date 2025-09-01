import java.util.*;

public class e_fractional_knapsack{

    public static int fill_knapsack(int weights[] , int values[] , int W , int N){

        /*  Given the weights and values of N items , put these items in a knapsack(bag) of size W to get the maximum total value in the knapsack.
        Example : 
            input : values = [60 , 100 , 120] , weights = [10 , 20 , 30] , W = 50
            output : 240
            Explanation: In given bag we can only store 50kg. If we put 10kg present at 0th index , 20 kg at 1st index and 20 kg from 2nd index then the amount that we get is 240.And this is the maximum amount that we can get. There is no other strategy that gives us more value.

        */


        /*
            Approach : If we get ratio of all the items as value[i]/weight[i], then we can see which item is more expensive. As whose ratio is greater then its means that it is more expensive so we should get it. So we should calculate ratios of all the give items. Then sort them in some ascending or descending oreder. If the ratios are sorted in asceding order then the elements at last are more valueable so we should pick we as much weight as much we can of this item. But here is a problem that if we sort the ratios then how can we see that a particular ratio belongs to that particular item. For this purpose we can store indeces alongside ratio by using a 2d array. In this 2d array we will store items like [index_in_original_arrays(values,weights) , value[i]/weight[i]_ratio_of_that_item]
            Then we will sort this 2d array on the basis of second index(ratio basis) 
        
            After all of this we can start getting items to fill our knapsack.If the first most expensive item fills our bag then we will take as much as this can fill the bag , and we can calculate the value with the help of ratio of capacity of bag by multiplying both. And if our knapsack is bigger and ask for more items then we will move to next most valueable item , add it according to given capacity and increase of res.

        
        
         */

        //  our ratio can be integer or some double type value we will use a double type 2d array for storing ratio and corresponding index
        double ratio[][] = new double[N][2];

        for(int i=0;i<N;i++){
            ratio[i][0] = i; //index
            ratio[i][1] = values[i]/(double)weights[i];

        }

        // sort ratio on the basis of second index as it contains the ratio
        Arrays.sort(ratio , Comparator.comparingDouble(o -> o[1]));

        int capacity = W;//for cheking remaing capacity
        int res = 0;
        // Now our ratio array is sorted in asceding order so our most expensive value will be at last
        for(int i=N-1;i>=0;i--){
            // if current items total weights is in range of our remaing capacity , then we can add this item as a whole
            int idx = (int)ratio[i][0];
            if(weights[idx]<=capacity){
                res+=values[idx];
                capacity-=weights[idx];
            }
            // otherwise we will pick the adjustable weight and will stop moving forward as our knapsack will be filled
            else{
                // and the value will ramining capacity(weight) multiply by ratio(rate per item)
                res+=(capacity*ratio[i][1]);
                capacity-=capacity;
                break;
            }
        }


        return res;
    }
    public static void main(String args[]){
        int weights[] = {10 , 20  , 30};
        int values[] = {60 , 100 , 120};
        int wt = 50;
        int n = 3;
        int res = fill_knapsack(weights , values , wt ,n);
        System.out.println(res);
    }
}