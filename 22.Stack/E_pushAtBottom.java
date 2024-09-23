import java.util.*;
public class E_pushAtBottom{
    public static void pushAtBottom(Stack<Integer> s,int data){
        //this will check if stack is empty then will put given in the stack.So this element will be at bottom of stack
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        //this will pop top of stack and will store it 
        int top = s.pop();
        pushAtBottom(s,data);
        //after stack is empty and given element is pushed at bottom this will put current last element in the stack back.
        s.push(top);
    }
    public static void main(String args[]){
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        //we are given a stack and we have to push an element at the bottom of satck
        //lets element is 4
        pushAtBottom(s,4);
        //now lets print stack again
        while(!s.isEmpty()){
            System.out.print(s.peek()+" ");
            s.pop();
        }
        
    }
}