public class g_validBST {
    static class Node {
        int val;
        Node right , left;
        public Node(int data){
            val = data;
        }
    }
    public static Node buildBST(Node root , int val){
        if(root==null){
            return new Node(val);
        }
        if(root.val>val){
            root.left = buildBST(root.left, val);
        }
        else{
            root.right = buildBST(root.right, val);
        }
        return root;
    }
    public static boolean validateBST(Node root){
        if(root == null){
            return true;
        }
        
    }
    public static void main(String args[]){
        int values[] = {8 , 5 , 2 , 3 , 4 , 11 , 10 , 14};
        Node root = null ; 
        for(int i=0; i <values.length;i++){
            root = buildBST(root,values[i]);
        }
        //We are given a root node of a Binary.We have to identify whether this tree is a binary search tree or not.
        System.out.println(validateBST(root));
    }
}
