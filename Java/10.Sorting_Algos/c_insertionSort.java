import java.util.*;
public class c_insertionSort{
    public static void insertionSort(int arr[]){
        //In insertion sort we assume a part of array as sorted and then take an element from unsorted part and place it at its right position in sorted and keep doing this untill whole array becomes sorted.
        //here we are starting our loop from 1 index bcz we are assuming 0 index as sorted part
        for(int i=1;i<arr.length;i++){
            int current = arr[i];
            int sorted = i-1;
            while(sorted>=0 && arr[sorted]>current){//in this loop we will find the correct position of current eleemnt of unsorted part in sorted part
                arr[sorted+1]=arr[sorted];
                sorted--;
            }
            //here we will place current eleemnt at its correct posititon
            arr[sorted+1]=current;
        }
    }
    public static void main(String args[]){
        int array[] = { 8, 3, 5, 2, 7 };

        insertionSort(array);
        System.out.print("Array after sorting  is :");
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }

        //Time complexity O(n^2)
        
    }
}

//Google summer of code
//Ali baba's summer of code
//X.org foundation
// HYPERLEDGER FOUNDATIN mentorship programm
//summer of hashskill 2023
//the linux foundation
//CROSS
// season of KDE 2023
