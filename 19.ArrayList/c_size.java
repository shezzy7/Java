import java.util.*;
public class c_size{
    public static void main(String args[]){
        ArrayList <Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("Elements of list -> "+list);

        //size method is just like length property of array.size method is used to find  to find size of list mean no of elements in array list
        // syntax -> listName.size();
        System.out.println("Size of list -> "+list.size());
        
        //so we can iterate over arrayList using size method
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
    }
}