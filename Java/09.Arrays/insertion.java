import java.util.*;
public class HelloWorld {
    public static void insert(int LA[],int N,int k,int ITEM) {
        if(k >N || k<0){
            System.out.println("Oops your entered index is not in the limit of array size!");
            break;
        }

    int j = N-1;

    while(j>=k){

        LA[j+1] = LA[j];
        j--;

    }
    LA[k] = ITEM;
    System.out.println("New element inserted succefully!")
    System.out.print("Your new  array is : ");
    for(int i=0;i<N;i++){
        System.out.print(LA[i]+" ");
    }
    }

    public static void main(String[] args) {
        // Insert a given element ITEM in a given array LA at a given index k 
        // Given array
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter size of array : ");
        int N = sc.nextInt();
        int LA[] = new int[N+1];
        System.out.print("Enter elements of array : ");
        
        for(int i=0;i<N;i++){
            LA[i]=sc.nextInt();
        }
        System.out.print("Enter new element to be inserted : ");
        int ITEM = sc.nextInt();
        System.out.print("Enter index at which it is to be inserted(0-"+N+"): ");
        int k = sc.nextInt();
        
        else{
        insert(LA,N,k,ITEM);
            
        }
    }
}   