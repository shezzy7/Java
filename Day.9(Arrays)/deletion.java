import java.util.*;
public class deletion{
    public static void delete(int array[],int n,int k){
        if(k<0 || k>n-1){
            System.out.println("Given Index is out of range!");
            return;
        }
        int j = k ;
        for(int i=j;i<n-1;i++){
            array[i]=array[i+1];
        }
        System.out.print("Element deleted successfuly!");
        for(int i=0;i<array.length-1;i++){
            System.out.print(array[i]+" ");
        }
    }
    public static void main(String args[]){
        //WAP to delete an element from a given index
        Scanner sc = new Scanner(System.in);
        int array[] = new int[]{10,20,36,52,94,2,15};
        int n = array.length;
        System.out.println("Enter index from which you want to delete the element : ");
        int k = sc.nextInt();
        delete(array,n,k);
    }
}