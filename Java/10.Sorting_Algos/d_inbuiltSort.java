import java.util.Arrays;
import java.util.Collections;
public class d_inbuiltSort{
    public static void main(String args[]){
        //java also has inbuilt methoods for sorting.And for using these methods first we have to include a library 'import java.util.Arrays;' in our code

        //Now lets suppose we have array
        int arr[]={5,3,2,4,1};
        //1st method syntax ->  Arrays.sort(arrayName);
        Arrays.sort(arr);//this will sort our arrays in ascending order
        //It s time complexity is O(nlogn)
        System.out.println("First array");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        //2nd method syntax ->  Arrays.sort(arrayName,starting index,ending index);
        //this method is used when we want to sort a specific part of an array
        //here starting index is index from which we want to start sorting and ending is index at which sorting will be stopped.And starting index should be smaller then ending index else error will be generated.
        //lets create another array
        int arr2[]={5,3,4,2,1};
        Arrays.sort(arr2,0,3);//ending index will not be included
        System.out.println("\nSecond array");
        for(int i=0;i<arr2.length;i++){
            System.out.print(arr2[i]+" ");
        }

        //We can also sort our array in reverse order and for sorting our arrays in reverse order we have to add another librarry in code ->    import java.util.Collections;   
        //but this method works not on primitive data type like int,char..etc It works on objects like Integer,Character etc.So first we willl initilize our arrays as of Integer type not of int
        //lets create another array and sort it inreverse order
        Integer arr3[]={5,4,2,3,1};
        //1st method synatx ->  Arrays.sort(arrayName,Collections.reverseOrder());
        Arrays.sort(arr3,Collections.reverseOrder());
        System.out.println("\nThird array");
        for(int i=0;i<arr3.length;i++){
            System.out.print(arr3[i]+" ");
        }

        //2nd method syntax ->  Arrays.sort(arrayName,starting index,ending index,Collections.reverseOrder());
        //So this method is also used for specific part of arrays,
        //lets creat another array
        Integer arr4[]={5,3,2,1,4};
        Arrays.sort(arr4,1,4,Collections.reverseOrder());
        System.out.println("\nFourth array");
        for(int i=0;i<arr4.length;i++){
            System.out.print(arr4[i]+" ");
        }

    }
}