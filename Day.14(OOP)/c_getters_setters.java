public class c_getters_setters{
    public static void main(String args[]){

        Student s1 = new Student();
        s1.setter("Shahazad",221722);
        s1.getter();



    }
}

class Student{
    public String name;
    private int roll_no;


    //Setters are reffered to functions in the class that are used to set values of attributes in the class.Although we can also set values of attributes of any class in the main function but what if the any attrbutes are private.So for this purpose we use setters,which are nothing other than function which are used to set values of attributes
    //Let create a setter for setting value of or private attribute roll no and also of public attribute name
    void setter(String nam,int rol){
        name=nam;
        roll_no = rol;
    }

    //let create a getter for roll number.Getters are nothing other then some function to get values of attributes of the class
    void getter(){
        System.out.println("Name : "+name);
        System.out.println("Roll no : "+roll_no);
    }

}