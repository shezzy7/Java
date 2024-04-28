public class r_runTime_polymorphism{
    public static void main(String args[]){
        // Method Overriding:- Parent and child classes both contain the same function with  different defination.For example if we have a class Animal ad  defined a function in it and then creat a childe class from animal class and name it deer and declare a eat function in the deer class also.Then we create an object of deer class in main and call the eat function from this object.Which function will be called?So at this time compiler does not know thhat which dunction will be called and will will determine during runtime that function is to be call,as it will check if deer class contains the function with same name and same parameters ,then it will call this function otherwise it will it in parent class and will execute it from there.

        Deer d1 = new Deer();
        d1.eat();//eat is present in deer
        d1.walk();//walk is not present in deer so compiler will check in animal class and execute it
    }
}

class Animal{
    void eat(){
        System.out.println("Eats anything");
    }
    
    void walk(){
        System.out.println("Animals can walk");
    }
}

class Deer extends Animal{
    void eat(){
        System.out.println("Eats grass");
    }
}