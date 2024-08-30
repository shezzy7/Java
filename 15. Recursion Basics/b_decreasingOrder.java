public class b_decreasingOrder{
    public static void increaseOrder(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        System.out.print(n+" ");
        increaseOrder(n-1);

    }
    public static void main(String args[]){
        //printing numbers from 1-10 
        int n=10;
        System.out.print(n+" ");
        increaseOrder(n-1);
    }
}