public class m_multi_level_inheritance{
    public static void main(String args[]){
        //If we declare an object of Tiger class then it access attributes and methods of both Animal and Mammals classes
        //As it is derived from Mammals class which is derived from Animal class
        Tiger t1 = new Tiger();
        t1.eat();
        t1.legs=4;
        System.out.println("Tiger has "+t1.legs+" legs");
        t1.hunt();

}
}
//Single level inheritance means when there is Base class and a class is derived from it and another is derived from that derived class and so on
//For example we declare a class Animal and then declare a class Mammals from it and the another class Tiger is derived from that Mammal class ,so it refers to multi-level inheritance.
class Animal{
    String name,color;

    void eat(){
        System.out.println("Animals eat food");
    }
}
class Mammals extends Animal{
    int legs;
}
class Tiger extends Mammals{
    int population;

    void hunt(){
        System.out.println("Tigers hunt with the help of his paws and strong teeth");
    }

}

