public class e_sumInRange{
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

    public static void printInRange(Node root , int k1 , int k2 ){
        if(root == null){
            return;
        }

        if(root.val>=k1 && root.val<=k2){//if root's value is between k1 and k2 then we have to got to both left side and right side.
            printInRange(root.left, k1, k2);//check left side
            System.out.print(root.val+" ");//print root node
            printInRange(root.right, k1, k2);//check right side
        }
        else if( root.val > k2 ){//else if root's value  is greater than k2 then we have to go to left side only.

            printInRange(root.left, k1, k2);
        }
        else{ // else if root's value is less than k1 then we have to go to right side only.

            printInRange(root.right, k1, k2);
        }
    }
    public static void main(String args[]){
        int values[] = { 8 , 5 , 6 , 3 , 4 , 1 , 10 , 11 , 14 };
        Node root = null;
        for(int i=0;i<values.length;i++){
            root = buildBST(values[i], root);
        }

        int k1 = 5 , k2 = 12 ;

        //we are given a root node of a tree ,two integers k1 and k2, we have to print all the nodes whose values lie between k1 and k2.
        printInRange(root,k1,k2);


    }
}