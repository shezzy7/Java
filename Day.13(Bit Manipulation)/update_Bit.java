public class update_Bit{
    public static int clearBit(int val,int bitNo){
        int bitMask=~(1<<bitNo);
        val=val&bitMask;
        return val;
    }
    public static void main(String args[]){
        //if we want to update a specific bit we have to set it or clear it.We can do this by following method.
        //Let we have a number 21=00010101 and we have to set 5th bit.Then we can do this by clearing our that bit,and our value will become 00010101 as it was and then find bitmask by 1<<5=00100000.Find bitmask of 1 when we have to set bit else in case of clearing a bit we getbisk using 0 in leftshif.And then perform OR operation between bitmask and the value 00010101|00100000=00110101=53.Our 5th bit is setted now.We use the same method for clearing a bit just by getting bitmask by 0.
        int val=21;
        int bitNo=5;
        System.out.println("Original Value = "+val);

        int bitValue=1;
        int n = clearBit(val,bitNo);
        int bitMask=1<<bitNo;
        int res1=n|bitMask;
        System.out.println("Value after setting 5th bit = "+res1);
        //let we have to clear 2nd bit now we have to get bitMask by 0
        bitMask=0<<bitNo;
        //and now clear 2nd bit
        n = clearBit(res1,2);
       //then perform OR operation of 
        int res2=n|bitMask;//00110001=49
        System.out.println("Value after clearing 2nd bit = "+res2);


    }
}