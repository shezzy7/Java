import java.util.*;
public class a_bubbleSort{
    //concept of bubble sort is that repeatedly swap adjacent elements if in wrong order
    public static void bubble(int array[]){
        int n=array.length;
        boolean swapped = true;
        while(swapped){
            swapped = false;
            for(int j = 0 ; j<n-1; j++){
                if(array[j]>array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    swapped = true;
                }
            }
            n--;//as at every iteration, one element of array reaches at its correct position so we decrease no of iterations by one at every iteration to reduce our time complexity
            
        }
        System.out.println("Array sorted in ascending order successfully!");
        for(int i=0;i<array.length;i++){
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
        bubble(array);
        
        //Time complexity O(n^2)
    }
}