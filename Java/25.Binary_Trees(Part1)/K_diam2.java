public class K_diam2 {
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
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);
            return newNode;
        }
        //calculate 
        public static Info calDiam(Node root){
            //base case
            if(root==null){
                return new Info(0,0);
            }
            Info leftInfo = calDiam(root.left);
            Info rightInfo = calDiam(root.right);
            int diam = Math.max(Math.max(leftInfo.diam,rightInfo.diam),leftInfo.ht+rightInfo.ht+1);
            int ht = Math.max(leftInfo.ht,rightInfo.ht);
            return new Info(diam,ht+1);
        }
    }
    static class Info{
        int diam;
        int ht;
        public Info(int diam,int ht){
            this.diam=diam;
            this.ht=ht;
        }
    }
    public static void main(String[] args) {
        int nodes[] = {1,2,3,-1,-1,4,-1,-1,5,6,-1,-1,7,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        Info res = tree.calDiam(root);
        System.out.println(res.diam);
    }
}
