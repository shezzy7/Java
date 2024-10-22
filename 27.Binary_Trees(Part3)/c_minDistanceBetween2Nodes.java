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
    //LCA
    public static Node findLca(Node root,int n1,int n2){
        if(root==null){
            return root;
        }

        if(root.data==n1 || root.data==n2){
            return root;
        }

        Node leftLca = findLca(root.left, n1, n2);
        Node rightLca = findLca(root.right, n1, n2);

        if(leftLca==null){
            return rightLca;
        }
        if(rightLca==null){
            return leftLca;
        }

        return root;
    }

    public static int findDistance(Node lca,int n){
        if(lca==null){//if our node become null it means that our n does not lie in this subtree and we will return -1 as sign that our n does not lies in this subtree
            return -1;
        }
        if(lca.data==n){//if we found our required node then we will return 0 as distance of this node by itself is 0
            return 0;
        }

        int checkLeft = findDistance(lca.left, n);//if current node is node our required node then check in its left
        int checkRight = findDistance(lca.right, n);//then check in its right
        if(checkLeft==-1 && checkRight==-1){//if we get -1 from both side which means that our required node does not lies in this subtree then we will return -1.
            return -1;
        }
        if(checkLeft>-1){//if we found our node in leftSide then we will return prevDist+1 as this node will be making a distance of 1 from our required node
            return checkLeft +1;
        }
        return checkRight+1;//if our both sides are not returing -1 then it means that one of our side is returning positive value and if this positive value does not come from left side then it means that it is present in right side.
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(3);
        root.left.right = new Node(4);
        root.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        int n1 = 4 , n2 = 6;
        //We are a root node,n1 and n2.We have to find minimum difference between n1 and n2.Minimum diffrence between two nodes is the number of edges between these nodes.
        //Approach: if we find lca(lowest common ancestor of these nodes and then from this lca we calculate distance of each node from this lowest common ancestor and add them.This will be equall to minimum distance between these nodes).
        //lets find LCA
        Node lca = findLca(root,n1,n2);
        
        //Now we to calculate distance of n1 from lca 
        int n1Dist = findDistance(lca,n1);
        //Now we to calculate distance of n2 from lca 
        int n2Dist = findDistance(lca, n2);
        //Add them and it will be our result.
        int minDistance = n1Dist+n2Dist;
        System.out.println(minDistance);
    }
}
