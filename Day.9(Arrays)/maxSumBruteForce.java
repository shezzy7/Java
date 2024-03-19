import java.util.*;
public class maxSumBruteForce {
    //a programm to find sum of sub-array with maximum sum from a given array
    public static void maxSum(int arr[]){
        int count = 1;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int start = i;
            for(int j=i;j<arr.length;j++){
                int end = j;
                int currSum = 0;
                for(int k = start;k<=end;k++){
                    currSum = currSum+arr[k];
                }
                System.out.println("Subaray "+count+" Sum = "+currSum);
                count++;
                if(currSum>maxSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.print("Sub-array with maximum sum is =  "+maxSum);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter size of array : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter elements of array");
        for(int i=0;i<size;i++){
            System.out.print("Enter element "+(i+1)+" : ");
            arr[i]=sc.nextInt();
        }
        maxSum(arr);


        
    }
}
