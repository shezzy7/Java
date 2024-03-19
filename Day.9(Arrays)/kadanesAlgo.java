import java.util.*;
public class kadanesAlgo {
    //it's another method for calculating sum of sub-array with maximum sum
    public static void kadane1(int arr[],int n){
        int maxSum = Integer.MIN_VALUE;
        int curSum = 0;
        for(int i=0;i<n;i++){
            curSum = curSum+arr[i];
            if(curSum<0){//kadane's rule say if sum of any sub-array is -ve then make it zero
                curSum = 0;
            }
            if(curSum>maxSum){
                maxSum=curSum;
            }
        }
        System.out.println("Sum = "+maxSum);
    }

    public static void kadane2(int arr[],int n){
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>maxSum){
                maxSum=arr[i];
            }
        }
        System.out.println("Maximum sum is = "+maxSum);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter elements of array \n");
        for(int i=0;i<n;i++){
            System.out.print("element "+(i+1)+" : ");
            arr[i]=sc.nextInt();
        }
        //checking whetehr all elemnts are -ve 
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]<0){
                count++;
            }
        }
        if(count!=n){
            kadane1(arr,n);
        }
        else{
            kadane2(arr,n);
        }
    }
}
