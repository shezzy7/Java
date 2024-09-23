import java.util.*;
public class H_majorityElement{
    public static void majority(int nums[]){
        // HashMap<Integer,Integer> map = new HashMap<>();
        // for(int i=0;i<nums.length;i++){
        //     if(map.containsKey(nums[i])){
        //         map.put(nums[i],map.get(nums[i])+1);
        //         continue;
        //     }
        //     map.put(nums[i],1);
        // }
        // int n = nums.length/3;
        // ArrayList<Integer> list = new ArrayList<>();
        // Set<Integer> keys = hs.keySet();
        // for(Integer k : keys){
        //     if(map.get(k)>n){
        //         list.add(k);
        //     }
        // }
        // for(int i=0;i<list.size();i++){
        //     System.out.print(list.get(i));
        // }


        //concise code
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        for(Integer key : map.keySet()){
            if(map.get(key)>nums.length/3){
                System.out.print(key+" ");
            }
        }
        
    }
    public static void main(String args[]){
        //Given an integer array of size n.Find all the elemnts that appear moore then [n/3] times in array.
        //Example
        //num[]={1,3,2,5,1,3,1,5,1}
        //output -> 1
        //as n = 9. So n/3=3. So we have to print only those element which are present more then 3 times.So we see that 1 is the only elment which is present more then 3 time so output will be 1
        // nums[]={1,2}
        // output -> 1,2 bcz n/2 = 2/3=0 
        int nums[]={1,3,2,5,1,3,1,5,1};
        majority(nums);


    }
}