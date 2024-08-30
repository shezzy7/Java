public class left_Shift{
    public static void main(String args[]){
        // Left shift operator << mean move towards left.
        // syntax->    a<<b
        // Let explain it 
        // if we are given 5<<2 then it means that shift bits of 5 2 times to left and fill up the remainig space with zeros as 5 in binary equalls  00000101 And here 2 means shift all of its bits 2 times to left so it will become 00010100. which is equall to 20
        // lets print it 
        System.out.println(5<<2);
        //A formula of getiing the result is a*2^b.Here a is 5 and b is 2.SO 5*2^2=20;
        //lets take another example of binary left shift 
        //  34<<3 here 34=00100010 and we have to move items 3 times to left and it will become 100010000 which equalls here 1st 1=256 and 2nd 1=16 and their sum=272 and its the answer .
        System.out.println(34<<3);
        //simple method to move a number is that add 0 equall to count of shifting value
        // like as 64<<5 as 64=01000000 and shifting values here is 5 so add 5 zeros in back and it will become 0100000000000 which is equal to 2048 according to formula a*2^b(64*2^5) 
        System.out.println(64<<5);
    }
}