public class reverseArray {
    //lets reverse the original 
    public static void reverse(int arr[]){
        int start=0,end=arr.length-1;
        while(start<end){
            int temp = arr[end];
            arr[end]=arr[start];
            arr[start]=temp;
            start++;
            end--;
        
        }

    }
    public static void main(String args[]){
        int arr[]={1,2,3,5,6,7,8,9};
        System.out.print("Original array is : ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        reverse(arr);
        System.out.print("Reversed array is : ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
