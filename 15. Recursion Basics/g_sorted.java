public class g_sorted{
    public static boolean isSorted(int arr[],int i){
        //we are here setting our base case ,the programm will reach this condition after checking all the elements.And if elements are sorted then we will return true. 
        if(i==arr.length-1){
            return true;
        }
        //If at any point our first elemnt becomes greater then second then false will be returned.
        if(arr[i]>arr[i+1]){
            return false;
        }

        return isSorted(arr,i+1);
    }
    public static void main(String args[]){
        int arr[] = {2,5,6,8,67,15};
        System.out.println(isSorted(arr,0));
        
    }
}