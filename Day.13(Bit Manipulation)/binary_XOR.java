public class binary_XOR{
    public static void main(String args[]){
        //in case of XOR( ^ ) operator following rules are applied
        //  0 ^ 0 = 0
        //  0 ^ 1 = 1
        //  1 ^ 0 = 1
        //  1 ^ 1 = 0
        //mean it will give one if both are diferent
        //according binary system 5 = 101  and  6 = 110.
        //on adding these two value by ^ operator we'll get 011 which is equall to 3.
        
        int res = 5^6;
        //keep in mind bitwise operator will be written one time only mean i we write && htne shows comparison operation .So we will use only &
        System.out.println(res);
        int x = 5;//101
        int y = 64;//1000000
        //guess
        System.out.print(x^y);


    }
}