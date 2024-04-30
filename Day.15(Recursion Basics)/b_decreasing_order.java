public class b_decreasing_order{
    void increaseOrder(int n){
        if(n==1){
            System.out.print(n+" ");
        }
        increaseOrder(n-1);
        System.out.println(n+" ");

    }
    public static void main(String args[]){
        int n=10;
        increaseOrder(n);
    }
}