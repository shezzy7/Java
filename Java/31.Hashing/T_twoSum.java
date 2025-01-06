import java.util.*;
public class T_twoSum{
    public static ArrayList<Integer> twoSum(int nums[],int target){
        //Given an array of integers and a target.We have to find indexes of any two elements such that they add up to target.

        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                list.add(i);
                list.add(map.get(target-nums[i]));
                break;
            }
            map.put(nums[i],i);
        }
        return list;
    }
    
    public static void main(String args[]){
        int nums[] = {2,11,7,15};
        int target = 9;
        System.out.print(twoSum(nums,target));
    }
}