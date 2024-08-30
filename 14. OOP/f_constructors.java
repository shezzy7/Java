public class f_constructors{
    public static void main(String args[]){
        Pen p1 = new Pen();
        //In java whwn we don't create a constructor ,then java creates a constructer of this class by itself but this constructor does not contain any data in it.But now as we have we have declared a constructer so it will be called automatically.And data in it will be executed

    }
}
class Pen{
    String name;

    // Constructor is a special method that is invoked automatically after the creation of an object.Whenever we create an object of a class then constructor of that class is automatically called.
    // Constructors have following propperties:-
    //     i)Constructors have the same name as of class
    //    ii)Constructors don't have a return type(Not even void)
    //   iii)Constructors are called only once at object creation
    //    iv)Memory allocation happens when constructor is called
    
    //lets create a constructor
    Pen(){
        System.out.println("Constructor has been called");
    }
    //as we create a object of this class in main function then this constructor will be called automatically.

    //Constructor is basically used to initialze attributes of the class.For example if we declare some attributes in the class and we want to initialize them then we don't initialize them while declaring .We initialize them using constructors. 

}