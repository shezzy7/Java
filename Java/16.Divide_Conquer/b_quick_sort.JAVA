import java.util.*;
public class b_quick_sort{
    public static void quickSort(int arr[],int si , int ei){
        if (si>=ei){
            return
        }

        int pivot = partition(arr  , si , ei);
        quickSort(arr , si , pivot-1);
    }
    

    public static int partition(int arr[]  , int si , int ei){

        int pivot = arr[ei];
        int idx = si-1;
        for(int i=si , i<ei;i++){
            if (pivot>=arr[i]){
                idx+=1;
                int temp1 = arr[i];
                int temp2 = arr[idx];
                arr[i] = temp2;
                arr[idx] = temp1;
            }
        }

        idx++;
        int temp1 = arr[i];
        int temp2 = arr[idx];
        arr[i] = temp2;
        arr[idx] = temp1;
        return idx;

    }
    public static void main(String args[]){
        int arr[]=[3 , 2  , 4 , 1 , 5];
        quickSort(arr  , 0 , arr.length-1)
    }
}