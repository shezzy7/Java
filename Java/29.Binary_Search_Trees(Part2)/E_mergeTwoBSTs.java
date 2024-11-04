import java.util.*;
public class E_mergeTwoBSTs {
    static class Node{
        int val;
        Node left , right;
        public Node(int data){
            this.val = data;
            this.left = this.right = null;
        }
    }

    public static void inorderTrav(Node root , ArrayList<Integer> list ){
        if(root == null){
            return;
        }
        inorderTrav(root.left, list);
        list.add(root.val);
        inorderTrav(root.right, list);
    }

    //merge
    public static void merge(ArrayList<Integer> mergList , ArrayList<Integer> list1 ,ArrayList<Integer> list2){
        int i = 0;
        int j=0;
        
        while(i<list1.size() && j<list2.size()){
            if(list1.get(i)<list2.get(j)){
                mergList.add(list1.get(i));
                i++;
            }
            else{
                mergList.add(list2.get(j));
                j++;  
            }
        }
        while(i<list1.size()){
            mergList.add(list1.get(i));
            i++;
        }
        while(j<list2.size()){
            mergList.add(list1.get(j));
            j++;
        }

    }

    public static Node buildBST( ArrayList<Integer> list , int si , int ei){
        if(si>ei){
            return null;
        }
        int mid = si+(ei-si)/2;
        Node root = new Node(list.get(mid));
        root.left = buildBST(list, si, mid-1);
        root.right = buildBST(list, mid+1, ei);
        return root ; 

    }
    public static void main(String[] args) {
        Node root1 = new Node(2);
        root1.left = new Node(1);
        root1.right = new Node(4);
        /*
                2
              /   \
             1     4
         */
        //Second BST
        Node root2 = new Node(9);
        root2.left = new Node(3);
        root2.right = new Node(12);
        /*
                9
              /   \
             3     12
         */
        //WE are given two BSTs , we have to merge them in such a way that that the resultant tre shoukd also be BST.
        
        //Approach : If we get inorder traversal of both trees in separate arrays and then merge those arrays so that the resultant array should be also sorted and them from this array we build a BST.
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        //store 1st tree in array
        inorderTrav(root1 , list1);
        //store 2nd tree in array
        inorderTrav(root2 , list2);
        //now merge these lists
        ArrayList<Integer> mergedList = new ArrayList<>();
        merge(mergedList , list1 , list2);

        //after mergin creat a BST using this list
        Node res = buildBST(mergedList , 0 , mergedList.size()-1);

    }

}
