import java.util.*;
public class c_topViewOfBinaryTree {
    public static  class Node{
        int data;
        Node right,left;
        public Node(int data){
            this.data = data;
            this.left=null;
            this.right=null;
        }
    }
    static class Info{
        int hd;
        Node node;
        public Info(Node node,int hd){
            this.node=node;
            this.hd=hd;
        }
    }
    public static void topView(Node root){

        Queue<Info> q = new LinkedList<>();
        int max=0,min=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        q.add(new Info(root,0));
        q.add(null);
        while(!q.isEmpty()){
            Info curr = q.remove();
            if(curr==null){
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                    continue;
                }
            }
            if(curr.node.left!=null){
                q.add(new Info(curr.node.left,curr.hd-1));
                min=Math.min(min,curr.hd-1);
            }
            if(curr.node.right!=null){
                q.add(new Info(curr.node.right,curr.hd+1));
                max=Math.max(max,curr.hd+1);
            }
            if(!map.containsKey(curr.hd)){
                map.put(curr.hd,curr.node.data);
            }


            

        }
        //print
        for(int i=min;i<=max;i++){
            
            if(i>=0){

                System.out.print(map.get(i)+" ");
            }
            else{
                if((i*-1)>max){

                    System.out.print(map.get(i)+" ");
                }
            }
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left=new Node(2);
        // root.right=new Node(3);
        // root.left.left=new Node(4);
        // root.left.right=new Node(5);
        // root.right.left=new Node(6);
        // root.right.right=new Node(7);
        // root.left.left.left=new Node(8);
        //We are given a root node of a binary tree and we have to print top view of this binary tree.
        // topView(root);
        List<Integer>res = new ArrayList<>();
        
        LinkedHashMap<Integer,Integer> map = new LinkedHashMap<>();
        map.put(0,root.data);
        Queue<Info> q = new LinkedList<>();
        q.add(new Info(root,0));
        q.add(null);
        int min=0,max=0;
        while(!q.isEmpty()){
            Info curr =  q.remove();
            if(curr==null){
                if(q.isEmpty()){
                    break;
                }
                q.add(null);
                continue;
            }
            if(!map.containsKey(curr.hd)){
                map.put(curr.hd,curr.node.data);
            }
            if(curr.node.left!=null){
                q.add(new Info(curr.node.left,curr.hd-1));
                min = Math.min(min,curr.hd-1);
            }
            if(curr.node.right!=null){
                q.add(new Info(curr.node.right,curr.hd+1));
                max=Math.max(max,curr.hd+1);
            }
        }
    
        for(int i=min;i<=max;i++){
            
            if(i>=0){
                 res.add(map.get(i));
            
            }
            else{
                if((i*-1)>max){
                    res.add(map.get(i));
                    
                    
                }
            }
        }
       for(int i=0;i<res.size();i++){
        System.out.println(res.get(i)+" ");
       }

    }
}
