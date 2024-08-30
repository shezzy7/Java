import java.util.*;
public class e_implByJCL{

    public static void main(String args[]){
        //We can also implement queue by using java collection framework.But in JCL queue is not a class it's an interphase and we cannot make objects of queue,so we make objects of classes that implement queue like Linked list and Array deque
        //Syntax-> Queue<dataType> queName = new LinkedList<>();
        Queue<Integer> q = new LinkedList<>();
        //or -> Queue<Integer> q = new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isEmpty()){
            System.out.print(q.peek()+" -> ");
            q.remove();
        }
        System.out.println("null");
    }
}