import java.util.*;
public class B_bstToBalancedBST {
    static class Node{
        int val;
        Node left , right;
        public Node(int data){
            this.val = data;
            this.left = this.right = null;
        }
    }

    //store inorder into list
    public static void inorder(Node root , ArrayList<Integer>list){
        if(root==null){
            return;
        }
        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);
    }
    //Build Tree
    public static Node buildTree(ArrayList<Integer>list,int si,int ei){
        if(si>ei){
            return null;
        }
        int mid = si+(ei-si)/2;
        Node root = new Node(list.get(mid));
        root.left = buildTree(list, si, mid-1);
        root.right = buildTree(list, mid+1, ei);
        return root;
    }
    public static Node convertToBST(Node root ){
        ArrayList<Integer> list = new ArrayList<>();
        inorder(root,list);
        root = buildTree(list,0,list.size()-1);
        return root;
        
    }

    //preorder
    public static void printPreOrder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.val+" ");
        printPreOrder(root.left);
        printPreOrder(root.right);
    }
    public static void main(String args[]){
        Node root = new Node(8);
        root.left = new Node(6);
        root.left.left = new Node(5);
        root.left.left.left = new Node(3);
        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(12);
        //we are given a Binary search tree
         /*
                        8
                      /   \
                     6      10
                   /         \
                  5           11
       */

         //Approach : if get inorder sequence of given tree and store it in an arraylist.From this arraylist we can make a BST as we have done befor.
         //print pre-order before
         System.out.print("Pre-Order efore : ");
         printPreOrder(root);
         root = convertToBST(root);
         
         //print preorder
         System.out.print("\nPre-Order After : ");
         printPreOrder(root);

         //Over all time complexity of this code will be - O(n)
         
    }
}
