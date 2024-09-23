import java.util.*;
public class practiceQ3{
    public static void reverseFirstKelements(Queue<Integer> q,int k){
        // We have an integer k and a queue of integers, we need to reverse the order of the first k elements of the queue, leaving the other elements in the same relative order.
        // Sample Input 1 : Q = [10, 20, 30, 40, 50, 60, 70, 80, 90, 100] ,k=5
        // Sample Output 1 : Q = [50, 40, 30, 20, 10, 60, 70, 80, 90, 100]

        //We we use another helper queue in which we will put first k elements of originl queue
        Queue<Integer> firstKelements = new LinkedList<>();
        for(int i=0;i<k;i++){
            firstKelements.add(q.remove());
        }
        //now we have divided our queue into two parts
        //we have to add elements of firstKelements in original queue ut in reverse order.For this we can use two stacks.In one stack we will add elements of remaing elements of original queue and then will copy all the elemts of this stack to another stack and these will be copied in reverse order,then we will push all elements from our queue firstKelements into this stack one by one and then at last we will add all these elemets from our stack to our original queue.
        Stack<Integer>s1 = new Stack<>();
        Stack<Integer>s2 = new Stack<>();
        while(!q.isEmpty()){
            s1.push(q.remove());
        }
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        while(!firstKelements.isEmpty()){
            s2.push(firstKelements.remove());
        }
        while(!s2.isEmpty()){
            q.add(s2.pop());
        }

        


    }
    public static void main(String args[]){
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);
        q.add(70);
        q.add(80);
        q.add(90);
        q.add(100);

        System.out.println("Queue before : "+q);
        reverseFirstKelements(q,4);
        System.out.println("Queue after : "+q);
    }
}