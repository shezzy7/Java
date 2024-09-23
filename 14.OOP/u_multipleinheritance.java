public class u_multipleinheritance{
    public static void main(String args[]){
        Bear b1 = new Bear();
        b1.eat();
    }
}
//In multpile inheritance we derive a class multple classes
//we can implement multiple inheritance with the help of interfaces
interface Herbivore{
    void eat();
    
} 
interface Carnivore{
    void eat();
}

class Bear implements Herbivore,Carnivore{
    public void eat(){
        System.out.println("Bear eats plants and also eat meat");
    }
}
