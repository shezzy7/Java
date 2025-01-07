
public class C_wordBreak {
    static class Node {
        Node children[] = new Node[26];
        boolean eow = false;

        public Node() {
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
        }
    }

    public static Node root = new Node();

    public static void insert(String ele) {
        Node curr = root;
        for (int i = 0; i < ele.length(); i++) {
            int idx = ele.charAt(i) - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        curr.eow=true;
    }

    // search
    public static boolean search(String key) {
        Node curr = root;
        for (int i = 0; i < key.length(); i++) {
            int idx = key.charAt(i) - 'a';
            if (curr.children[idx] == null) {
                return false;
            }
            curr = curr.children[idx];
        }

        return curr.eow == true;
    }

    // word-break
    public static boolean wordBreak(String key) {
        // base case
        if (key.length() == 0) {
            return true;
        }

        for (int i = 1; i <= key.length(); i++) {
            // check for first part
            if (search(key.substring(0, i))
                && wordBreak(key.substring(i))) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        String words[] = { "i", "like", "sam", "samsung", "mobile" };
        String key = "ilikesamsung";
        // Problem:- Given an input key and a dictionary of words,find out if the input
        // string can be broken into a space-separated sequence of dictionary words.
        // we have to check if we separate the key's words in with any length then check
        // whether these words are present in the words array or not.Here we can
        // separate our key into words like -> i like samsung.And all of these words are
        // present in words array so we will return true here.

        // Appraoch :- we will insert all the elements of words into a trie and check
        // for each substring of key into this trie.If any substring return true then
        // check for next part of key.
        // For example if in this key if we separate "i" and check it in our trie then
        // we will get true as i is present in trie as a separate value.Then we will
        // move to check for 'l' and we will get falser bcz 'l' is not present as
        // separate entity.So we will increase our substring and will check for 'li' ,
        // this will also return us false and then we will check for 'lik',this will be
        // false also then we will be checking for 'like'.And we will get true for this
        // as at 'e' eow will be true.So we will check for next word remaining which
        // starts from 's'.We will get false and will again check for 'sa' by increasing
        // size of our substring.And so we will get our result.
        // 1- first insert all the elements into trie
        for (String ele : words) {
            insert(ele);
            System.out.println(ele);
        }
        System.out.println(search("i"));
        System.out.println(search("like"));
        System.out.println(search("samsung"));
        // make a search for key in trie
        System.out.println(wordBreak(key));
    }

}
