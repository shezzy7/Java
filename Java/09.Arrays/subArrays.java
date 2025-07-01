public class subArrays {
    //print subarrays of a given array
    //subarray is a contiguous part of array.An array that is inside another array.
    //for example consider an array [1,2,3,4] , there 10 non-empty sub-arrays of this array .
    //the sub-arrays are [1],[1,2],[1,2,3],[1,2,3,4],[2],[2,3],[2,3,4],[3],[3,4],[4]
    public static void subArrays(int arr[]){
        int count = 0;

        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=i;j<arr.length;j++){
                int end = j;
                System.out.print("{ ");
                for(int k=start; k<=end;k++){
                    System.out.print(arr[k]+" ");
                }

                System.out.print("} ");
                count++;
            }
            System.out.println();
        }
        System.out.println("Total no of subarrays = "+count);
    }
    public static void main(String args[]){
        int arr[]={5,6,8};
        subArrays(arr);
    }
}
