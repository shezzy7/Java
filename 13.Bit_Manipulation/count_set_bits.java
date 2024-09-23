public class count_set_bits{
    public static void main(String args[]){
        //We are given a number and we have to count number of bits in this number which are setted .Like in 15=00001111 4 bits are setted.
        //So we can get number of setted bits by following method 
        //First of all set a counter which will count number of setted bits.and initialize it to 0.Then perform AND operation b\w given value and 1 and then check whether result is 0 or not if zero the it means that our LSB was 1  so count it to counter then make a right shift of this number by 1 and then perform the same operation until number becomes zero and then print the counter
        int n=15;
        int counter=0;
        while(n>0){
            int x = n&1;
            if (x!=0){
                counter++;
            }
            n=n>>1;

        }
        System.out.print("Number of setted bits is = "+counter);
        
    }
}