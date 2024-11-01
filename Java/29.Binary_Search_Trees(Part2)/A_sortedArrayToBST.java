public class A_sortedArrayToBST{
    static class Node{
        int val;
        Node right,left;
        public Node(int data){
            val = data;
        }
    }

    //build
    public static Node buildBST(int values[] , int si , int ei){
        //if at any point our starting point goes above our ending point then it means that there are no elements in array between these indexes to be traverse and we will return null
        if(si>ei){
            return null;
        }
        //calcultae mid
        
    }
    public static void main(String args[]){
        int values[] = {3,4,5,6,7,8,9,10,11,12};
        // We are given a sorted array of integers.We have to construct a BST from it , with minimum possible depth.
        // We can make BST from this array in this way that our root node is ,its right is 4,its right is 5 and son in this sequence , such that each next node is right child of current node , in sequence of given array and it will be a BST but its depth will be high.And we have to make such a BST , whose depth should be minimum as much as possible.
        //Appraoch : As we know that inorder traversal of a BST gives an ascending order of values.
        //So here if we make mid value of array and make it root node and values on its left side should be its left subtree and value on its right side should be its right subtree.And follow the same approach will making its left subtreea nd right subtree , then in this way we can contrcut a BST with possible minimum depth.
        Node root = buildBST(values,0,values.length-1);//for calculating mid we will pass starting and ending index of array

    }
}