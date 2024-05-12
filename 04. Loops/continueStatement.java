public class continueStatement {
    public static void main(String arg[]){
        //continue statement is used to skip an iteration on some specific condition
        //let print number from 1-15 but excluding 13
        for(int i=1;i<=15;i++){
            if(i==13){
                continue;
            }
            System.out.print(i+" ");
        }
    }
}
