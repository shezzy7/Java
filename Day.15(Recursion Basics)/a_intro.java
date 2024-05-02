public class a_intro{
    public static void decreasingOrder(int n){
        // Static:This keyword means that the method belongs to the class rather than to any particular instance(object) of the class. It can be called without creating an instance of the class.
        if(n==1){//base case
            System.out.print(n);
            return;
        }
        System.out.print(n+" ");
        decreasingOrder(n-1);

    }
    public static void main(String args[]){
        //Rescursion is a method of solving a computational problem where the solution depends on the solutions of the instances of the same problems.
        //Basically in recursion we call a functionn in itself repeatedly till we get our result and we define a base case at which our our recursive will stop calling itself.
        
        //Let print numbers from n to 1 in decreasing order using recursion
        int n=10;
        decreasingOrder(n);
    }
}