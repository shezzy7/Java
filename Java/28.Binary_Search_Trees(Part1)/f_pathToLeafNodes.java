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
        list.add(root.val);//first add the node in list
        if(root.left==null && root.right==null){//if left and right of current node are null then it means that this node is a leaf node and it's the completion of a path,we will print this path 
            printPath(list);
            list.remove(list.size()-1);//after print the path we will also remove the leaf node from our list.
            return;
        }
        pathsToLeafNodes(root.left, list);//after adding the current node and cheking that this node has some child nodes we will go to its child nodes(left subtree and right subtree).
        pathsToLeafNodes(root.right, list);


    }
    public static void main(String[] args) {
        int values[] = { 8 , 5 , 3 ,  1 , 4 , 6 ,  10 , 11 , 14 };
        Node root = null;
        for(int i=0;i<values.length;i++){
            root = buildBST(values[i], root);
        }
        
        //we are given a root node of a BST.We have to print paths to leaf nodes
        pathsToLeafNodes(root,new ArrayList<Integer>()); 
    }
}
