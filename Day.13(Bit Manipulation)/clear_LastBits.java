public class clear_LastBits{
    public static void main(String args[]){
        int n = 15;
        //number of bits to clear at last
        int bit = 2;
        //if take ~(0) then it becomes 11111111 and then if we get its bitMask by bit number as here bit number is 2 so 11111111<<2=11111100 and then add then perform AND operation between given value and this bitmask we get the answer as 00001111 AND 11111100 = 00001100=12.
        int x = ~(0);
        int bitMask=x<<bit;
        n=n&bitMask;
        System.out.print("Value after clearing last "+bit+" bits = "+n);
    }
}