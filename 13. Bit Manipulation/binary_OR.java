public class binary_OR{
    public static void main(String args[]){
        //in case of OR( | ) operator following rules are applied
        //  0 | 0 = 0
        //  0 | 1 = 1
        //  1 | 0 = 1
        //  1 | 1 = 1
        //mean it will give one if any o both is 1
        //according binary system 5 = 101  and  6 = 110.
        //on adding these two value by | operator we'll get 111 which is equall to 7.
        
        int res = 5|6;
        //keep in mind bitwise operator will be written one time(|) only.If  we write || it shows comparison operation.So we will use only one |
        System.out.println("5|6 = "+res);
        int x = 5;
        int y = 15;
        //guess
        System.out.print(x|y);
    }
}