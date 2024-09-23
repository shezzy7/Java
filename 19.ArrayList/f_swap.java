import java.util.*;
public class f_swap{
    public static void swap(ArrayList<Integer> list,int idx1,int idx2){
        int temp = list.get(idx1);
        list.set(idx1,list.get(idx2));
        list.set(idx2.temp);
    }
    public static void main(String args[]){
        //we are given an arrayList and we are given two index,and we have to swap values of both indexes with each other 
        ArrayList <Integer> list = new ArrayList<>();
        list.add(2);
        list.add(6);
        list.add(8);
        list.add(5);
        list.add(15);
        int idx1 = 3;
        int idx2 = 2;
        System.out.println("List before -> "+list);
        swap(list,idx1,idx2);
        System.out.println("List after -> " +list);
    }
}