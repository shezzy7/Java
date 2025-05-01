public class q_lengOfStr{
    public static void findLength(String str,int i,int len)
    {
        if(i==str.length()){
            System.out.print(len);
            return;
        }
        len++;
        findLength(str,i+1,len);

    }
    public static void main(String args[]){
        // We are give a string we have to find length of this string using a recursive function.
        String str = "lovePak";
        findLength(str,0,0);
        
    }
}