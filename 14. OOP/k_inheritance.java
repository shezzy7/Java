public class k_inheritance{
    public static void main(String args[]){
        Fish dolphin = new Fish();
        dolphin.eat();

    }
}
//Inheritance :- Inheritance refers to the process when attributes and methods of base/parent class are passed to Derived/child class.
//For example if we create a class Animal and declare some attributes and functions in this class and we want to create another class for example Fish and we want to declare som properties in it also but fish is also a aniimal so we can copy some common properties of animals From Animal class to Fish class without again declaring them ther and also can access functions declared in the Animal class.

class Animal{
    String name;

    void eat(){
        System.out.println("Eats");
    }
    void breath(){
        System.out.println("Breathes");
    }
}
//Syntax for declaring a derived class is below

// class derived_class_name extends base_class_name{//body}
class Fish extends Animal{
    //now this Fish class have access to attributes and methods of Animal class
    //we can also declare more attributes and methods here,if need.
    String food;

    void swim(){
        System.out.print("Fish swims in water");
    }

}

//Derived class have access to attributes and methods of Base class but base class can not access derived class's attributes and methods.