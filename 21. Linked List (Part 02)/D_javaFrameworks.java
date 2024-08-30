//java contains a collection of frameworks in which many dat structures are built in and we don't need to build them from scratch.We have just to import them and use.Linked list is also present in this framework.So to use linked list we can just import it from java collection of frameworks

import java.util.LinkedList;
public class D_javaFrameworks{
    public static void main(String args[]){
        //create
        LinkedList<Integer> ll = new LinkedList<>();

        //add
        ll.addLast(1);//    1
        ll.addLast(2);//    1->2
        ll.addFirst(0);//   0->1->2
        ll.addLast(3);//    0->1->2->3

        //print
        System.out.print(ll);

        //remove
        ll.removeFirst();//    1->2->3
        ll.removeLast();
        System.out.print(ll);//    1->2

    }
}