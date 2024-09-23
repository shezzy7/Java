public class a_mergeSort{
    public static void mergSort(int arr[],int si,int ei){
        if(si>=ei){//0
            return;
        }
        int mid = (si+ei)/2;
        mergSort(arr,si,mid);
        mergSort(arr,mid+1,ei);
        merge(arr,si,mid,ei);

    }
    public static void merge(int arr[],int si,int mid,int ei){
        int newArry[]=new int[ei-si+1];
        int i=si;
        int j=mid+1;
        int k=0;
        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                newArry[k]=arr[i];
                i++;
            }
            else{
                newArry[k]=arr[j];
                j++;
            }
            k++;
        }

        while(i<=mid){
            newArry[k++]=arr[i++];
           
        }
        while(j<=ei){
            newArry[k++]=arr[j++];
        }
        for(int m=0;m<ei-si+1;m++){
            arr[si+m]=newArry[m];
            
        }

    }
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    } 
    public static void main(String args[]){
        int arr[] = {6,3,9,5,2,8};
        printArr(arr);
        mergSort(arr,0,arr.length-1); 
        printArr(arr);
    }
}