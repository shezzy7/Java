public class D_printInorder {

    static class Node{
        int data;
        Node right;
        Node left;
        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }

    }
    public static class BinaryTree{
        static int idx=-1;
        public Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);
            return newNode;

        }

        //Inorder->(left subtree,root node,right subtree)
        public static void printInorder(Node root){
            if(root==null){
                return;
            }
            printInorder(root.left);
            System.out.print(root.data+" ");
            printInorder(root.right);

        }

    }
    public static void main(String[] args) {
        int nodes[] = {2,4,-1,-1,1,5,-1,-1,6,3,-1,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        tree.printInorder(root);//4 2 5 1 3 6
    }
}