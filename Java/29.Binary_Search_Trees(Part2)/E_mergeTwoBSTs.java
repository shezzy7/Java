public class E_mergeTwoBSTs {
    static class Node{
        int val;
        Node left , right;
        public Node(int data){
            this.val = data;
            this.left = this.right = null;
        }
    }

    public static void main(String[] args) {
        Node root1 = new Node(2);
        root1.left = new Node(1);
        root1.right = new Node(4);
        /*
                2
              /   \
             1     4
         */
        //Second BST
        Node root2 = new Node(9);
        root2.left = new Node(3);
        root2.right = new Node(12);
        /*
                9
              /   \
             3     12
         */
        //WE are given two BSTs , we have to merge them in such a way that that the resultant tre shoukd also be BST.
        //And the resultant tree should be like this
    }

}
