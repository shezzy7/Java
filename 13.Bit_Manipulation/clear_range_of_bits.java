public class clear_range_of_bits{
    public static void main(String args[]){
        //If we are given a number and we are asked to clear a given range of bits.For example if we are given number 223=11011111 and we are said to clear bit from 2 to 5 mean after clearing it will become=10000011=131.we can do this by following method
        //first of all will a|b and then aplly AND operation of it with given values here a is value that has number of by using a=(~0)<<(j+1)
        //we take j as 5 so result will be a=(~0)<<(5+1)=11111111<<6=11111111000000.
        //and b will be take as b=(1<<i)-1.Here i is 2,so b=(1<<2)-1=00000100-1=00000011 and when we perform OR operation between a,b the a|b=11111111000000|00000011=111111000011.Now we will perform AND operation between this a|b and given value which here is 223=11011111.
        //so 11111111000011 AND 11011111=110000011 
        int i=2,j=4;
        int n=10;//00001010
        int a=((~0)<<(j+1));//11100000
        int b=(1<<i)-1;//00000011
        int bitMask=a|b;//11100011
        int x=n&bitMask;//00000010
        System.out.print(x);
        
    }
}