public class b_lowestCommonAncestor2 {
    static class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node findAncestor(Node root,int n1,int n2){
        //base case
        if(root==null){
            return root;
        }
        //if our root node becomes equall to any node then it means that we found our node and just return from here
        if(root.data==n1 || root.data==n2){
            return root;
        }
        //kaam
        Node leftLca = findAncestor(root.left, n1, n2);//if our root node does not equalls n1 or n2 then we have to find in its left and right side
        Node rightLca = findAncestor(root.right, n1, n2);

        if(leftLca==null){//if our leftSide returns null which means taht it does not contains any of both values, then we can simply return our rightSide result.Bcz in this case our only hope is our rightSide that may contain our result and vice versa.
            return rightLca;
        }
        if(rightLca==null){
            return leftLca;
        }
        //if both sides returns us a valid value then it means that our root node is their common ancestor and we will simply return it.
        return root;
    }
    public static void main(String args[]){
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(3);
        root.left.right = new Node(4);
        root.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        int n1 = 4,n2=3;
        //We are a root of a binary tree and n1 and n2.We have to find lowest common ancestor of n1 and n2 in our binary tree.
        Node res  = findAncestor(root,n1,n2);
        System.out.println("Lowest common ancestor is : "+res.data );
    }
}
