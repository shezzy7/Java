import java.util.*;
public class b_lowestCommonAncestor {
    static class Node{
        int data;
        Node right,left;
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static boolean findPath(Node root,int n, ArrayList<Node> path){
        if(root==null){
            return false;
        }
        path.add(root);//first add the current node in path
        if(root.data==n){//if this is the node of whome we are finding path then we will stop going more furthure,as we have find path for this.
            return true;
        }
        boolean findLeft = findPath(root.left, n, path);//try to search path in leftside
        boolean findRight = findPath(root.right, n, path);//try to search path in rightside
        if(findLeft || findRight){ //if from any of those sides(left or right) we find path then we will return true as we have find path
            return true;
        }
        path.remove(path.size()-1);//and if we cannot find path in left or right side of this root then it means that our required noode does not lie in that path and we will remove this node from out list.
        return false;
    }
    public static int findlca(Node root,int n1,int n2){
        //approach if we find path of both nodes from root to themseleve.And then we store path of each node in separate lists.And then traverse over these lists together.Then as we know that all the nodes in their common path from root will be same.And their will be a node from which their path may separate as their path will separate node's value will mismatch.And the node before first mismatching value will be their common ancestor and we will return it.
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();
        findPath(root,n1,path1);
        findPath(root,n2,path2);
        int i=0;
        for(; i<path1.size() && i<path2.size() ; i++){
            if(path1.get(i)!=path2.get(i)){
                break;
            }
        }
        return path1.get(i-1).data;
    }
    public static void main(String args[]){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);
        int n1 = 3 , n2 = 5;
        //We are given a root node and n1 and n2.We are asked to find lowest common ancestor of binary tree.

       System.out.println( findlca(root,n1,n2));
    }
}
