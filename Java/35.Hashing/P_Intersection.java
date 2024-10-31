import java.util.*;
public class P_Intersection{
    public static void main(String args[]){
        //We are given two arrays we have to find intersection of two arrays
        int arr1[] = {5,3,6,4};
        int arr2[] = {1,2,3,5};
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        //now as we have add all teh elments of arr1 to set now we will iterate over arr2 and will check if hashset contains any elemnt present in arr2 then we wil add it in our result list.
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<arr2.length;i++){
            if(set.contains(arr2[i])){
                list.add(arr2[i]);
            }
        } 
        //now lets print our result list (as only 3 and 5 are present in both arrays so it will be our result)
        for(int val : list){
            System.out.print(val+" ");
        }
    }
}