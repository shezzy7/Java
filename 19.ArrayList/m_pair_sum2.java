import java.util.*;
public class m_pair_sum2{
    public static boolean targetSum(ArrayList<Integer> list,int target){
        //two pointer approach-> O(n)
        //first of all we will find the point at which our list is broken mean indx at which sorting is disturbed.Here in given list 1 index is a index at which our list is broked.But we have to find it to make our code universal.And we will take this a right pointer and next index from it will be our left pointer
        int n = list.size();
        int rp=-1;
        for(int i=0;i<n-1;i++){
            if(list.get(i)>list.get(i+1)){
                rp=i;
                break;
            }
        }
        int lp = rp+1;
        while(rp!=lp){
            int curSum=list.get(lp)+list.get(rp);
            if(curSum==target){
                return true;
            }
            else if(curSum<target){
                lp = (lp+1)%n;
            }
            else{
                rp = (n+rp-1)%n;
            }
        }
        return false;
    }
    public static void main(String args[]){
        //we are given a sorted and rotated arraylist and a target element .We have to check there is pair of elements whose sum equalls target
        ArrayList <Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(10);
        int target = 16;
        System.out.println(targetSum(list,target));
        
    }
}