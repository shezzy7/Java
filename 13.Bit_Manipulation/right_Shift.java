public class right_Shift{
    public static void main(String args[]){
        // Right shift operator >> is  inverse of left shift oberator.Here bit are pulled toward right.
        // For example 15>>2 here 15=00001111 when we rigth shift it by it elements are shifted 2 times toward left and becomes 00000011 .Here the two 1's which are removed after shifting are eleminated from value now it is equal to 3.And remaining space from left will be filled by 0's.And a short formula for getiing result after right shifting is a/2^b     here a=15 and b=2 so 15/2^2=15/4=3.04 here floating values will be neglected 
        System.out.println(15>>2);
        //Lets take another example 
        //276>>5  here 276=100010000 after rigth shifting by 5 it becomes 000001000 which equalls 8 .Lets apply formula on it 276/2^5=276/32=8.625 mean 8
        System.out.println(276>>5);
        
    }
}