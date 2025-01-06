import java.util.*;
public class N_CountDistinctElements{
    public static void main(String args[]){
        //We are given an integer array and we have to find count of unique elements in the array

        int arr[] = {4,3,2,5,6,7,3,4,2,1};
        //To solve this we can use a hashSet as it stores only unique values and then after storing all the unique elements we can simply return length of our hashSet.
        HashSet<Integer> res = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            res.add(arr[i]);
        }
        System.out.print("Number of unique elements = " + res.size());
    }
}