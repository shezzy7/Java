
public class B_InsertInTrie{

    static class Node{
        
        Node children[] = new Node[26]; //as 
        boolean eow=false;
        Node(){
            for(int i=0;i<26;i++){
                children[i]=null;
            }
        }

    }
    public static Node root = new Node();

    //insertion in trie
    public static void insert(String str){//time complexity willl be O(L).Here L is the length of largest word.
        Node curr = root;//for word its starting position will be from root node.

        for(int i=0;i<str.length();i++){
            int idx = str.charAt(i)-'a';
            if(curr.children[idx]==null){//we will check first that if at the next level of this our current character if not present then we will make this character as node at next level.
                curr.children[idx]= new Node();
            }
            curr = curr.children[idx];//we will be also moving our curr node pointer to the next position at which we have stored our character.Basically we are not storing charcters here we are just markign those indexes a node at which our letter should be present. 
        }
        curr.eow = true;//We will mark last character as a end of word.
    }

    // search in trie
    public static boolean search(String key){
        // i have to start search from my root node's children, so will initialize a pointer from root node and from that position i will start search my charcters in its children and if i found it there then i will start searching other chars else i will return false.
        Node curr = root; 
        for(int i=0;i<key.length();i++){
            int idx = key.charAt(i)-'a';
            if(curr.children[idx]==null){//if this character is not present at this level then it means this word is not present in this trie and we have to return false
                return false;
            }
            curr = curr.children[idx];//else we have to check for next character.
        }

        return curr.eow==true;//we will also that even we have seen that all the characters present in this word are present in our trie in corect way but it is posssible that those characters are part of any other word.And this word originally is not present in trie.For example we have a word 'there' in our trie and then we want to search for word 'the' here then we will see then all the characters are present in our trie but original we have not inserted 'the' in our trie in this case our for loop will run fine and will not return false.Then we have to check whetehr last character 'e' at which we are is has eow as true or not if true then it means that it is present in our trie else we will return false.
    }

    // Print complete trie
    public static void printTrie(Node curr , String prev){
        if (curr==null){
            return;
        }

        for(int i=0;i<curr.children.length;i++){
            if(curr.children[i]!=null){
                if(curr.children[i].eow){
                    System.out.println(prev+(char)(i+97));
                }
                printTrie(curr.children[i], prev+(char)(i+97));
            }
        }
        
        
        
        
    }
    public static void main(String args[]){
        String words[] = {"the","a","there","their","any","thee"};
        int j=0;
        while(j<words.length){
            insert(words[j]);
            j++;
        }
        
        // lets make a search for "thee","thor","an"
        System.out.println("thor : "+search("thoe") );//false
        System.out.println("thee : "+search("thee") );//true
        System.out.println("an : "+search("an") );//false
        
        System.out.println("All the elements present in the trie are ");
        for(int i=0;i<root.children.length;i++){
            // System.out.println(i);
            if(root.children[i]!=null){
                if(root.children[i].eow){
                    System.out.println((char)(i+97));
                }
                printTrie(root.children[i],""+(char)(i+97));
            }
        }
        
    }
}



