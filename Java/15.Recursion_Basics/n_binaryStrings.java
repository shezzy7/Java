public class n_binaryStrings{
    public static void printBinStr(int n,int lastPlace,String str){
        // base case
        if(n==0){
            System.out.println(str);
            return;
        }

        // kaam
        // if we have some place to be filled then we can add 0 or 1 both so first we will add 0
        printBinStr(n-1,0,str+"0");
        // if we have some place to be filled and our last place was 0 then now we will fill it with 1
        if(lastPlace==0){
            printBinStr(n-1,1,str+"1");
        } 
    }
    public static void main(String args[]){
        // Print all binary Strings of size N without consecutive ones.
        // Example: input-> n=3 ,outpur -> 000,001,010,100,101
        int n=4;
        printBinStr(n,0,"");
    }
}