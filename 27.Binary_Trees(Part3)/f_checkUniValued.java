import java.util.*;
public class f_checkUniValued{
    static class Node{
        int val;
        Node right;
        Node left;
        public Node(int val){
            this.val = val;
            this.right = null;
            this.left = null;
        }
    }

    public static boolean univalued(Node root,HashMap<Integer,Integer> map){
        if(root==null){
            return true;
        }
        if(map.containsKey(root.val)){//if map contains this value then it mean that it is duplicated.
            return false;
        }
        map.put(root.val,root.val);//put nodes value in map
        if(!univalued(root.left, map)){//if any child on leftside of this node is duplicate then this will return us false and in this condition we will also return false.
            return false;
        }
        if(!univalued(root.right, map)){//we will also cehck for right side.
            return false;
        }
        return true;//if we found no duplicate in any side then we will return true.

    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(4);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        //We have a binary tree we have to find that the tree is univalued or not.
        //Approach:- We will go on a node and will check if this node's value is present in our hashmap then it means that our tree is not univalued.But if not present then we will go on checking all the nodes of this tree adn if at any point we detect a duplicated in our map then we will return fasle,else true will be returnd. 
        HashMap<Integer,Integer> map = new HashMap<>();
        boolean res = univalued(root,map);
        System.out.println(res);
    }
}