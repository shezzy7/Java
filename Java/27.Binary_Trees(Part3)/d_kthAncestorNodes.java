public class d_kthAncestorNodes{
    static class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int findKthAncestor(Node root,int k,Node target){
        //approach : we will find distance of target node from its ancestors,at which position we will find a ancestor whose distance from target is equall to k then it means that we have our result we'll print it.
        if(root==null){
            return -1;
        }
        if(root.data==target.data){
            return 0;
        }

        int findLeft = findKthAncestor(root.left, k, target);//find our target in root's left side
        int findRight = findKthAncestor(root.right, k, target);//find our target in root's right side

        if(findLeft==-1 && findRight==-1){//if our node does not exist in both leftSide nd rightSide then we will return -1.
            return -1;
        }
        
        int max = Math.max(findLeft,findRight);//as we know that one value from both of them is -1 and other is valid so this will give us our valid vaue
        if(max+1==k){ //if this nodes distance from our target is equall to k then this our result
            // System.out.println(root.data);
            res=root.data;//store its value in our global variable
        }

        return max+1;//return distance of previous ancestors and current node.


    }
    static int res;
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(5);
        root.left.left = new Node(3);
        root.left.right = new Node(4);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        Node target = new Node(4);
        int k=1;
        
        //We are given a root node , a target node and a k.We have to find kth ancestor of this target node.
        findKthAncestor(root, k, target);
        System.out.println("kth ancestor of "+target.data+" is "+res);


    }
}