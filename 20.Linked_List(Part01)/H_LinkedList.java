import java.util.*;
public class H_LinkedList{
    public static void main(String args[]){
        //In java we don't need to create method for making lists,for adding nodes in our lists,for removing node from Linked list and for all operations of linked list as java have all of these methods built in
        //This is present in collections framework
        //Synatx to create a linked list 
        //  LinkedList <dataType> listName = new LinkedList<dataType>();
        //lest create a linked list in which we will create alinked list for storing elements of integer type.
        LinkedList<Integer> list = new LinkedList<>();
        //for adding element in linked list there is also built in mehods for adding elements from first(left) side we we have following syntax -> listName.addFirst(value);
        list.addFirst(15);
        list.addFirst(26);
        list.addFirst(36);
        //now our linked list will be like as
        // -> 36 -> 26 -> 15 as we have added elements from first side
        
        //we can also print linked list directly by its name
        System.out.println(list);
        //like this we can also add elements from last side
        //syntax -> linkedListName.addLast(value);
        list.addLast(45);
        list.addLast(86);
        System.out.println(list);//now our list will be as ->36,26,15,45,86
        //but if we write simple list.add(value); then this value will be added to last side byDefault
        list.add(90);
        System.out.println(list); 

        //For getting size of linked,there is also a built in function in 
        //syntax -> linkedListName.size();
        System.out.println("Size of our linkedList is : "+list.size());

        //For getting an element of linked list there is also built in function.Like arrayList ,linkedList has get method through which we can access linkedList elements individually.
        //syntax -> linkList.get(index);
        System.out.println("First element of our linked list is -> "+list.get(0));//36
        //so using these size and get method we can iterate over our linked llist
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }

        //for removing first or last nodes there is also some built-in methods
        //for removing first node of list we write listName.removeFirst()
        list.removeFirst();
        //now print our list
        System.out.println(list);
        //And for removing last node we write listName.removeLast()
        list.removeLast();
        System.out.println(list); 

        //for removing any specific element from list we use is index to remove it
        //syntax -> listName.remove(index);
        //lets remove 2 index value from list
        list.remove(2);
        System.out.println(list);

    }
}
