public class A_sortedArrayToBST {
    static class Node {
        int val;
        Node right, left;

        public Node(int data) {
            val = data;
        }
    }

    // build
    public static Node buildBST(int values[], int si, int ei) {
        // if at any point our starting point goes above our ending point then it means
        // that there are no elements in array between these indexes to be traverse and
        // we will return null
        if (si > ei) {
            return null;
        }
        // calcultae mid
        int mid = si + (ei - si) / 2;
        Node root = new Node(values[mid]);
        root.left = buildBST(values, si, mid - 1);// in our left subtree there will be values less then our root node so
                                                  // wew will go to left side of array as it contains values smaller
                                                  // then our mid index value
        root.right = buildBST(values, mid + 1, ei);// and in right we will set values on right side of array as they are
                                                   // greater than our mid index's value
        return root;
    }

    public static void main(String args[]) {
        int values[] = { 3, 5, 6, 8, 10, 11, 12, 14 };
        // We are given a sorted array of integers.We have to construct a BST from it ,
        // with minimum possible depth.
        // We can make BST from this array in this way that our root node is ,its right
        // is 4,its right is 5 and son in this sequence , such that each next node is
        // right child of current node , in sequence of given array and it will be a BST
        // but its depth will be high.And we have to make such a BST , whose depth
        // should be minimum as much as possible.
        // Appraoch : As we know that inorder traversal of a BST gives an ascending
        // order of values.
        // So here if we make mid value of array and make it root node and values on its
        // left side should be its left subtree and value on its right side should be
        // its right subtree.And follow the same approach will making its left subtreea
        // nd right subtree , then in this way we can contrcut a BST with possible
        // minimum depth.
        Node root = buildBST(values, 0, values.length - 1);// for calculating mid we will pass starting and ending index of array 
        

    }
}