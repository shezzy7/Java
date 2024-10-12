import java.util.*;
public class h_multi_dimensional_arrayList{
    public static void main(String args[]){
        //Like multidimensional arrays ArrayList can be also mltidimensional
        //Syntax ->  ArrayList<ArrayList<listType>> listName = new ArrayList<>();
        //for adding a list in this multidimensional array list first we define a list and then add this in multidimensioanl list
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        //for adding a llist in this main list lets create a 1 dimensional arraylist first
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1); 
        list.add(2); 
        list.add(3); 
        list.add(4);
        //now add this list in main list
        mainList.add(list);
        //lets create a second array list and then add it in mainList
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(5);
        list2.add(6);
        list2.add(7);
        list2.add(8);
        mainList.add(list2);

        //lets traverse over each element of mainList
        for(int i=0;i<mainList.size();i++){
            ArrayList<Integer> curList = mainList.get(i);
            for(int j=0;j<curList.size();j++){
                System.out.print(curList.get(j)+" ");
            }
            System.out.println();
        }
        System.out.print(mainList);
        //lets create another multidimensional arraylist int which 3 lists are added and
        //list1 -> 1,2,3,4,5
        //list2 -> 2,4,6,8,10
        //list3 -> 3,6,9,12,15
        ArrayList<ArrayList<Integer>> mainList2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        ArrayList<Integer> list4 = new ArrayList<>();
        ArrayList<Integer> list5 = new ArrayList<>();
        for(int i=1;i<=5;i++){
            list3.add(i*1);
            list4.add(i*2);
            list5.add(i*3);
        }
        mainList2.add(list3);
        mainList2.add(list4);
        mainList2.add(list5);
        for(int i=0;i<mainList2.size();i++){
            ArrayList<Integer> curList = new ArrayList<>();
            for(int j=0;j<curList.size();j++){
                System.out.print(curList.get(j) + " ");
            }
            System.out.println();
        }
        System.out.print(mainList2);
    }
}