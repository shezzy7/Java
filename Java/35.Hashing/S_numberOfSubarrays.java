import java.util.*;
public class S_numberOfSubarrays{
    public static int findCount(int nums[],int k){
        //we are given an array nums and a value k.We have to find total number of subarrays whose sum equalls to k.And return it.
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);//edge case
        int sum = 0;
        int ans = 0;
        for(int j=0;j<nums.length;j++){
            sum+=nums[j];
            if(map.containsKey(sum-k)){
                ans+=map.get(sum-k);

            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return ans;
    }

    public static void main(String args[]){
        int nums[] = {10,2,-2,-20,10};
        int k=-10;
        int res = findCount(nums,k);
        System.out.print(res);
    }
}