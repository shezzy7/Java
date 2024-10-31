public class g_validBST {
    static class Node {
        int val;
        Node right, left;

        public Node(int data) {
            val = data;
        }
    }

    public static Node buildBST(Node root, int val) {
        if (root == null) {
            return new Node(val);
        }
        if (root.val > val) {
            root.left = buildBST(root.left, val);
        } else {
            root.right = buildBST(root.right, val);
        }
        return root;
    }

    public static boolean validateBST(Node root,Node min , Node max){
        if(root == null){
            return true;
        }
        //compare if our root node is less then its minimum value then it means that our tree is not BST
        if(min!=null && root.val<=min.val){
            return false;
        }
        if(max!=null && root.val>=max.val){
            return false;
        }

        return validateBST(root.left, min, root) && validateBST(root.right, root, max);


    }

    public static void main(String args[]) {
        int values[] = { 1,1,1 };//false
        
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = buildBST(root, values[i]);
        }
        // We are given a root node of a Binary.We have to identify whether this tree is
        // a binary search tree or not.
        // Approach 1 : if we get inorder sequence of this tree and if this sequence is
        // in ascending order then it means then our tree is a valiidate BST.

        // Approach 2 : if we get maximum from leftside of our each root node and get
        // minimum from rightside of each rrot node.And our root node's value lies
        // between these values then it means that our tree is BST.

        System.out.println(validateBST(root, null, null));// first we will pass nul as our max and min value of our rrot
                                                          // node
    }
}
