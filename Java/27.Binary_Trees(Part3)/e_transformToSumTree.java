import java.util.*;
public class e_transformToSumTree {
    static class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    //print tree
    public static void printTree(Node root){
      Queue<Node> q = new LinkedList<>();
      q.add(root);
      q.add(null);
      while(!q.isEmpty() && q.peek()!=null){
        
        if(q.peek().left!=null){
          q.add(q.peek().left);
        }
        if(q.peek().right!=null){
          q.add(q.peek().right);
        }
        System.out.print(q.remove().data+" ");
        if(q.peek()==null){
          System.out.println();
          q.remove();
          q.add(null);
        }

      }
    }
    public static int transform(Node root){
      if(root==null){
        return 0;
      }

      int leftSum = transform(root.left);//calculate sum of all nodes present in left subtree
      int rightSum = transform(root.right);//calculate sum of all nodes present in right subtree
      int tempRes = leftSum+rightSum+root.data;//the value which we will return from here will be sum of result returned from left subtree plus result returned fro  right subtree and current node's value.
      root.data=leftSum+rightSum;//but our current node's data will become equall to sum of result returned from all the nodes from left subtree and result returned from all the nodes from right subtree.
      return tempRes;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        // root.right.right.left = new Node(8);
        // root.right.right.right = new Node(9);
        //We are given a tree with root node.We have to transform it in such a way that each node must contain sum of all of its descendants.Return the transoformed root node.
        // input tree
        /*
                        1
                      /   \
                     2      3
                   /  \    / \
                  4    5  6   7
         */
        //expected output
        /*
                        27
                      /   \
                     9      13
                   /  \    / \
                  0    0  0   0
         */
        //lets print original tree first
        System.out.println("Original Tree");
        printTree(root);
        transform(root);
        System.out.println("Transformed Tree");
        printTree(root);

         

    }
}
