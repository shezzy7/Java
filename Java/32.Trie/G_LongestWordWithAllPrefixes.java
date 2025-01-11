import java.util.*;

public class G_LongestWordWithAllPrefixes {


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

    public static String ans="";
    public static void findWord(Node curr,StringBuilder temp){
        if(curr==null){
            return;
        }
        // as we have to find the longest word all the prefixes in words array.So if we insert all the elements of the word in a trie then we know that for that words whose all the prefixes are in the words then at its each char eow will be true.
        // By using this technique we will be traversing over all the elements of a not null node and for each node(as we only concern with nodes that are not null and their eow is true)we will check that whether its not null and also its eow of word is true,in that case we will add it in our temp answer after adding we will compare its length to ans and will update ans if its length is samller and we will make a recursive call for childs of curr node , after coming back  on backtrack step we will  remove last char of temp for check for other elements.
        for(int i=0;i<26;i++){
            if(curr.children[i]!=null && curr.children[i].eow){
                char ch = (char)(i+97);
                temp.append(ch);
                // update answer
                if(temp.length()>ans.length()){
                    ans = temp.toString();
                }
                
                findWord(curr.children[i], temp);
                temp.deleteCharAt(temp.length()-1);//backtrack step.
            }
        }
    }
    public static void main(String args[]) {
        String words[] = { "a", "banana", "ap", "apply", "app", "appl", "apple" };
        /*
         * Problem :-
         * Input: A list of words, e.g., ["a", "banana", "app", "appl", "ap", "apply",
         * "apple"] is given,
         * Find the longest word (from the list) such that every prefix of that word
         * also exists in the list. In this example, the answer is "apple" because all
         * its prefixes ("a", "ap", "app", "appl") are present in the list.
         */

        /*
        we will be solving this problem with the help of trie.
         * Each node in the Trie represents a character. If a node is marked as the
         * "end of a word," it means a valid word ends at that character.
         * Steps to Solve:
         * 
         * Step 1: Insert Words into the Trie:
         * All words from the list are added to the Trie.
         * During this insertion, we mark nodes as "end of word" when a word is
         * completed.
         * Step 2: Perform DFS on the Trie:
         * We use Depth First Search (DFS) to traverse through the Trie.
         * We build the current word (temp) while traversing the Trie.
         * A word is only considered valid if every prefix along the way is marked as
         * "end of word."
         * How the Answer is Selected:
         * 
         * During DFS, we compare the length of the current word (temp) with the current
         * best answer (ans):
         * If the current word is longer, we update the answer.
         * If the current word is of the same length, the lexicographically smaller word
         * is preferred (not explicitly shown in the diagram, but common in such
         * problems).
         * Backtracking:
         * 
         * After exploring a branch, the last character is removed from the current word
         * (temp) to backtrack and explore other branches.
         * This ensures that all possible words are checked.
         * Efficiency:
         * Using a Trie allows efficient prefix checking.
         * The DFS ensures we explore all valid paths in the Trie
         */

         for(String str : words){
            insert(str);
         }
         findWord(root, new StringBuilder(""));
         System.out.println(ans);
         
    }
}
