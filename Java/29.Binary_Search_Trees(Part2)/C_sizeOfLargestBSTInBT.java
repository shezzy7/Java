public class C_sizeOfLargestBSTInBT {
    static class Node{
        int val;
        Node right , left;
        public Node(int data){
            this.val = data;
            this.right = this.left = null;
        }

    }
    static class Info{//creating a class which will help in containg info of each node
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
    public static int maxBST=0;//a global variable to store size of max BST
    public static Info sizeOfLargestBST(Node root){

        if(root==null){//if root is null then it means that it is a BST with size of 0 and we will pass +infinity as minimum value from left subtree and -infinity as maximum value from right subtree,so that on calculating min value for other nodes their min and max value will be updated as min will be comparing itself with +infinity and max with -infinity 
            return new Info(true , 0 , Integer.MAX_VALUE ,  Integer.MIN_VALUE );
        }
        Info leftInfo = sizeOfLargestBST(root.left);//cal info of left subtree and store it in a object
        Info rightInfo = sizeOfLargestBST(root.right);//cal info of right subtree and store it in a object
        int size = leftInfo.size + rightInfo.size + 1; //size of current node will be equall to size of left subtree and right subtree plus its own size
        //Note : here size means total number nodes not height or depth 
        int min = Math.min(root.val , Math.min(leftInfo.min , rightInfo.min));
        int max = Math.max(root.val , Math.max(rightInfo.max , leftInfo.max));

        if(root.val <= leftInfo.max || root.val>=rightInfo.min){
            return new Info(false,size,min,max);
        }

        if(leftInfo.isValid && rightInfo.isValid){
            maxBST = Math.max(maxBST,size);
            return new Info(true, size, min, max);
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
