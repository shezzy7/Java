public class Main {

    public static int[] createHashTable(int a, int c , int k , int arr[] , int size){
        
        int h_table[];
        while(true){
            h_table=new int[size];
            Arrays.fill(h_table,0);
            boolean inc_hash_table_size=false;
            for(int i=0;i<arr.length;i++){
                int idx = (a*arr[i]+c)%size;

                if(h_table[idx]){
                    size+=size;
                    inc_hash_table_size=true;
                    break;
                }
                h_table[idx]=1;
            }
            if(inc_hash_table_size){
                continue;
            }
            break;


        }
        return h_table;
    }
    public static void main(String args[]){
        int arr[]={3,5,2,6};

        int h_table[]=createHashTable(2,3,1,arr,arr.length);
    }
}
