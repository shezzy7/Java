import java.util.*;
public class O_Union{
    public static void main(String args[]){
        //we are given two arrays and we have to find union of these arrays.

        int arr1[] = {1,2,3,4,5,6};
        int arr2[] = {2,5,10,11,23};
        // findUnion(arr1,arr2);
        //lets print the results
       
        //inserting all the elements of both arrays in a hashset,as it will add all the elements without repetence and then we'll move them in an array
        HashSet<Integer> hSet = new HashSet<>();
        int i=0,j=0;
        while(i<arr1.length || j<arr2.length){
            if(i<arr1.length ){
                hSet.add(arr1[i]);
                i++;
            }
            if(j<arr2.length ){
                hSet.add(arr2[j]);
                j++;
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int val : hSet){
            list.add(val);
        }
        i=0;
        int res[] = new int[list.size()];
        while(i<list.size()){
            res[i] = list.get(i);
            i++;
        }
        for( int k=0;k<res.length;k++){
            System.out.print(res[k]+" ");
        }
        
    }
}