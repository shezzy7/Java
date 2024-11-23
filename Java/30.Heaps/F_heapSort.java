public class F_heapSort {
    
    public static void heapSort(int arr[]){
        //We are given an array of integers .We have to sort this array in descending order using concept of heap.
        //First of all we have to keep two things in mind.One is that if we asked to sort the given array in ascending order then we first make it a max-heap and if we are asked to sort it in descending order then we first make a min-heap.
        //So now first as we are asked to sort it in descending order so first we will make a min-heap.
        //for making it a min-heap we will call heapify function for non-leaf nodes which will make them a min-heap.So for getting non-leaf nodes we will run a loop from sizeOFArray/2 to 0.And all the non-leaf nodes will lie in these indexes.
        int n = arr.length;
        for(int i=n/2;i>=0;i--){
            heapify(arr,i,n);
        }

        //now in step 2 after making it a min-heap.We will sort it in following way 
        //first of all as our minimum element is at top of heap , but for making a descending order array we have to place it at last of array.So will swap it with last element of heap.And after swaping our heap will be un-balanced , so will call heapify for 0th index as we added this element newly in result of swaping as it is creating un-balancy.But we will exclude our last element which we have just place from top to end.As it is at its correct position we don't need to chnage it's location
        //So we will run a loop from n-1 to 1.Which will swap last element with first each time and will call heapify each time after swaping excluding elements which are added newly at last
        for(int i=n-1 ; i>0;i--){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, 0, i);
        }
        
    }

    public static void heapify(int arr[],int i,int size){
        //now make it a min-heap
        int left = 2*i+1;
        int right = 2*i+2;
        int minIdx = i;
        if(left<size && arr[left]<arr[minIdx]){
            minIdx = left;
        }
        if(right<size && arr[right]<arr[minIdx]){
            minIdx = right;
        }
        if(minIdx!=i){
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
            heapify(arr,minIdx,size);
        }
    
    }
    public static void main(String args[]){
        int arr[] = {1,2,4,5,3};
        heapSort(arr);

        //lets print our array after sorting
        for(int i=0;i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        //We can also convert this code for sorting the array in ascending order by just converting the less then symbole with greater then as it will make it a min-heap.
    }
}
