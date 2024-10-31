public class smallestNum {
      //here we will find smallest element in the array
      public static void smallest(int arr[]){
        int small = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(small>arr[i]){
                small=arr[i];
            }
        }
        System.out.println("Largest element in the array is  = "+small);

    }
    public static void main(String args[]){
        int arr[]={25,36,95,41,26,35,43};
        smallest(arr);
    }

}
