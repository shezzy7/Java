import java.util.*;
public class practiceQ1{
    public static void generateBinaryNumbers(int n){
        //Given a number N. The task is to generate and print all binary numbers       with decimal values from 1 to N.
        // Sample Input 1 : N =2
        // Sample Output 1 : 1 10
        // Sample Input 2 : 5
        // Sample Output 2 : 1 10 11 100 10

        Queue<Integer> q = new LinkedList<>();
        int i=1;

        while(i<=n){
            int cur=0;
            int m=i;
            Stack<Integer> s = new Stack<>();//using stack to connect bits in correct order.

            //generating binary number of current value and pushing each bit into stack one by one
            while(m>0){
                int rem = m%2;
                s.push(rem);
                m/=2;
            }
            //getting each bit from stack one by one and making them a complete value of current single digit
            while(!s.isEmpty()){
                cur*=10;//geeting bits from stack one by one and adding them in a String
                cur+=s.pop();
            }

            q.add(cur);
            i++;
        }

        //printing my result
        while(!q.isEmpty()){
            System.out.println(q.peek()+" ");
            q.remove();
        }
    }
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter number : ");
       int n = sc.nextInt();
       generateBinaryNumbers(n);
    }
}