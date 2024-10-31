public class a_kthLevel{
    static class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data = data;
            this.left=null;
            this.right = null;
        }
    }
    public static void kthLevel(Node root,int lev,int k){
        if(root==null){
            return;
        }
        if(lev==k){//if we are at k level then print it and we donot need to go to more in depth.
            System.out.print(root.data+" ");
            return;
        }
        kthLevel(root.left, lev+1, k);
        kthLevel(root.right, lev+1, k);
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left= new Node(2);
        root.right= new Node(3);
        root.left.left= new Node(4);
        root.left.right= new Node(5);
        root.right.right= new Node(6);
        root.right.left= new Node(7);
        int k=3;
        //we are given a root of a binary tree and a level k. we have to print all the nodes present at kth level.
        kthLevel(root, 1, k);
        
    }
}