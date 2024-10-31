import java.util.*;
public class c_insertionSort{
    public static void insertionSort(int arr[]){
        //In insertion sort we assume a part of array as sorted and then take an element from unsorted part and place it at its right position in sorted and keep doing this untill whole array becomes sorted.
        //here we are starting our loop from 1 index bcz we are assuming 0 index as sorted part
        for(int i=1;i<n;i++){
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
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of size : ");
        int n = sc.nextInt();
        int arr[]= new int[n];
        System.out.print("Enter "+n+" elements of array : ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Our original array is :");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

        countingSort(arr,n);
        System.out.print("Arrays after sorting  is :");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
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
