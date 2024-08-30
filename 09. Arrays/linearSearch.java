import java.util.*;
public class linearSearch {
    public static int search(int arr[],int find){
        //binary search refers to finding index of an element 
       
        for(int i=0;i<arr.length;i++){
            if(arr[i]==find){
                return i;//it will return the index of elemnt if found 
            }
        } 
        return -1;//-1 will be returned if element is not found in the array

    }
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int arr[]=new int[10];
    int find;
    System.out.print("Enter array elements\n");
    for(int i=0;i<arr.length;i++){
        System.out.print("Element "+(i+1)+" :");
        arr[i]=sc.nextInt();
    }
    System.out.print("Enter searching element : ");
    find=sc.nextInt();
    int key=search(arr,find);
    if(key!=-1){
        System.out.print("Element is present at index "+key);
    }
    else{
        System.out.print("Element not found");
    }
  }  
}
