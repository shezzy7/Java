import java.util.*;
public class binarySearch {
    //binary search can be applied only on sorted array.Sorting can be in increasing order or in decreasing order.
    public static int binarySearch(int arr[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter key element : ");
        int key = sc.nextInt();
        int start = 0,end=arr.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(key==arr[mid]){
                System.out.print(key+" is present at index ");
                return mid; 
            }
            else if(key>arr[mid]){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }

        return -1;

    }
    public static void main(String args[]){
        int arr[]={10,20,30,40,50,60,70,80};
        System.out.print(arr.length);
       System.out.print( binarySearch(arr));
    }
}
