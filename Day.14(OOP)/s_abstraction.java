public class S_abstraction{
    public static void main(String args[]){
        //Abstraction:- Hiding unnecessary details and showing only the important parts to user.
        //It means that we given only idea of something but it does not exist or implemented in real.
        //Types:-It has two types 
        //  i-Abstract Classes:-
        //      Abstract ha sproperties like we cannot creatte instances(object) of this class,we can create abstract/non-abstarct methods of it and it can have constructors.
        //      Syntax : abstarct class className{
        //                      body
        //              and syntax for abstarct function is 
        //              abstarct returnType funcName(){body}
        //                    }

        Horse h = new Horse();
        Chicken hen = new Chicken();
        h.eat();
        h.walk();
        //Keep in mind we can't make objects of abstract class

        System.out.println("Horse's Color : "+h.color);
        System.out.println("Hen's Color : "+hen.color);
        //as we have created a method for changeing color in horse class we can also change color for h object
        h.changeColor();
        System.out.println("Horse's Color : "+h.color);

    }
}
abstract class Animal{
    ///we can also create constructors in this class ,we use these constructors to initilize some attributes for child classes .For example every animal has some specific coloe so we can create an attribute for color in animal and then initialy we want to set the value of color for each child of animal then we can use create constructor in this class.
    //A question may arise that as we can't create object of abstract class then how can this constructer be called.So to understand this we need to understand a phenomena that whenever an object of child class is created then compiler chekcs whether its base class has any constructor in it ,if present then this base class's constructor is called even child class contains its own constructor in it.So first of all whenever an object of this animals class's child class is created then this constructor will be called first .
    String color;
    Animal(){
        color="Brown";
    }
    void eat(){
        System.out.println("Eats");
    }
    
    abstract void walk();
    //it is a abstract function which means that it gives basic idea ot this function but it does implemented it and any class that is derived from this abstract class will make a function in it with the same name as abstract function in abstarct class otherwise error will be generated 
    //it means that abstarct functions original implementation is done in derived classes
    //but function that are not abstract are not need to be declare again in derived class and objects of derived class can access direclt those function like eat is here. 

}
class Horse extends Animal{
    void walk(){
        System.out.println("Horse walks on 4 legs");
    }
    //lets create a function to cangge color
    void changeColor(){
        color="Dark Brown";
    }
    
}
class Chicken extends Animal{
    void walk(){
        System.out.println("Chicken walks on 2 legs");
    }

}
//If we have created a class animal and created a constructor in it and then created a child class of animal named dog and created a constructor in it and created a child class dog and name it pitBul and also creaated a constructor in it .Now if we create an object of pitBul class in main then first of animal class's constructor will be called then dog class's constructor will be called and then pitBull cllass constructor will  be called

// public class S_abstraction{
//     public static void main(String args[]){
//         Pitbull p1 = new Pitbull();

//     }
// }
// class Animal{
//     Animal(){
     
//         System.out.println("Animals constructor called");   
//     }

// }
// class Dog extends Animal{
//     Dog(){
//         System.out.println("Dog constructor called");
//     }
// }
// class Pitbull extends Dog{
//     Pitbull(){
//         System.out.println("Pitbull constructer called");
//     }

// }