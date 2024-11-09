public class swap_values{
    public static void main(String args[]){
        //With the help of bit manipulation we can swap two values with each other,without using any third variable with the help of XOR ^ operator
        int x = 7;//    00111
        int y = 20;//   10100
        System.out.println("Values before \n x = "+x+" and y = "+y); 
        x=x^y;
        y=x^y;
        x=x^y;
        System.out.println("Values after \n x = "+x+" and y = "+y); 

    }
}