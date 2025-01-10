public class E_startsWith {
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

    public static boolean startsWith(String prefix){
        // As here we don't have see wheather given word is a complete word mean this given word's last charcter don't need to  have eow=true.Bcz we are searching for a prefix that whether this given word is present in trie or not , either completely or prefix of a word.
        Node curr = root;
        for(int i=0;i<prefix.length();i++){
            int idx = prefix.charAt(i)-'a';
            if(curr.children[idx]==null){//if for any char we found null then it means that it is not a part of our trie.And we will return false.
                return false;
            }
            curr = curr.children[idx];
        }
        return true;
    }
    public static void main(String args[]){
        String arr[] = {"apple","fun","make","mango","man","woman"};
        String str = "moon";
        // Problem : Create a function boolean startsWith(String prefix) for a trie.Returns true if there is a previously inserted string word that has the prefix and false otherwise.
        // Example : Input -> {"apple","fun","make","mango","man","woman"}
        //  String prefix = "app" , output-> true
        //  String prefix = "moon" , output-> false
        for(String ele : arr){
            insert(ele);
        }

        System.out.println(startsWith(str));
        
    }
}
