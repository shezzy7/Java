public class F_countUniqueSubstr {
    static class Node{
        Node children[] = new Node[26];
        boolean eow = false;
        public Node(){
            for(int i=0;i<26;i++){
                children[i]=null;
            }
        }
    }

    public static Node root = new Node();

    // insert
    public static void insert(String str){
        Node curr = root;
        for(int i=0;i<str.length();i++){
            int idx = str.charAt(i)-'a';
            if(curr.children[idx]==null){
                curr.children[idx]=new Node();
            }
            curr = curr.children[idx];

        }
        curr.eow=true;
    }
    // counting unique substrings
    public static int wordCount(Node root){
        if(root==null){
            return 0;
        }
        int count=0;
        for(int i=0;i<26;i++){
            if(root.children[i]!=null){
                count+=wordCount(root.children[i]);
            }
        }
        return count+1;
    }
    public static void main(String[] args) {
        String str = "apple";
        // Given a string of length n of lowercase alphabet characters,we need to count total number of distinct substrings of this string.
        // input-> str="ababa" , output=10
        //bcz unique substring of "ababa" are-> "a","ab","aba","abab","abab","b","ba","bab","baba",""

        for(int i=0;i<str.length();i++){
            insert(str.substring(i));//inserting suffixes one by one
        }

        System.out.println(wordCount(root));
    }
}
