public class g_sorted{
    public static boolean isSorted(int arr[],int i){
        // checking whether given array is sorted or not.
        if(i==arr.length-1){
            return true;
        }

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