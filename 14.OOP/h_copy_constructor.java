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

        p1.color="green";
        //now lets print values of both objects
        //p1
        System.out.println("p1's values");
        p1.getValues();
        //p2
        System.out.println("p2's values");
        p2.getValues();

        
        p2.color="Orange";
        //now lets print values of both objects
        //p1
        System.out.println("p1's values");
        p1.getValues();
        //p2
        System.out.println("p2's values");
        p2.getValues();

        //after copying an object into another object through copy constructer if we made any changes to values of any object then this change will be only for this object not for other one.
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

