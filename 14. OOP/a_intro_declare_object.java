public class a_intro_declare_object{
    public static void main(String args[]){
        //we declare objects by using name of class as their type
        //if we want to declare an object of Pen class then
        //Syntax-> className objza\Name = new className();
        Pen p1 = new Pen();
        //object can use attributes and function of its class by their name using '.' between
        p1.color="Blue";
        System.out.println(p1.color);
        //calling function for changing color attribute
        p1.setColor("Yellow");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);

        Student s1 = new Student();
        s1.setName("Shahzad");
        s1.setAge(21);
        System.out.println(s1.name+"\n"+s1.age);
        //we can also set propeties directly like
        s1.name="Muhammad Shahzad";
        System.out.println(s1.name);

    }
}
//we declare classes below the main class
//Syntax is as following
//      class className{
//              Attributes(String s;Char c etc.)

//              Functions
//      }
class Pen{
    //attributes
    String color;
    int tip;
    //functions
    //here in class other then main/public class we declare functions just by returning type and function name we don't write public static before
    //Syntax->  returnType funcName(parameters){ //body }
    void setColor(String newColor){
        color=newColor;
    }
    void setTip(int newTip){
        tip=newTip;
    }

}
//declare another class
class Student{
    String name;
    int age;

    void setName(String newName){
        name = newName;
    }
    void setAge(int newAge){
        age = newAge;
    }
}