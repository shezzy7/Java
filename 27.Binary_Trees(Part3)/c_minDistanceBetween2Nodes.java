public class c_minDistanceBetween2Nodes {
    static class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(3);
        root.left.right = new Node(4);
        root.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        //We are a root node,n1 and n2.We have to find minimum difference between n1 and n2.Minimum diffrence between two nodes is the number of edges between these nodes.
    }
}
