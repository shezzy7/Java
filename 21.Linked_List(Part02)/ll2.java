import java.util.*;
public class ll2{
    public static boolean isPalindrom(LinkedList<Integer> ll){
        int size = ll.size();
        Stack<Integer> s = new Stack<>();
        for(int i=0;i<size/2;i++){
            s.push(ll.removeFirst());
        }
        if(size%2==1){
            ll.removeFirst();
        }
        while(!ll.isEmpty()){
            if(ll.removeFirst()==s.pop()){
                continue;
            }
            return false;
        }
        return true;
    }
    public static void main(String args[]){
        LinkedList<Integer> ll = new LinkedList<>();
        ll.addLast(1);
        ll.addLast(3);
        // ll.addLast(3);
        ll.addLast(2);
        ll.addLast(1);
        boolean res=isPalindrom(ll);
        System.out.print(res);
    }
}