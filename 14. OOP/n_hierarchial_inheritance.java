public class n_hierarchial_inheritance{
    public static void main(String args[]){

    }

}
//Hierarchial inheritance refers to the concept when there a single Base class and many classes are derived from this class 
//For example a Animmal class is taken as Base class and it has many direct child classes like mammals,bird,fish etc
class Animal{
    String color;

    void eat(){
        System.out.println("Eats");
    }

}
class Mammals extends Animals{
    void walk(){
        System.out.println("Mammals Walk");
    }
}
class Birds extends Animals{
    void fly(){
        System.out.println("Birds fly");
    }
}

class Fish extends Animal{
    void swim(){
        System.out.println("Fish swims");
    }
}
//So in hierachichal inheritance each there is only one base class and many classes are derived directly from it.
