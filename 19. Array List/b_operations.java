import java.util.*;
public class b_operations{
    public static void main(String args[]){
        //lets create an arraylist
        ArrayList<Integer> list = new ArrayList<>();
        //Add element
        //for adding an element in arraylist we use 'add' method
        // syntax -> listName.add(element)
        //this has time complexity of O(1)
        list.add(5);
        list.add(10);
        list.add(15);
        //let print arraylist
        System.out.println(list);
        //we can also add any element at particular index in list using add method
        //syntax -> listName.add(inndexNo,element)
        list.add(2,35);//this has time complexity of O(n)
        System.out.println(list);//here we will see that 3 is added at index 2 but element which was already presnt at index 2 is moved at next index

        //get element
        //for getting an element from arraylist we use index number
        // syntax ->listName.get(indexNo);
        //this method returns value 
        System.out.println(list.get(1));//this will finnd value in arralist on given index.As here we see 10 is present at index 1 so in this case 100 will be ouput.
        int ele = list.get(0);
        System.out.print(ele);
        //Time complexity of both of these(add,get) methods is O(1)

        //Remove element
        //for removing an eleemnt from list we use remove methos this method gets index no and then goes on this index and removws it
        //syntax-> listName.remove(index);
        list.remove(0);
        System.out.println(list);
        //this method has time complexity of O(n)

        //set element at index
        //set method is used for setting an element at a specific index  .For example in our arraylist we want to place 5 at index 1,then
        // syntax -> listName.set(indexNo,element);
        list.set(1,5);
        System.out.println(list);//here we will see that 10 which was at inded 1 has been replaced by 5.Which shows that this method remmoves element present at that index and replace it by given element.
        //this method has time complexityy of O(n)

        //contains method
        //this method is used to check whether given element is present in the arraylist or not if presen then it returns true else false
        //syntax -> listName.contains(element)
        System.out.println(list.contains(26));//false element is not presnt in the list
        System.out.println(list.contains(5));//true as 5 is presnt in array



    }
}