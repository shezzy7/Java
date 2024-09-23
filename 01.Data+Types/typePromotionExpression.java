import javax.swing.plaf.synth.SynthStyle;

public class typePromotionExpression {
    public static void main(String arg[]){
    //java automatically promotes each byte,char or short operand to int when evaluating an expresion
    //this will be only on operations
        //eg
        char ch ='a';
        short sh = 2;
        System.out.println(ch+sh);

    //if the operand is long,float or double the whole expression is promoted to long,float or double respectively
    long a = 25;
    float b = 52.36f;
    System.out.print(a+b);
    
    byte b = 5;
   // b = b*2;//wrong bcz b is automatically converted to int 
    b = (byte)(b*2);//that is ok

    }
    
}
