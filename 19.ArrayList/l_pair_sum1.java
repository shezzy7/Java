import java.util.*;
public class l_pair_sum1{
    public static boolean targetSum(ArrayList<Integer> list,int target){
        //two pointer approach-> O(n)
        int lp=0,rp =list.size()-1;
        while(lp<rp){
            if(list.get(rp)+list.get(lp)==target){
                return true;
            }
            else if(list.get(rp)+list.get(lp)>target){
                rp--;
            }
            else{
                lp++;
            }
        }
        return false;
    }
    public static void main(String args[]){
        //we are given a sorted arraylist and a target element .We have to check there is pair of elements whose sum equalls target
        ArrayList <Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int target = 5;
        System.out.println(targetSum(list,target));
        
    }
}