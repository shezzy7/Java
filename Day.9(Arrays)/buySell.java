// Quesstion-> You are given an array prices where prices[i] is the price of a given 
//                 Stock on the ith day. You want to maximize your peofit by choosing a 
//                 single day to buy one stock and choosing a different day in the future 
//                 to sell that stock.Return the maximum profit you can achieve from this 
//                 transaction.If you cannot achieve any profit,return 0
import java.util.*;
public class buySell{
    public static int profit(int prices[],int n){
        int buyPrice = Integer.MAX_VALUE;
        int globalProfit = 0;
        int sellDay=0,buyDay=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(buyPrice<prices[i]){
                int currentProfit = prices[i]-buyPrice;
                if(globalProfit<currentProfit){
                    globalProfit = currentProfit;
                    sellDay = i;
                }
            }
            else{
                buyPrice = prices[i];
                

            }
        }
        System.out.print(" you will earn maximum profit = ");
        return globalProfit;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of days : ");
        int n = sc.nextInt();
        int prices[] = new int[n];
        System.out.println("Enter prices");
        for(int i=0;i<n;i++){
            System.out.print("Price "+(i+1)+": ");
            prices[i]=sc.nextInt();
        }
        System.out.println(profit(prices,n));


    }
    
}