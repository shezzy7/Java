public class w_super_keyword{
    public static void main(String args[]){
        Fox f1 = new Fox();
    }
}
//Super keywrod is used to refer imediate parent class object
//It is used to access parent's properties
//It is used to access parent's functions
//It is used to access parent's constructors

class Animal{
    String color;

    Animal(){
        Sysytem.out.println("Animal constructor called");
    }
}
class Fox extends Animal{

    Fox(){
        //if we rright super keyword here then it willl first call the parent class constructor and then its own constructor.Like
        super();
        // A question may arise in our mind that if we don't declare super keyword here then parent class's constructor will be also called.This is bcz if we don't set super keyword in child class's constructor then java itself creates a super constructor with the help of which parent class's constructor is called
        Sysytem.out.println("Fox constructor called");
    }
}