public class e_countingSort{
    public static void countingSort(int inp[]){
        //first of all we have to store number of occurences of each element in a array and to set size of this new array we have to find the maximum element in the array
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            max = Math.max(arr[i],max);
        } 
        int count[]=new int[max+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        int j=0;
        for(int i=0;i<count.length;i++){

            while(count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            }
        }
    }
    public static void main(String args[]){
        //in counting sort first we count number of prescence of each element in an array and then we use this array in sorting method
        int arr[]={5,6,3,8,7,1};
        countingSort(arr);
        System.out.print("Array after sorting is \n");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

