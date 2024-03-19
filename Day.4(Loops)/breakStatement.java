public class breakStatement {
    public static void main(String arg[]){
        //break statement is used to break a loop at a specific condition
        //let we have to print number from 1-10 but when number becomes equal to
        //5 then we stop printing numbers and break the loop
        int n=1;
        while(n<=10){
            if(n==5){
                System.out.print(n);
                break;
            }
            System.out.print(n+"\n");
            n++;
        }
    }
}
