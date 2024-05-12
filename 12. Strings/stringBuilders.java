public class stringBuilders{
    public static void main(String args[]){
        //string bbuilders are used to make strings muteable .These are very good when we have to use strings and we have to make modifications later in the code.String builders make our code runtime complexity less when we have to make changes in our strings in loops
        //syntax -> StringBuilder name = new StringBuilder("value");
        //then we have to convert it to string by this method -> name.toString();
        StringBuilder sb = new StringBuilder("");
        
        //lets store alphabets from a-z in it
        for(char ch = 'a' ; ch<='z'; ch++){
            sb.append(ch);//apppend is used to add elements 
        }
        //lets print it 
        System.out.print(sb.toString());
    }
}