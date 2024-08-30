import java.util.*;
public class H_stockSpan{
    public static void stockSpan(int stock[],int span[]){
        //To solve this problem we will find index of previous high price and then will minus it from index of current price,it will give us no of days of  
        Stack<Integer> s = new Stack<>();
        span[0] = 1;//first price don't contains any previous day with less price so it is only day so put 1 for its result.
        s.push(0);//also push index of first value on stack as we have counted it.
        for(int i=1;i<stock.length;i++){
            int curr = stock[i];
            while(!s.isEmpty() && curr>stock[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                span[i] = i+1;
            }
            else{
                int prevHigh = s.peek();
                span[i] = i-prevHigh;
            }
            s.push(i);
        }
    }
    public static void main(String args[]){
        //Given question is very important and has been asked in many coding interviews.
        
        //In this problems we are given an array of stock which tells price of stock every day stock[i] is the price of stock on ith day.We have to find span of this stock.Span means we have to find maximum number of consective days for which price <= todaysPrice .
        int stock[] = {100,80,60,70,60,75,85,105,105,106};
        int span[] = new int[stock.length];
        stockSpan(stock,span);

        for(int i=0;i<span.length;i++){
            System.out.print(span[i]+" ");
        }
    }
}