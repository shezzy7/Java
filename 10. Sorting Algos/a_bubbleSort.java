import java.util.*;
public class a_bubbleSort{
    //concept of bubble sort is that repeatedly swap adjacent elements if in wrong order
    public static void bubble(int n,int array[]){
        boolean swap = false;
        for(int i = 0 ; i<n-1 ; i++ ){
            for(int j = 0 ; j<n-i-1; j++){//as at every iteration, one element of array reaches at its correct position so we decrease no of iterations by one at every iteration to reduce our time complexity
                if(array[j]>array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    swap = true;
                }
            }
            if(!swap){//if at any iteration swapinng does not take place then thats mean that array is sorted now so we will break our loop to reduce our time complexity
                break;
            }
        }
        System.out.println("Array sorted in ascending order successfully!");
        for(int i=0;i<n;i++){
            System.out.print(array[i]+" ");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        int array[] = new int[n];
        System.out.print("Enter elements of array : ");
        for(int i=0;i<n;i++){
            array[i] = sc.nextInt();
        }
        bubble(n,array);
        
        //Time complexity O(n^2)
    }
}