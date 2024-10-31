public class C_printTreeInPreOrder {
    public static class Node {
        int data;
        Node right;
        Node left;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // preorder-> root node,left node,right node
    static class BinaryTree {
        static int idx = -1;

        public static Node buildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            // kaam
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;

        }

        public static void preorderPrint(Node root) {
            if (root == null) {
                System.out.print((-1) + " ");
                return;
            }
            System.out.print(root.data + " ");
            preorderPrint(root.left);
            preorderPrint(root.right);

        }
    }

    public static void main(String args[]) {
        // Building a tree with preorder method
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        tree.preorderPrint(root);

    }
}
