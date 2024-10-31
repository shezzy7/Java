public class a_subtreeInTree{

    public static  class Node{
        int data;
        Node right,left;
        public Node(int data){
            this.data = data;
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
        static int idx2=-1;
        
        public static Node buildTree2(int nodes[]){
            idx2++;
            if(nodes[idx2]==-1){
                return null;
            }
            Node newNode = new Node(nodes[idx2]);
            newNode.left=buildTree2(nodes);
            newNode.right = buildTree2(nodes);
            return newNode;
        }
    }

    public static boolean isIdentical(Node Root,Node subRoot){
        if(Root==null && subRoot==null){
            return true;
        }
        else if(Root==null || subRoot==null || Root.data!=subRoot.data){
            return false;
        }
        if(isIdentical(Root.left,subRoot.left)){
            if(isIdentical(Root.right, subRoot.right)){
                return true;
            }
        }
        return false;

    }
    public static boolean isSubtree(Node Root,Node subRoot){
        if(Root==null){
            return false;
        }
        if(Root.data==subRoot.data){//if value of both nodes is same then it means that we have found a node from which we can start checking and comparing our other nodes of both tree. 
            if(isIdentical(Root,subRoot)){
                return true;
            }
        }
        return isSubtree(Root.left, subRoot) || isSubtree(Root.right, subRoot);
    }
    public static void main(String[] args) {
        int nodes[] = {1,2,3,-1,-1,4,-1,-1,5,-1,-1};
        int nodes2[] = {2,3,-1,-1,4,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node Root = tree.buildTree(nodes);
        Node subRoot = tree.buildTree2(nodes2);

        //We are given a root and a subroot of a tree.We have to see wheather the subroot tree is present in root tree or not.
        boolean res = isSubtree(Root,subRoot);
        System.out.println(res);
    }
}