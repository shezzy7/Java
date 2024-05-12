public class prefixSum {
    //2nd method for calculating sub-array with maximum sum 
    public static void prefix(){
        int arr[]={1,-2,6,-1,3};
        int prefix[]=new int [5];
        prefix[0]=arr[0];
        for(int i=1;i<5;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        System.out.print("Our prefix sum array is : ");
        for(int i=0;i<5;i++){
            System.out.print(prefix[i]+" ");
        }
        System.out.println();
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<prefix.length;i++){
            int start = i;
            for(int j=i;j<prefix.length;j++){
                int end = j;
                int curSum = 0;
                curSum = start==0? prefix[start]:prefix[end]-prefix[start-1];
                maxSum = curSum>maxSum?curSum:maxSum;
            }
        }
        System.out.print("Sub-Array With maximum sum = "+maxSum);


    }
    public static void main(String args[]){
        prefix();
    }
}
