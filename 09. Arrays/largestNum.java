public class largestNum {
    //here we will find largest element in the array
    public static void largest(int arr[]){
        int large = Integer.MIN_VALUE;//here Integar.MIN_VALUE means -infinty means smallest value 
                                      //it has another type also which is Integer.MAX_VALUE
                                      //it means +infinity means largest value
        for(int i=0;i<arr.length;i++){
            if(arr[i]>large){
                large=arr[i];
            }
        }
        System.out.println("Largest element in the array is  = "+large);

    }
    public static void main(String args[]){
        int arr[]={25,36,95,41,26,35,43};
        largest(arr);
    }
}
