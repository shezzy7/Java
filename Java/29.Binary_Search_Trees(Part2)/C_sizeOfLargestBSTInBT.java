public class C_sizeOfLargestBSTInBT {
    static class Node{
        int val;
        Node right , left;
        public Node(int data){
            this.val = data;
            this.right = this.left = null;
        }

    }
    static class Info{
        boolean isValid;
        int size;
        int max,min;
        public Info(boolean isValid , int size , int min , int max){
            this.isValid = isValid ;
            this.size = size;
            this.min = min;
            this.max = max;
        }
    }
    public static int maxBST=0;
    public static Info sizeOfLargestBST(Node root){
        if(root==null){
            return new Info(true , 0 , Integer.MIN_VALUE ,  Integer.MAX_VALUE );
        }
        Info leftInfo = sizeOfLargestBST(root.left);
        Info rightInfo = sizeOfLargestBST(root.right);
        int size = leftInfo.size + rightInfo.size + 1;
        int min = Math.min(root.val , leftInfo.min , rightInfo.min);
        int max = Math.max(root.val , rightInfo.max , leftInfo.max);

        if(root.val <= leftInfo.max || root.val>=rightInfo.min){
            return new Info(false,size,min,max);
        }

        if(leftInfo.isValid && rightInfo.isValid){
            maxBST = Math.max(maxBST,size);
            return new Info(true, size, min, max)
        }

        return new Info(false,size,min ,max);
    }
    public static void main(String args[]){
        /* 
                        50
                      /    \
                    30      60
                   /  \    /   \
                  5   20  45    70
                               /   \
                              65    80
        */ 

        Node root = new Node(50);
        root.left = new Node(30);
        root.left.left = new Node(5);
        root.left.right = new Node(20);
        root.right = new Node(60);
        root.right.left = new Node(45);
        root.right.right = new Node(70);
        root.right.right.left = new Node(65);
        root.right.right.right = new Node(80);

        //We are given a BT and we are asked to find the size of largest BST in this BT.

        sizeOfLargestBST(root);
        System.out.println("Size of largest Binary Search Tree is : "+maxBST);

    }
}
