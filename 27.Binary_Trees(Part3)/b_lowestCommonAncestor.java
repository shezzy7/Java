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
        path.add(root);
        if(root.data==n){
            return true;
        }
        boolean findLeft = findPath(root.left, n, path);
        boolean findRight = findPath(root.right, n, path);
        if(findLeft || findRight){
            return true;
        }
        path.remove(path.size()-1);
        return false;
    }
    public static int findlca(Node root,int n1,int n2){
        
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
        
       System.out.println( findlca(root,n1,n2));
    }
}
