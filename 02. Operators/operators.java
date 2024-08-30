//opeartor is symbol that tell compilor what to perform 
// eg +,-,*,/ etc 
//Types:-
//      1-Arithmatic operator (Binary : +,-,*,/,%  and Unary: ++,--) 
//      2-Relational operator   (==,!=,>,<,>=,<=)
//      3-Logical oprator   (&&,||,!)
//      4-Bitwise oprator
//      5-Assignment oprator    (+=,-=,*=,/=)
public class operators{
    public static void main(String arg[]){
//                  1-Arithmatic operator
        int a=5,b=10;
        System.out.println("Add = "+(a+b));
        System.out.println("Sub= "+(a-b));
        System.out.println("mul = "+(a*b));
        System.out.println("div = "+(a/b));
        System.out.println("Mod = "+(a%b));

//                  2-Unary operators
//  post increament/decreement(First use then change )
        b=a++;
        System.out.println("b = "+b);//here b wil be 5 bcz a is not used anywhere after increment
        System.out.println("a = "+a);//here a is used so its value will be incremented by 1
        System.out.println("b = "+b);//so b here will become 5
        a++;
        System.out.println("a = "+a);//7
        System.out.println("b = "+b);//5
        b--;
        System.out.println("b = "+b);//here b wil be  4 
        System.out.println("b = "+b);//here b will be 4
//  pre increment/decrement(First change then use)
        b=--a;
        System.out.println("b= "+b);//here b will be 6 bcz a here is pre decremented so first it will be changed then used
        ++b;

    }
}