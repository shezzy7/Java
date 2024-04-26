public class h_copy_constructor{
    public static void main(String args[]){
        Pen p1 = new Pen();
        //now if we want to create another object of Pen class and want that all the values of p1 should be copied to that new object then we pass this p1 object to the new object's constructors as an argument
        Pen p2 = new Pen(p1);
        //now lets print values of both objects
        //p1
        System.out.println("p1's values");
        p1.getValues();
        //p2
        System.out.println("p2's values");
        p2.getValues();

        //kepp in mind that when we create a copy constructor and point the values that new object to attributes of object being copied then we are creating a new memory for this object attribute,we just refrencing the attributes of this new object to the previous object mean if we change the values of p1 here then p2's valaues will be also changed as p2 is not creating its own new variables it is just refrencing the attributs of p1
        p1.color="green";
        //now lets print values of both objects
        //p1
        System.out.println("p1's values");
        p1.getValues();
        //p2
        System.out.println("p2's values");
        p2.getValues();
    }
}


class Pen{
    String color;
    int price;
    //copy constructors are those constructors which copies the valuues of some object to another object.

    Pen(){
        color = "Red";
        price = 210;
    }
    //using copy constructor for object p2
    Pen(Pen p1){
        this.color = p1.color;
        this.price = p1.price;
    }

    //getter
    void getValues(){
        System.out.println("Color : "+color);
        System.out.println("Price : "+price);
    }

}

