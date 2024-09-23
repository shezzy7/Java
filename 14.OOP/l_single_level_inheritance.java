public class l_single_level_inheritance{
    public static void main(String args[]){
        Animal herb = new Animal();
        Lion maleLion = new Lion();
        maleLion.eat();
        maleLion.hunt();

    }
}
//Single level inheritance means when there is only one Base class and one child class of it.For example we create a class Animal and then derived a class from it Lion.So it is a single level inheritance
class Animal{
    String name;

    void eat(){
        System.out.println("Animals eat food");
    }
}
class Lion extends Animal{
    int legs;

    void hunt(){
        System.out.println("Lion hunst with the help of his paws and strong teeth");
    }

}