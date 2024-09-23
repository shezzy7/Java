//There is a collection of stack in java but now lets implement it from scratch
//Stack can be implemented with  the help of arrays,arraylist and linked list
//lest implement stack with the help of array list
import java.util.ArrayList;
public class B_implement1{

    static class Stack{
        static ArrayList<Integer> list = new ArrayList<>();

        //method to check whenter stack is empty
        public static boolean isEmpty(){
            return list.size()==0;
        }
        //push method to add element from last
        public static void push(int val){
            list.add(val);
        }

        //pop
        public static int pop(){
            int last = list.get(list.size()-1);
            list.remove(list.size()-1);
            return last;
        }

        //peek
        public static int peek(){
            return list.get(list.size()-1);
        }
    }

    public static void main(String args[]){
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        System.out.println("Stack empty? "+s.isEmpty());
        //lets print all elements of stack and make satck empty
        
        while(!s.isEmpty()){
            System.out.print(s.pop()+" ");
        }
        System.out.println();
        System.out.println("Stack empty? "+s.isEmpty());

    }
}