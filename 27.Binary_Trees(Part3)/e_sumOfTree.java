public class e_sumOfTree {
    static class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(5);
        root.left.left = new Node(3);
        root.left.right = new Node(4);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        //We are given a tree with root node.We have to transform it in such a way that each node must contain sum of all of its descendants.
        // input tree
        /*
                        1
                      /   \
                     2      3
                   /  \    / \
                  4    5  6   7
         */

    }
}
