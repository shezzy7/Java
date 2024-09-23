public class o_findOcurencess{

    public static void findOcurence(int arr[],int idx,int key){
        // base case
        if(idx==arr.length){
            return;
        }
        if(arr[idx]==key){//if present
            System.out.print(idx+" ");

        }
        findOcurence(arr,idx+1,key);//check for next index
    }

    public static void main(String args[]){
        // Given an array and a key.Find all the indeces in array where key is present.

        int arr[] = {3,2,5,6,2,2,3,2};
        int key=2;
        findOcurence(arr,0,key);
    }
}