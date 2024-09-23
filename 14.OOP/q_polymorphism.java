public class q_polymorphism{
    public static void main(String args[]){
        //Polymorphism :- Poly stands for many and morph stands for forms,when we try to perform same task in multiple forms then it refers to polymorphism.
        //There are two types of Polymorphism
        //  i)Compile Time Polymorphism
        //      .Method Overloading
        // ii)Run Time Polymorphism
        //      .Method Overriding

        //'Method overloading' refers to when we write many function of same name but with different type or count of parameters.For example if want to calculate sum of tow integers a,b then i will write a function with name sum and pass these arguments  as
        // sum(int a,int b); but if i want to get sum of three integers then i wcan write function sun with name but different parameters for example a,b,c then function will be as sum(int a,int b,int c); compiler will chek function on the base of argumets passed to it.So it is method overloading.And we can declare multiple function like that like we can declare function sum for floating values or mix values etc.
        Calculator c1 = new Calculator();
        System.out.println(c1.sum(25.6f,3.9f));
        System.out.println(c1.sum(30,50));
        System.out.println(c1.sum(80,9,21,85));
        //this is called compile time polymorphism as before running the programm compiler knows that which function is to be called at that particular piont
    }
}
class Calculator{
    int sum(int a,int b){
        return a+b;
    }
    int sum(int a,int b,int c,int d){
        return a+b+c+d;
    }
    float sum(float a,float b){
        return a+b;
    }
}