public class b_access_specifiers{
    public static void main(String args[]){
        Bank customer1 = new Bank();
        //we can get and set or modify our attributes or functions which are public ,but if anyone is private then we can't use it 
        //like name is public so we can access it here
        customer1.name="Shahzad";
        System.out.println("Name : "+customer1.name);
        //but we can not use password attribute here bcz it is setted as private
        //if we try to use it here directly then error will be generated
        //but we can set its value by using a function which can be declared in the Bank class for setting the password and only iff this function is also not private
        customer1.setPassword(5264);
        //we can also set a function to get password 
        customer1.getPassword();
        System.out.println(customer1.password);



    }
}

class Bank{
    //access specifiers defines the accesibility of attributes and functions of a class outside that class
    //There are four types of access specifiers.

    // Access Modifer | within class | within package | 
    // ------------------------------------------------
    // Private        | Yes          | No             | 
    // Default        | Yes          | Yes            |
    // Protected      | Yes          | Yes            |
    // public         | Yes          | Yes            |
    
    // Access Modifer | within package by subclass only | outside package | 
    // -------------------------------------------------------------------
    // Private        | No                              | No             | 
    // Default        | No                              | Yes            |
    // Protected      | Yes                             | No             |
    // public         | Yes                             | Yes            |
    

    //It means that we can create attributes and functions with the help of these access specifiers to improve our programm structure and set some constraints that who can access our data and which part of data

    //let we want to set some attribute as we want that name of account holder should be used by anyone in the programm but his password should be private. then we can do this as

    public String name;
    private int password;

    public void setPassword(int pswd){
        password=pswd;
    }
    public void getPassword(){
        System.out.println("Password : "+password);
    }



}
//Note:In java we can declare classes as public,default but we can't make any class private or protected
//We can make our constructors,attributes,fields and sub-classes as default,public,protected or private.

