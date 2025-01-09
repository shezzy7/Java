import java.util.*;
public class D_prefixProblem {
    static class Node{
        Node children[] = new Node[26];
        boolean eow=false;
        int freq;

        public Node(){

            for(int i=0;i<26;i++){
                children[i] = null;
            }
            freq=1;

        }

    }

    public static Node root=new Node();
    //insert
    public static void insert(String str){
        Node curr = root;
        for (int i = 0; i < str.length(); i++) {
            int idx = str.charAt(i)-'a';
            if(curr.children[idx]==null){
                curr.children[idx]=new Node();
            }
            else{
                curr.children[idx].freq++;//for rsolving this problem which approach we are using according to this we must have count of each word at its level.
            }
            curr = curr.children[idx];
        }
        curr.eow=true;
    }


    // search
    public static void search(String str,ArrayList<String>list){
        StringBuilder sb = new StringBuilder("");
        Node curr = root;
        for(int i=0;i<str.length();i++){
            int idx = str.charAt(i)-'a';

            sb.append(str.charAt(i));
            if(curr.children[idx].freq>1){
                curr = curr.children[idx];
                continue;
            }
            else{
                break;
            }
            
        }
        list.add(sb.toString());
    }
    public static void prefix(String arr[],ArrayList<String>list){
        //first of all make a trie
        for(String str : arr){
            insert(str);
        }

        for(String str : arr){
            search(str,list);
        }

    }
    public static void main(String[] args) {
        String arr[] = {"zebra","dog","dove","duck"};

        //Prob:-Find shortest unique prefix for every word in a given list.Assume no word is prefix of another.
        // example->   arr[] = {"zebra","dog","dove","duck"} , ans = {"z","dog","dov","du"}
        
        //Approach:-If we count freq of each character along it while inserting it in a trie.Then while searching unique prefix for a word we will see that whether the freq of current character is 1 if it is one then it means that we have reached the first unique character and we will stop here as we have find shortest unique prefix for this word. 

        ArrayList<String>list = new ArrayList<>();
        prefix(arr,list);
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
