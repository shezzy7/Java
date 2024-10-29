import java.util.*;

public class f_pathToLeafNodes {
    static class Node{
        int val;
        Node right,left;
        public Node(int data){
            val=data;
        }
    }
    public static Node buildBST(int val,Node root){
        if(root==null){
            return new Node(val);
        }
        if(val<root.val){
            root.left = buildBST(val, root.left);

        }
        else{
            root.right = buildBST(val, root.right);
        }
        return root;
    }
    public static void printPath(ArrayList<Integer> list){
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
    }
    public static void pathsToLeafNodes(Node root, ArrayList<Integer>list){
        if(root==null){
            return;
        }
        list.add(root.val);
        if(root.left==null && root.right==null){
            printPath(list);
            list.remove(list.size()-1);
            return;
        }
        pathsToLeafNodes(root.left, list);
        pathsToLeafNodes(root.right, list);


    }
    public static void main(String[] args) {
        int values[] = { 8 , 5 , 6 , 3 , 4 , 1 , 10 , 11 , 14 };
        Node root = null;
        for(int i=0;i<values.length;i++){
            root = buildBST(values[i], root);
        }
        
        //we are given a root node of a BST.We have to print paths to leaf nodes
        pathsToLeafNodes(root,new ArrayList<Integer>()); 
    }
}
