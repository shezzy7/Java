public class conversion {
    public static void main(String arg[]){
        //we can convert any type type of data to anyother form if
        //1-type compatible
        //2-destination type > source type
        //byte->short->int->float->long->double
        //we can convert a type of data greator then its destination type by using the type of destination in brackets along source
        //by this method
        float a = 15.32f;
        int b = (int)a;
        System.out.printlns(b);
        //else we can't convert float to int without this like
       // float c = 15.32f;
       // int d = c; //it will not work and will give error
        int f = 15;
        float g = f;//that is fine bcz destination type is greater then source
        //long h = 2563;
       // int i = h;//this will also give error
        long j = 856;
        int k = (int) j;//that is also good
        //This concept of converting greater type to smaller type is called type casting

        //we can also convert charactors to int this will give asci value of charactors
        char ch = 'a';
        int asci = ch;
        System.out.println(asci);
    }
    
}
