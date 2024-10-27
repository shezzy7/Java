public class d_deleteANode {
    static class Node {
        int val;
        Node right, left;

        public Node(int val) {
            this.val = val;
        }
    }

    public static Node buildBST(Node root,int val){
        if(root==null){
            return new Node(val);
        }
        if(root.val>val){
            root.left = buildBST(root.left, val);
        }
        else{
            root.right = buildBST(root.right, val);
        }
        return root;
    }
    //print inorder
    public static void printBST(Node root){
        if(root==null){
            return;
        }
        printBST(root.left);
        System.out.print(root.val+" ");
        printBST(root.right);
    }
    //Delete Node
    public static Node delNode(Node root,int key){
        //We are given a root node and a key.We have to delete this key from our tree.

        if(root.val>key){//if key is smaller then root node then find it in left subtree
            root.left = delNode(root.left, key);
        }
        else if(root.val<key){//if key is greater then find it in right subtree.
            root.right = delNode(root.right, key);
        }
        else{
            //if current node is our key then we have to remove this from our tree.
            //For deleting it we can have three cases
            //CASE 1
            // if this node don't have any child then we can simply return null.
            if(root.left==null && root.right==null){
                return null;
            }
            //CASE 2
            //Second case is that this node may contain a single child(left or right)
            //if this node does not contain a left child then it means that it contains a right child and we will return it
            if(root.left==null){
                return root.right;
            }
            else if(root.right==null){//else we will check for presence of right child if right child is null then it means that it contains a left child and we will return left child.
                return root.left;
            }
            //CASE 3
            //this node contains both right and left child
            else{
                //In this case we will find inorder successor of this node.
                //Inorder successor is that node which will after this current node if we print inorder sequence of our tree.As we are deleting our node and this node is also having childs so we have to replace it's value by that value which will come after this node's value in inorder traversal.
                //As we know that the value which will after this node in inorder traversal will be in right subtree and will be leftmost node of this subtree.So we will find it in right subtree.
                Node IS = findSuccessor(root.right);
                root.val = IS.val;//we will replace our node's value by inorder succesor
                root.right = delNode(root.right, IS.val);//Now we also have to remove our inorder successor from its original position as we have cahnge its poition now. 
            }

        }
        return root;

    }
    //find Successor
    public static Node findSuccessor(Node root){
        //As we know that our successor will be leftmost child.So we will go in left side and will pickup the leftmost child and will return it
        while(root.left!=null){
            root = root.left;
        }
        return root;
    }
    public static void main(String args[]) {
        int values[] = { 8, 5, 3, 1, 4, 6, 10, 11, 14 };
        Node root = null ;
        for (int i = 0; i < values.length; i++) {
            root = buildBST(root, values[i]);
        }
        int key = 6;
        //print tree before removal
        System.out.print("Tree before : ");
        printBST(root);
        System.out.println();

        root = delNode(root,key);
        //print tree after removal
        System.out.print("Tree After : ");
        printBST(root);

    }
}