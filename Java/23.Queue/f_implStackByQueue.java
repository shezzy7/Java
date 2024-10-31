import java.util.*;
public class f_implStackByQueue{
    static class Stack{
        Queue<Integer> q1;
        Queue<Integer> q2;
        public Stack(){
            q1 = new LinkedList<>();
            q2 = new LinkedList<>();
        }
        //isEmpty
        public boolean isEmpty(){
            return q1.isEmpty();
        }
        //push
        public void push(int data){
            if(q1.isEmpty()){
                q1.add(data);
                return;
            }
            //1st method O(n)
            while(!q1.isEmpty()){
                q2.add(q1.remove());
            }
            q1.add(data);
            while(!q2.isEmpty()){
                q1.add(q2.remove());
            }
        }
        //peek
        public int peek(){
            if(q1.isEmpty()){
                System.out.println("Stack empty");
                return Integer.MIN_VALUE;
            }
            return q1.peek();
        }
        //pop
        public int pop(){
            if(q1.isEmpty()){
                System.out.println("Stack empty");
                return Integer.MIN_VALUE;
            }

            //1st method O(1)
            return q1.remove();

            //2nd method O(n)
            
            //     int top=0 ;
            // while(!q1.isEmpty()){
            //     top = q1.peek();
            //     q2.add(q1.remove());
                
            // }


            // return top;


        }
    }
    public static void main(String args[]){
        //Stack can also be implemented by using queue.Its also a very imporatnt question as has been asked in coding interview of 'IntuiT' company.
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.pop();
        s.push(5);
        while(!s.isEmpty()){
            System.out.print(s.pop()+" -> ");
        }
        System.out.print("null");
    }
}