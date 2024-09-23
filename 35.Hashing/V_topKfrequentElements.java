import java.util.*;
public class V_topKfrequentElements{

    public static void topKele(int nums[],int k){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        System.out.println("HashMap ->"+map);
        TreeMap<Integer,Integer> tMap = new TreeMap<>();
        for(int key : map.keySet()){
            tMap.put(map.get(key),key);
        }
        System.out.println("TreeMap ->"+tMap);
        int res[] = new int[k];
        Stack<Integer> st = new Stack<>();
        for(int key : tMap.keySet()){
            st.push(tMap.get(key));
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<k;i++){
            list.add(st.peek());
            res[i]=list.get(i);
            st.pop();
        }

        System.out.print("Res list ->"+list);
        System.out.print("Res array ->"+res);
    }
    public static void main(String args[]){
        //we are given an integer arrray nums and an element k.We have to find most frequent k element in nums and return them.
        int nums[]={1,2,3,4};
        int k=2;
        topKele(nums,k);
    }
}