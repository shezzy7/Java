public class d_permutations{
    public static void permutations(String str,String res){//Time complexity- O(n*n!)
        //base case
        if(str.length()==0){
            System.out.println(res);
            return;
        }
        //kaam
        for(int i=0;i<str.length();i++){
            char ch  = str.charAt(i);
            String newStr = str.substring(0,i) + str.substring(i+1);
            permutations(newStr,res+ch);
        }
    }
    public static void main(String args[]){
        // We are given a string and we have to find all the permutations for this String.
        String str = "abc";
        permutations(str,"");
    }
}