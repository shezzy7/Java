public class J_diameterOfATree{
    public static class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    public static class BinaryTree{
        static int idx=-1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left=buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;

        }
        //print tree in preorder form
        public static void printTree(Node root){
            if(root==null){
                System.out.print(-1+" ");
                return ;
            }
            System.out.print(root.data+" ");
            printTree(root.left);
            printTree(root.right);
        }
        //height
        public static int calHeight(Node root){
            if(root==null){
                return 0;
            }
            int leftHeight = calHeight(root.left);
            int rightHeight = calHeight(root.right);
            return Math.max(leftHeight,rightHeight)+1;
        }
        public static int  countDiamatere(Node root){
            if(root==null){
                return 0 ;
            }
            int leftDiam = countDiamatere(root.left);
            int rightDiam = countDiamatere(root.right);
            int lefHeight = calHeight(root.left);
            int rightHeight = calHeight(root.right);
            int selfDiam = lefHeight+rightHeight+1;
            int tempDiam =  Math.max(leftDiam,rightDiam);
            return Math.max(selfDiam,tempDiam);
        }
    }
    public static void main(String[] args) {
        
        int nodes[] = {1,2,3,-1,-1,4,-1,-1,5,6,-1,-1,7,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println(tree.countDiamatere(root));
           
    }
}