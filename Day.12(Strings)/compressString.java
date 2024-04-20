public class compressString{
    public static String compress(String str){
        //simple method
        
        // String compressedStr = "";
        // for(int i=0;i<str.length();i++){
        //     Integer count = 1;
        //     while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
        //         count++;
        //         i++;
        //     }
        //     compressedStr += str.charAt(i);
        //     if(count>1){
        //         compressedStr += count.toString();
        //     }

        // }
        // return compressedStr;

        //using stringbuilders
        StringBuilders str2 = new StringBuilders("");
        for(int i=0;i<str.length();i++){
            Integer count = 1;
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            str2.append(str.charAt(i));
            if(count>1){
                str2.append(count.toString());
            }
        }
        str2.toString();
        return str2;
    }
    public static void main(String args[]){
        String str = "aaabbbbccddddde";   
        System.out.print("Compressed string is : '"+compress(str)+"'");
    }
}