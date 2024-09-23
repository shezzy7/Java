import java.util.*;
public class j_deque{
    public static void main(String args[]){
                    //Deque
        //Deque means double ended queue.In deque we can add/remove/get elements from both sides(front/rear).
        //A deque has following basic operation
        //add           //adds element at rear side
        //remove        //removes element from front side
        //addFirst      //adds element at front side
        //addLast       //adds element at rear side
        //getFirst      //gets value of front element
        //getLast       //gets value of rear element
        //removeFirst   //removes and return front element
        //removeLast    //removes and returns last element
        Deque<Integer> deque = new LinkedList<>();
        deque.add(1);
        deque.add(2);
        deque.add(3);
        while(!deque.isEmpty()){
            System.out.print(deque.remove()+ " ");
        }
        System.out.println();

        deque.addFirst(1);//1
        deque.addFirst(2);//2 1
        deque.addLast(3);//2 1 3
        deque.removeFirst();//1 3
        deque.removeLast();//1
        System.out.println(deque);
    }
}