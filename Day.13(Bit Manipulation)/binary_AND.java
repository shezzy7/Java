public class binary_AND{
    public static void main(String args[]){
        //AND(&) is used to get result after adding given values mean if we it two values 5 and 6 i will first convert them to binary numbers and then will peromrm anding operation them according to which 
        //  0 & 0 = 0 
        //  0 & 1 = 0 
        //  1 & 0 = 0 
        //  1 & 1 = 1 
        //mean it will be only 1 i both of the values are 1
        //and it will convert the anding result to decimal 
        //according binary system 5 = 101  and  6 = 110.
        //on adding these two value by & operator we'll get 100 which is equall to 4.
        //lets print it
        int res = 5&6;
        //keep in mind bitwise operator will be written one time only mean i we write && htne shows comparison operation .So we will use only &
        System.out.println(res);
        int x = 5;
        int y = 15;
        System.out.print(x&y);
    }
}