public class I_sumOfNodes {
    
    static class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data=data;
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
            newNode.right = buildTree(nodes);
            return newNode;
        }
        public static int calSum(Node root){
            //We are given a root node and we have to claculate sum of all the nodes.
            //base case
            if(root==null){
                return 0;
            }
            //approach : if we calculate sum of all the nodes present in left subtree and all the nodes present in right subtree.Add both the values and then add value of current root node in it and return it.
            int leftSum = calSum(root.left);
            int rightSum = calSum(root.right);
            return leftSum+rightSum+root.data;

        }
    }
    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        int Sum = tree.calSum(root);
        System.out.println(Sum);
    }
}
