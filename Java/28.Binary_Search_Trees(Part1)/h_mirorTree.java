public class h_mirorTree {
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
    public static Node mirrorTree(Node root){
        if(root==null){
            return null;
        }
        //first we will convert left and right subtree of this root node into their mirror tree
        root.left = mirrorTree(root.left);
        root.right = mirrorTree(root.right);
        //after converting them we will make a mirror tree of our rrot node(we will swap left adn right sides)
        Node temp = root.left;
        root.left = root.right;
        root.right = temp;
        return root;
    }
    public static void printTree(Node root){
        if(root==null){
            return;
        }
        printTree(root.left);
        System.out.print(root.val+" ");
        printTree(root.right);
    }
    public static void main(String args[]){
        int values[] = { 8 , 5 , 3 , 4 ,  10 , 11  };
        Node root = null;
         for (int i = 0; i < values.length; i++) {
            root = buildBST(root, values[i]);
        }

        //we are given a root of a BST, we have to convert this tree into its mirror tree.
          // input tree
        /*
                        8
                      /   \
                     5      10
                   /  \       \
                  3    4       11
         */ 
        //output         
        /*
                        8
                      /   \
                     10     5
                   /       /  \
                  11      4    3
         */ 
        
         
         //lets print inorder of this tree before converting it
         System.out.print("Tree before : ");
         printTree(root);//it will be in ascending order
        root = mirrorTree(root);
        System.out.print("\nTree after  : ");
        printTree(root);//now it will be in descending order
    }
}
