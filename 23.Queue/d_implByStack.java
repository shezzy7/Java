import java.util.*;
public class d_implByStack{
    static class Queue{
        Stack<Integer> s1; 
        Stack<Integer> s2; 
        public Queue(){
            s1 = new Stack<>();
            s2 = new Stack<>();
        }

        //isEmpty
        public boolean isEmpty(){
            return s1.isEmpty();
        }

        //add
        public void add(int data){
            //1st method O(1)
            // s1.push(data);

            //2nd method  o(n)
            if(s1.isEmpty()){
                s1.push(data);
                return;
            }
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            s1.push(data);
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }

        }

        //peek
        public int peek(){
            if(s1.isEmpty()){
                System.out.println("Queue empty");
                return Integer.MIN_VALUE;
            }

            //1st method O(n)
            // while(!s1.isEmpty()){
            //     s2.push(s1.pop());
            // }
            // int front = s2.peek();            
            // while(!s2.isEmpty()){
            //     s1.push(s2.pop());
            // }

            //2nd method O(1)
            int front = s1.peek();
            return front;
        }
        //remove
        public int remove(){
            if(s1.isEmpty()){
                System.out.println("Stack already empty");
                return Integer.MIN_VALUE;
            }
            //1st method O(n)
            // while(!s1.isEmpty()){
            //     s2.push(s1.pop());
            // }
            // int front = s2.pop();
            // while(!s2.isEmpty()){
            //     s1.push(s2.pop());
            // }

            //2nd method O(1)
            int front = s1.pop();
            return front;
        }
    }
    public static void main(String args[]){
        //Queue can also be implemented by using two stacks.This question of iplementing a queue using stack has been asked in microsoft and google.
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isEmpty()){
            System.out.print(q.remove()+" -> ");
        }
            System.out.print("null ");
    }
}