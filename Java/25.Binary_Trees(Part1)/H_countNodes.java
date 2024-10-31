public class H_countNodes {
    static class Node{
        int data;
        Node right,left;
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
    }
    public static int countNodes(Node Root){
        //We are given a root node of a tree and we have to find total number of nodes in this tree.
        //Aproach:If we calclutate total number of nodes in left subtree and total number of nodes in right subtree and then add them.It will give total number of childs of this node.Then if we will add one in this result for including this current root node in the result and it will give us our result.
        if(Root==null){
            return 0;
        }
        int leftCount = countNodes(Root.left);
        int rightCount = countNodes(Root.right);
        int t_count=leftCount+rightCount+1;
        return t_count;
    }
    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree Tree = new BinaryTree();
        Node Root = Tree.buildTree(nodes);
        int numberOfNodes = countNodes(Root);
        System.out.println(numberOfNodes);
    }
}
