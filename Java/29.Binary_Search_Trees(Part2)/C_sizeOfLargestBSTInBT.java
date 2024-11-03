public class C_sizeOfLargestBSTInBT {
    static class Node{
        int val;
        Node right , left;
        public Node(int data){
            this.val = data;
            this.right = this.left = null;
        }

    }
    public class Info{
        boolean isValid;
        int size;
        int max,min;

    }

    public static boolean sizeOfLargestBST(Node root){
        if(root==null){
            return true;
        }
    }
    public static void main(String args[]){
        /* 
                        50
                      /    \
                    30      60
                   /  \    /   \
                  5   20  45    70
                               /   \
                              65    80
        */ 

        Node root = new Node(50);
        root.left = new Node(30);
        root.left.left = new Node(5);
        root.left.right = new Node(20);
        root.right = new Node(60);
        root.right.left = new Node(45);
        root.right.right = new Node(70);
        root.right.right.left = new Node(65);
        root.right.right.right = new Node(80);

        //We are given a BT and we are asked to find the size of largest BST in this BT.


    }
}
