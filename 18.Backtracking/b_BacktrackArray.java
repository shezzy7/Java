
public class b_BacktrackArray{
    public static void changeArr(int arr[],int i,int val){
        // base case
        if(i==arr.length){
            printArr(arr);
            return;
        }
        // kaam
        arr[i]=val;//First adding a value at ith index
        changeArr(arr,i+1,val+1);//Recursive step
        // minus 2 from given value after coming back from recursive call.
        arr[i]=arr[i]-2;//Backtracking step(Backtracking step will be always written after recusive call after coming back from this recursive call)
    
    }
    // Print array
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String args[]){
        
        int arr[] = new int[5];
        changeArr(arr,0,1);
        printArr(arr);
    }
}