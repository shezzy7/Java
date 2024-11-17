import java.util.ArrayList;
public class D_heap {
    static class Heap{
        ArrayList<Integer> arr = new ArrayList<>();

        //add in heap
        public void add(int val){
            arr.add(val);
            //in case of min-heap current nodes value can be less then its parent node , so in this case we have to swap them
            //we can get parent node's index by formula -> childNodeIndex-1/2
            int x = arr.size()-1;//as we add this elements at last of list so its index will be last index of list.
            int parent = (x-1)/2;

            while(arr.get(x)<arr.get(parent)){
                int temp = arr.get(parent);
                //now swap
                arr.set(parent , arr.get(x));
                arr.set(x,temp);

            }
        }
        //in min heap's peek method we get minimum element of the heap as see that the element at top of min-heap will be at top of heap(first elemetn of list)
        public int peek(){
            return arr.get(0);

        }
    }
    public static void main(String args[]){
        /*
            Heap:-Heap is data structure with following properties:
                1-Binary Tree :- Heap is always a binary tree.Each node contain maximum two child nodes.
                2-Complete BT :- Complete binary tree is a binary tree where all the levels are completely filled except possibly the last one,which is filled from left to right.
                3-Heap Order propert :- i- Children >= Parent (Min-heap). ii-Children <= Parent (Max-heap)

                Exampls Of heap : 
                                     10
                                    /  \
                                   4    5
                                 /  \
                                1    2
                            It is heap as we see it is binary tree and a complete binary tree.And here childrens are smaller then parents so its a max heap
                            Given tree is not a heap 
                                     10
                                    /  \
                                   4    5
                                 /  \
                                1    6
                            As here we see it is a binary tree and a complete binary tree but here we see that 6 is greater then 4 which  which is denying the property of max heap as its upper level is showing the property of max heap.  
                            
                            

        */
        //Visualization :- We visualize them as binary trees but implement them using array/arraylist.
        //Max Heap :- In max heap element with greater value is prioritized over lower ones.
        /*
                    10
                   /  \
                  4    5
                 /  \
                1    2
         */
        //Min Heap :- In min heap element with lower value is prioritized over greater ones.
        /*
                    1
                   /  \
                  2    4
                 /  \
                5    10
         */
        //Our priority queues as implemented by heaps.

        //And in java we implement heap by using Array/ArrayList  because if we use class objects as we use them while building a tree , then for adding a new element in a tree will take more time as we will have to traverse over all the nodes to check which place is empty to place this node.And even after finding the empty place we may also see that this position is not good for current val.For example of we see above tree and we want to add a new element 3 in it.Then after traversing over this whole tree we will find that we can make it left child of 4.But we see that it is a min-heap.And 4 is greater than 3 we will have to swap them also.And it will go on increasing complexity of operation.
        //So for avoiding from this problem we use arraylist.As we can add any element in list with time complexity of O(1).
        //If place values of above min-heap in array that we will represent them as -> {1,2,4,5,10}
        //We get left child of a ith node by 2i+1.And right child by 2i+2.And we can see this by above array
        //left-child of ith element = 2i+1 
        //right-child of ith element = 2i+2 
        

    }
}
