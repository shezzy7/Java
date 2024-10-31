public class g_typeOf_constructor{
    public static void main(String args[]){
        Pen p1 = new Pen();//this will find whether there is non-paarametarized construcor is present in the class and will call the non-parametarized constructor.If there are some constructors in the class but there exist no constructor that is non-parametarised then this generate an error message.Keep in mind that java generated a constructor  in case if there exist no constructor in the class.

        Pen p2 = new Pen("Red");//this will find the a constructor in the class that is receiving a single varialbe of string type as an argument and this will it .If there exist no constructor with this property then this will generate an error message.

        //if we create a object and pass an argmuent through it to its constructor and we pass some integer data for example,but there exist no constructor that is receiving some integer data from as a paremter then this will also generate an error .So we have to declare objects with proper argumennts passing through it to its constructor.
        //Like if we create another object  Pen p3 = new Pen(253,"red");   then this will also generate an error as there is no constructor that is receiving these arguments as a parameter

        Pen p4 = new Pen("Yellow",250);

        //constructor overloading : it refers to the concept that an object with calls the constructor according to it's arguments or it refrs to the concept that a constructor is called whenever an object ,matching its parameters,is declared in the programm.

        


    }
}
class Pen{
    String color;
    int price;

    //There are three types of constructors 
    //i)Non-Parametarized  ii)Parametarized  iii)Copy Constructor
    //non-parametarized mean simple constructor in which we don's have any parameters.For example 
    Pen(){
        System.out.print("Non-Prametarized constructor called");
    }

    //Parametarized constructor is that constructor that contains some parameters in it .For example
    Pen(String color){
        this.color = color;
    }

    //there is no limit of parameters to be passed through the constructor.we can pass multiple parameters in the constructor.
    //If we want to receive color and price both,then
    Pen(String color,int price){
        this.color=color;
        this.price=price;
    }
    //but we can declare multiple constructors in our class.but we can't declare more then one constructor with same type and same sequence of parameters.
    
    //And we can declare any constructor even if any object is not calling it but we can't declare a object if any constructor is no presenting which matches its arguments 
    


}