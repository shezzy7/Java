import java.util.Arrays;
public class Main {

    public static int[] createHashTable(int a, int c  , int arr[] , int size){
        
        int h_table[];
        while(true){
            h_table=new int[size];
            Arrays.fill(h_table,0);
            boolean inc_hash_table_size=false;
            for(int i=0;i<arr.length;i++){
                int idx = (a*arr[i]+c)%size;

                if(h_table[idx]==1){
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

    public static boolean findNumber(int h_table[],int x, int a , int c){
        int idx=(a*x+c)%h_table.length;
        if(h_table[idx]!=0){
            return true;
        }
        return false;
    }
    public static void main(String args[]){
        int arr[]={3,5,2,6 ,45,23,98};
        int a=2;
        int c=3;
        int h_table[]=createHashTable(a,c,arr,arr.length);
        System.out.println(findNumber(h_table,98 ,a,c ));
    }
}
