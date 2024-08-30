public class binaryOnesComplement{
    public static void main(String args[]){
        //in case of 1's complement( ~ ) operator following rules are applied
        //  ~0 = 1
        //  ~1 = 0
        //mean it will invert the input
        //let we want to print negation of 5
        System.out.println(~5);//it will give -6. how? explained below
        //as in binary system 5 = 00000101
        //so first we will negate this ,and on negation it becomes 11111010
        //the most significant bit tells the sign of value. if it is 1 then its mean given value is negative and if 0 then it shows that given value is positive
        //now we will take  its 1's ccomplement which means negate all the bits again
        //then it will become 00000101 after this we will add 1 in it and after adding 1 it will bwcome 00000110 which is equall to 6 as the MSB was 1 which means the given values was negative so it will be -6

        System.out.println(~0);//-1
        System.out.println(~1);//-2
       
    }
}