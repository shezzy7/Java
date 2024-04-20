import java.util.*;
public class clear_Bit{
    public static void main(String args[]){
        //If we are given a number and we have to clear its specific bit mean convert it to 0 even if it is 1 or 0.Like we are given 15=00001111 and we have to clear its 2-bit.We will do what is that first of all find bitmask which means 1<<i.  i here is the number of bit which is 2 here .and it is equall to 00000001<<2=00000100 .Second step is invert all the bits of this bitmask by using ~ operator and it will becomme 11111011 and then AND the result in given value (00001111 & 11111011=00001011).Which is original result 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        System.out.print("Enter bit number to be cleared : ");
        int bit=sc.nextInt();
        //calculating bit mask
        int bit_mask=1<<bit;
        //inverting bitmask
        bit_mask = ~(bit_mask);
        //ANDing bitmask to given number
        n=n&bit_mask;
        System.out.print("Value after clearing "+bit+"th bit is = "+n);    
        
    }
}
