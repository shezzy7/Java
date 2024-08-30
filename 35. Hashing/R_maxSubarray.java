import java.util.*;
public class R_maxSubarray{

    public static void main(String args[]){
        //We are given an array and we to find length of longest subarray whose sum equalls 0.
        int nums[] = {15,-2,2,-8,1,7,10,23};
        int sum=0;
        int len = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int j=0;j<nums.length;j++){
            sum+=nums[j];

            if(map.containsKey(sum)){
                len = Math.max(len,j-map.get(sum));
            }
            else{
                map.put(sum,j);
            }
        }

        System.out.println("Length of longest subarray with sum equall to 0 is => "+len);
    }
}