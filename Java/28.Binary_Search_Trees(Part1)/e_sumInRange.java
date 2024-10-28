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
    public static void main(String args[]){
        int values[] = { 8 , 5 , 6 , 3 , 4 , 1 , 10 , 11 , 14 };
        Node root = null;
        for(int i=0;i<values.length;i++){
            root = buildBST(values[i], root);
        }

        int k1 = 5 , k2 = 12 ;
        



    }
}