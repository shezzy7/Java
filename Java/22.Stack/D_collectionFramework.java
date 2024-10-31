//In java there is abuilt in collectionn framework that has implemented stack in it.And we don't need to build stack from scracth.For this we need too import ('import java.util.*'). Lets implement stack using this framework
import java.util.*;
public class D_collectionFramework{
    public static void main(String args[]){
        //syntax -> Stack<dataType> stackName = new Stack<>();
        Stack<Integer> s = new Stack<>();
        //for pushing elements in stack.Ther is a built in method
        //syntax -> stackName.push(ele);
        s.push(1);
        s.push(2);
        s.push(3);
        //it also has methods like peek(To get top element of stack),pop(to remove top of stack) and isEmpty(to check whether stack is empty or not).
        //lets get top element of stack and print it
        System.out.println(s.peek());
        //add some other elements in stack
        s.push(4);
        s.push(5);
        //noe lets print all the elements of stack
        while(!s.isEmpty()){
            System.out.print(s.peek()+" ");//get value of top element
            s.pop();//remove top of stack
        }
    }
}