public class b_BST {
    static class Node{
        int val;
        Node right,left;
        public Node(int data){
            val= data;
        }
    }

    public static Node buildBST(Node root,int val){
        if(root==null){
            return new Node(val);
        }

        if(root.val<val){ //if current node's value is greater than current value picked from array then according to BST properties this value will be setted to right side of this Node.
            root.right = buildBST(root.right, val);
        }
        else { // else in left Side
            root.left = buildBST(root.left, val);
        }
        return root;
    }

    //inorder
    public static void printTree(Node root){
        if(root==null){
            return;
        }
        printTree(root.left);
        System.out.println(root.val);
        printTree(root.right);
    }
    public static void main(String[] args) {
        int values[] = {5,1,3,4,2,7};
        // We are given an array of values , we have to build a Binary Search Tree using these values.
        Node root = null;
        for(int i=0;i<values.length;i++){
            root = buildBST(root, values[i]);
        }

        //lets print inorder traversal of this BST.If it is in increasing order then it means that our tree is a pure BST.
        printTree(root);
        
    }
}
