public class add_1{
    public static void main(String args[]){
        //We can add 1 to any number using bit manipulation by following way
        int x = 15;
        int y=-~x;
        System.out.println(y);
        System.out.println(x);
    }
}