public class o_hybrid_inheritance{
    public static void main(String args[]){
        Penguin p1 = new Penguin();
        p1.eat();
    }
}
//Hybrid inheritance refers to the concept when there are more then one type of inheritances int single programm.

class Animal{
    void eat(){
        System.out.println("All the animals eat food");
    }
}

class Bird extends Animal{
    void fly(){
        System.out.println("Birds can fly");
    }
}
class Fish extends Animal{
    void swim(){
        System.out.println("Fish swims in water");
    }
}
class Mammals extends Animal{
    void leg(){
        System.out.println("Mammals have legs");
    }
}
class Shark extends Fish{
    void live(){
        System.out.println("Sharks lives in sea");
    }
}
class Penguin extends Bird{
    void pengFly(){
        System.out.println("Penguins can't fly properly");
    }
}


//as here there is multilevel inheritance and also hierarchichal inheritance so we can call it hyybrid inheritance