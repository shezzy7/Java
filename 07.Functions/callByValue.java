public class callByValue{
    //in java functions are always called by value we can't call them by reference . Like in c++ we can call functions by value and also by reference
    //but in java we can only call them by value.It mean only copy of original variable is passed to a function not the original value.
    //  So any change in the parameters value will not be changed in main function
    // e.g
    public static void callByValue(int a){
        a=10;
    }
    public static void main(String args[]){
        int a=5;
        callByValue(a);
        System.out.print(a);
    }

}