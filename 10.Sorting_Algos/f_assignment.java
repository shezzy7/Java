public class f_assignment{
    public static void bubble(int arr[],int n){

        for(int i=0;i<n;i++){
            boolean swap = false;
            for(int j=n-1;j>0+i;j--){
                if(arr[j]>arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swap=true;
                }
            }
            if(!swap){
                break;
            }
        }
        System.out.println("Sorted in descending order using bubble sort");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void selection(int arr[],int n){
        for(int i=0;i<n-1;i++){
            int max=i;
            for(int j=i+1;j<n;j++){
                if(arr[max]<arr[j]){
                    max=j;
                }
            }
            int temp = arr[max];
            arr[max]=arr[i];
            arr[i]=temp;
            
        }
        
        System.out.println("Sorted in descending order using bubble sort");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }

    public static void insertion(int arr[],int n){
        for(int i=1;i<n;i++){
            int current=arr[i];
            int prev=i-1;
            while(prev>=0 && current>arr[prev]){
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=current;
        }
        System.out.println("Sorted in descending order using insertion sort");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void counting(int arr[],int n){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            max=Math.max(max,arr[i]);
        }
        int count[]=new int [max+1];
        for(int i=0;i<n;i++){
            count[arr[i]]++;
        }
        int j=0;
        for(int i=max;i>=0;i--){
            while(count[i]>0){
                arr[j]=i;
                count[i]--;
                j++;
            }
        }
        System.out.println("Sorted in descending order using counting sort");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }


    }
    public static void main(String args[]){
        int arr[]={3,6,2,1,8,7,4,5,3,1};

        //Q1-Sort the given array in descending order using buble sort
        //bubble(arr,arr.length);

        //Q2-Sort the given array in descending order using selection sort
        // selection(arr,arr.length);

        //Q3-Sort the given array in descending order using insertion sort
        insertion(arr,arr.length);
        
        //Q4-Sort the given array in descending order using counting sort
        // counting(arr,arr.length);
    }
}