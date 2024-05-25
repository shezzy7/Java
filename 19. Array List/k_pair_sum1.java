import java.util.*;
public class k_pair_sum1{
    public static boolean targetSum(ArrayList<Integer> list,int target){
        //brute force approach-> O(n^2)
        for(int i=0;i<list.size()-1;i++){
            for(int j=i+1;j<list.size();j++){
                if(list.get(i)+list.get(j)==target){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String args[]){
        //we are given an arraylist and a target element .We have to check there is pair of elements whose sum equalls target
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