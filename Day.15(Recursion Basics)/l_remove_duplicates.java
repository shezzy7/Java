public class l_remove_duplicates{
    public static void removeDup(String oldStr,int idx,boolean map[],StringBuilder newStr){
        if(idx==oldStr.length()){
            System.out.println(newStr);
            return;
        }

        int cur = oldStr.charAt(idx)-'a';

        if(map[cur]){
            removeDup(oldStr,idx+1,map,newStr);
        }
        else{
            newStr.append(oldStr.charAt(idx));
            map[cur]=true;
            removeDup(oldStr,idx+1,map,newStr);
        }
    }
    public static void main(String args[]){
        String oldStr = "abcdabcd";
        boolean map[] = new boolean[26];
        StringBuilder newStr = new StringBuilder("");
        removeDup(oldStr,0,map,newStr);
    }
}