import java.util.*;
public class q_permutations{

    // 
    public static void findPermutation(List<List<Integer>>res,int nums[],boolean used[],List<Integer>temp){
        // base case
        if(nums.length==temp.size()){
            res.add(new ArrayList<>(temp));
            return;
        }
        //kaam
        for(int i=0;i<nums.length;i++){
            // check if used
            if(used[i]){
                // skip
                continue;
            }
            used[i]=true;
            temp.add(nums[i]);
            findPermutation(res,nums,used,temp);
            used[i]=false;
            temp.remove(temp.size()-1);
        }
    }
    public static void main(String args[]){
        // We are given an array of integers and we have to find all the permutations of this array.
        // Array can contain duplicates

        int nums[] = {1,1,3};
        List<List<Integer>> res = new ArrayList<>();
        findPermutation(res,nums,new boolean[nums.length],new ArrayList<>());
        // print result
        for(int i=0;i<res.size();i++){
            List<Integer> curList = res.get(i);
            for(int j=0;j<curList.size();j++){
                System.out.print(curList.get(j));
            }
            System.out.println();
        }
    }
}