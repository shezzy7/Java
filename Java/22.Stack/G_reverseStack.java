import java.util.*;
public class G_reverseStack{
    public static void pushAtBottom(Stack<Integer> s,int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s,data);
        s.push(top);
    }
    public static void reverseStack(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        reverseStack(s);
        pushAtBottom(s,top);

    }
    public static void printStack(Stack<Integer> s){
        while(!s.isEmpty()){
            System.out.print(s.pop()+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        //first print our stack before reversing it
        // System.out.print("Before reversing -> ");
        // printStack(s);
        //now data in our stack is in this order -> 4,3,2,1
        //we have to reverse our stack
        reverseStack(s);
        //now our stack has become -> 1,2,3,4.
        //lets print it
        System.out.print("After reversing -> ");
        printStack(s);
    }
}