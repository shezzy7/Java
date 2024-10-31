public class c_searchInRotatedSortedArray{
    public static int search(int arr[],int target,int si,int ei){{

        if(arr[mid]==target){
            return mid;
        }

        //check left part
        if(arr[si]<=arr[mid]){
            //case a
            if(arr[si]<=target && target<=arr[mid]){
                return search(arr,target,si,mid-1);
            }
            else{
                return search(arr,target,mid+1,ei);
            }
        }

        //check right part
        else{
            if(arr[mid]<=target && target<=arr[ei]){
                return search(arr,target,mid+1,ei);
            }
            else{
                return search(arr,target,si,mid-1);
            }
        }
    }

    }
    public static void main(String args[]){
        //using recursion
        int arr[]={6,7,8,0,1,2,3};
        int target = 0;
        int idx = search(arr,targte,0,arr.length-1);
        System.out.print("Our target is present at index"+idx);

    }
}