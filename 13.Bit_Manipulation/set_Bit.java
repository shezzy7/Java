import java.util.*;
public class set_Bit{
    public static void main(String args[]){
        //If we are given a number and we have to change set the value of bit(make the bit 1) ,mean if it is 0 or 1 we have to set it to 1.For example in 15=00001111 we are told that set the bit 5.Then we can do this by following method.
        // if we have number 15=00001111 and we are given  to set 5th bit  then take the value of this bit number, which is given 5 here, as 'i' and do 1<<i==1<<5=00000001<<5=00100000 and then perform OR operation of the result with the number(00001111) (00100000 OR 00001111 = 00101111).So our ith bit has been setted now.And our new value be equall to 47
        
        // let perform a task in which we will get a number from user and also get index of bit to be setted
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        System.out.print("Enter bit no to be setted : ");
        int idx = sc.nextInt();
        
        int bitMask = 1<<idx;
        
        n=n|bitMask;
        System.out.print("Our new value after setting "+idx+"th bit is = "+n);

    }
}