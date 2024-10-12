import java.util.*;
public class F_levelOrderTraversal {
     static class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
     static class BinaryTree{

        static int idx=-1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
    
    }
    public static List<List<Integer>> levelOrderTrav(Node root){
        //In level order traversal we print all the elements level wise.Mean elements present at same level would be printed then we will move to next level and will print all the elements present at that level.
        //For print our elements in level order we can use a queue.In this queue will add elements present at same level and then as we will go to print a element we will add its childs(left,right) in queue.And when we print other element we will all of its childs to queue.
        List<List<Integer>>ls = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
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
            temp.add(q.peek().data);
            System.out.print(q.remove().data+" ");
            if(q.peek()==null){
                ls.add(new ArrayList<>(temp));
                q.remove();
                temp = new ArrayList<>();
                System.out.println();
                if(!q.isEmpty()){
                    q.add(null);
                }
            }
        }
        return ls;
        
        
    }
    public static void main(String args[]){
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        List<List<Integer>>ls = levelOrderTrav(root);
        for(int i=0;i<ls.size();i++){
            ArrayList<Integer> temp = new ArrayList<>(ls.get(i));
            for(int j=0;j<temp.size();j++){
                System.out.print(temp.get(j)+" ");
            }
            System.out.println();
        }
    }
}
