import java.util.*;
public class odd_Even{
    public static void main(String args[]){
        //lets check any number even or odd using bitwise operator 
        //Any number which is even when converts to binary wee see that its LSB is 0  //LIKE 8=00001000 
        //Any number which is odd when converts to binary wee see that its LSB is 1 LIKE 19=00010011 
        //if we perorm and(&) operation with value 1 on any given value then it converts all the values to 0 else LSB .If LSB is 0 it ramains 0 when anding with 1 and if it is 1 then it remains 1 when anding with 1 so its the key point.
        //Let check a odd number ,for example 25
        //As 25=00011001 and if AND 1=00000001 with it ,this will become 00000001 now we will see its LSB if 1 then odd and if 0 then even .Here it is showing that it is a odd integer.
        //Lets take a example of even number for example 40
        //As 40=00101000 and if AND 1=00000001 with it ,thiis will become 00000000.Here LSB is 0 which means its a even number .
        //lets write a code for it
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int LSB = n&1;
        if(LSB==1){
            System.out.println("Odd number");
        }  
        else{
            System.out.println("Even number");
        }
        
         
    }
}