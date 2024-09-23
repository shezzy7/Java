public class firstLetterToUppercase{
    public static String toUpperCase(String str){
        StringBuilder str3 = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        str3.append(ch);
        for(int i=1;i<str.length();i++){
            if( str.charAt(i)==' ' && i<str.length()-1 ){
                str3.append(str.charAt(i));
                i++;
                str3.append(Character.toUpperCase(str.charAt(i)));

            }
            else{
                str3.append(str.charAt(i));
            }
        }
        return str3.toString();

    }
    public static void main(String args[]){
        //for a given string convert each word of the string to uppercase 
        String str = "hi, i am Shezzy ";
        System.out.println(toUpperCase(str));
    }
}