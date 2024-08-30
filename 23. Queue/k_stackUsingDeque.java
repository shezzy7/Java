import java.util.*;
public class k_stackUsingDeque{
    static class Stack{
        Deque<Integer> s;

        public Stack(){
            s = new LinkedList<>();
        }
        //push
        public void push(int data){
            s.addLast(data);
        }
        //peek
        public int peek(){
            if(s.isEmpty()){
                System.out.println("Stack empty");
                return Integer.MIN_VALUE;
            }
            return s.getLast();
        }
        //pop
        public int pop(){
            if(s.isEmpty()){
                System.out.println("Stack empty");
                return Integer.MIN_VALUE;
            }
            return s.removeLast();
        }
        // isEmpty
        public boolean isEmpty(){
            return s.isEmpty();
        }
    }
    public static void main(String args[]){
        //We have to implements stack using deque
        //Mean our deque will work like stack
        Stack s = new Stack();
        System.out.println("Stack empty ? "+s.isEmpty());
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println(s.peek());
        while(!s.isEmpty()){
            System.out.print(s.pop()+"")
        }
    }
}