public class c_searchInBST{
    static class Node{
        int val;
        Node right,left;
        public Node(int data){
            val=data;
        }
    }
    //build BST
    public static Node buildBST(Node root,int val){
        if(root==null){
            return new Node(val);
        }
        if(root.val<val){
            root.right = buildBST(root.right,val);
        }
        else{
            root.left = buildBST(root.left,val);
        }
        return root;
    }

    public static boolean findKey(Node root,int key){
        if(root==null){//if reached at null then it means that our required key is not present in out tree
            return false;
        }
        if(root.val==key){//if current node's value is equall to key then return true.
            return true;
        }
        
        if(root.val>key){//if cuurent node is greater then key it means that our key will be in left subtree
            return findKey(root.left, key);
        }
        else{//else check in right subtree.
        return findKey(root.right, key);
        }

    }
    public static void main(String args[]){
        int values[] = {5,1,3,4,2,7};
        Node root = null;
        for(int i=0;i<values.length;i++){
            root = buildBST(root,values[i]);
        }
        int key = 8;
        

        //We are given a BST and a key, we have to find wheather the given key is present in our tree or not
        boolean res = findKey(root,key);
        System.out.println(res);
    }
}