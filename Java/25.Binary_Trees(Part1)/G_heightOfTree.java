public class G_heightOfTree {
    static class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data = data;
            this.left=null;
            this.right=null;
        }
    }

    static class BinaryTree{
        static int idx=-1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right=buildTree(nodes);
            return newNode;
        }
        
        public static int findDepth(Node root){
            //We are given a root node and we have to find depth of this tree.
            //Approach : if we find depth of left subtree of a node and right tree of a node and then take maximum between both of them and it will give depth of this tree excluding this root element if we plus one in this given value then it will give total depth of this tree.  
            if(root==null){
                return 0;
            }
            int leftDepth = findDepth(root.left);
            int rightDepth = findDepth(root.right);
            int height =  Math.max(leftDepth,rightDepth);
            return height+1;
        }
    }

    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,0,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println("Height of this tree is : "+tree.findDepth(root));

    }
}
