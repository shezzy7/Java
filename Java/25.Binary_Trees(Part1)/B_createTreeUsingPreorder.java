public class B_createTreeUsingPreorder {
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

    // preorder->Pre-order means first we create a root node then its left child and then its right child.(root node,left node,right node)
    static class BinaryTree {
        static int idx = -1;

        public static Node buildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {//-1 represents a null node.As we've stored -1 in nodes array at which position we want at add null node
                return null;
            }
            // kaam
            Node newNode = new Node(nodes[idx]);//root node
            newNode.left = buildTree(nodes);//left child
            newNode.right = buildTree(nodes);//right child

            return newNode;

        }

        
    }

    public static void main(String args[]) {
        // Building a tree with preorder method
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };

        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.print(root.data + " ");

    }
}



