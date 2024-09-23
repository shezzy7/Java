public class l_remove_duplicates{
    public static void removeDup(String oldStr,int idx,boolean map[],StringBuilder newStr){
        // base case
        // if we have traversed over all the indeces then just print result and return.
        if(idx==oldStr.length()){
            System.out.println(newStr);
            return;
        }

        int cur = oldStr.charAt(idx)-'a';

        if(map[cur]){ //if has been seen before then move to check fro nect char and don't add it to result.
            removeDup(oldStr,idx+1,map,newStr);
        }
        else{
            // if we are facong this char firstly then add it to result and place true in array fro this char and then move to next.
            newStr.append(oldStr.charAt(idx));
            map[cur]=true;
            removeDup(oldStr,idx+1,map,newStr);
        }
    }
    public static void main(String args[]){
        // Give a String remove all the duplicates from that string.
        String oldStr = "abcdabcdaadce";
        // Creating a boolean array in which we will see whether current character has been seen previously if seen then skip it else add it in result.
        boolean map[] = new boolean[26];
        StringBuilder newStr = new StringBuilder("");
        removeDup(oldStr,0,map,newStr);
    }
}