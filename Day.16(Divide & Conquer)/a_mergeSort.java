public class a_mergeSort{
    public static void mergSort(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        int mid = si+(ei-si)/2;
        mergSort(arr,si,mid);
        mergSort(arr,mid+1,ei);
        merge(arr,si,mid,ei);

    }
    public static void merge(int arr[],int si,int mid,int ei){
        int i=si,j=mid+1,k=0;
        int newArry[]=new int[ei-si+1];
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
            arr[k]=arr[i];
            k++;
            i++;
        }
        while(j<=ei){
            arr[k]=arr[j];
            k++;
            j++;
        }
        for(int m=0;m<newArry.length;m++){
            arr[si+m]=newArry[m];
        }
    }
    public static void main(String args[]){
        int arr[] = {3,2,8,6,7,9,5};
        mergSort(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}