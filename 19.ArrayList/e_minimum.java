import java.util.*;
public class e_minimum{
    public static void main(String args[]){
        ArrayList <Integer> list = new ArrayList<>();
        list.add(12);
        list.add(63);
        list.add(122);
        list.add(25);
        list.add(100);

        //find maximum element in list
        int max = Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
            max = Math.max(max,list.get(i));
        }

        System.out.println("Maximum element in list is -> "+max);
        

    }
}