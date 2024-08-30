public class h_first_occurence{
    public static int first(int arr[],int i,int target){
        if(target==arr[i]){
            return i;
        }
        if(i==arr.length-1){
            return -1;
        }
        return first(arr,i+1,target);
    }
    public static void main(String args[]){
        //find the firsst ocurence of an element in array using recursion
        int arr[]={1,2,3,6,3,5,6,9,10}
        int target = 6;
        System.out.print(first(arr,0,target));
    }
    //second method
    // public static int first(int arr[],int i,int target){
        
    //     if(target==arr[i]){
            
    //         return i;
    //     }
    //     if(i==0){
    //         return -1;
    //     }
    //     return first(arr,i-1,target);
    // }
    // public static void main(String args[]){
    //     //find the firsst ocurence of an element in array using recursion
    //     int arr[]={1,2,3,6,3,5,9,6,10};
    //     int target = 6;
       
    //     System.out.print(first(arr,arr.length-1,target,last));
    // }
    
}