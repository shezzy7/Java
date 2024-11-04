public class D_maxSumBST {
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
    public static Node maxNode = null;//store the node of maxmum BST in this

    public static Info sizeOfLargestBST(Node root){
        //first of all we will find the node which makes our BST with maximum size
        if(root==null){//if root is null then it means that it is a BST with size of 0 and we will pass +infinity as minimum value from left subtree and -infinity as maximum value from right subtree,so that on calculating min value for other nodes their min and max value will be updated as min will be comparing itself with +infinity and max with -infinity 
            return new Info(true , 0 , Integer.MAX_VALUE ,  Integer.MIN_VALUE );
        }
        Info leftInfo = sizeOfLargestBST(root.left);//cal info of left subtree and store it in a object
        Info rightInfo = sizeOfLargestBST(root.right);//cal info of right subtree and store it in a object
        int size = leftInfo.size + rightInfo.size + 1; //size of current node will be equall to size of left subtree and right subtree plus its own size
        //Note : here size means total number nodes not height or depth 
        int min = Math.min(root.val , Math.min(leftInfo.min , rightInfo.min));//get min value for root node
        int max = Math.max(root.val , Math.max(rightInfo.max , leftInfo.max));//get max value

        if(root.val <= leftInfo.max || root.val>=rightInfo.min){//compare if root node not making a BST
            return new Info(false,size,min,max);
        }

        if(leftInfo.isValid && rightInfo.isValid){//if root node is also a BST
            maxNode = root;
            return new Info(true, size, min, max);
        }

        return new Info(false,size,min ,max);//else return false
    }

    public static int calSum(Node root){//now traverse overt this tree and calculte sum of all its nodes
        if(root==null){
            return 0;
        }
        int leftSum = calSum(root.left);
        int righSum = calSum(root.right);
        return leftSum+righSum+root.val;
    }
    public static void main(String args[]){
        /* 
                        50
                      /    \
                    30      60
                   /  \    /   \
                  5   20  45    70
                               /   \
                              65    63
        */ 

        Node root = new Node(-4);
        root.left = new Node(-2);
        // root.left.left = new Node(5);
        // root.left.right = new Node(20);
        root.right = new Node(-5);
        // root.right.left = new Node(45);
        // root.right.right = new Node(70);
        // root.right.right.left = new Node(65);
        // root.right.right.right = new Node(80);

        //We are given a BT and we are asked to find the sum of all the nodes of largest BST in this BT.

        calInfo(root);
        int sum = calSum(maxNode);
        System.out.println("Sum of all the nodes of largest Binary Search Tree is : "+sum);


    }
}
