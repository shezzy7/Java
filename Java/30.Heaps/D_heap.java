import java.util.ArrayList;
public class D_heap {
    static class Heap{
        ArrayList<Integer> arr = new ArrayList<>();

        //add in heap
        public void add(int val){
            arr.add(val);
            //in case of min-heap child node's value that we are adding currently in heap can be less then its parent node , so in this case we have to balance our heap
            //we can get parent node's index by formula -> childNodeIndex-1/2
            int x = arr.size()-1;//as we add this elements at last of list so its index will be last index of list.
            int parent = (x-1)/2;//parent index

            while(parent>=0 && arr.get(x)<arr.get(parent)){
                //excahnge values
                int temp = arr.get(parent);
                //now swap
                arr.set(parent , arr.get(x));
                arr.set(x,temp);
                //after swaping update child and parent index
                x = parent; 
                parent = (x-1)/2; 

            }
        }
        //in min heap's peek method we get minimum element of the heap.So as we see that the element at top of min-heap will be the minimum element of  heap(first elemetn of list)
        public int peek(){//O(1)
            return arr.get(0);

        }

        public int remove(){//O(logn)
            //for removing top element of min heap we take follwing 3 steps
            //1-Swap first and last element of min-heap.
            //2-remove last element of min-heap after swaping.
            //3-After swaping and removing last element from min-heap , we have done our work of removing top of heap but after swaping and removing this element our heap will be un-balanced.To balance it we perform another function name heapify.
            
            //1-Swap
            int temp = arr.get(0);
            arr.set(0,arr.get(arr.size()-1));
            arr.set(arr.size()-1,temp);

            //2-remove get last element
            int res = arr.remove(arr.size()-1);

            //3-balance heap
            heapify(0);//after placing last value of heap at top we have to check  whether after placing this value at first ,  does our heap is un-balanced if un-balanced then we will balance it.And we are placing last element of heap at top(0 index).So it means that if after placing this element at top our heap is un-balanced then we will fix our heap by placing this element at its correct position.So here we are pasiing its index to heapify which will do our work.

            return res;//then return the element that was at top of heap previoulsy saved in variable res.
            
        }

        //we are gonna make this function private as we don't nned to call it from our main function , will be caled automatically whenever we will remove a value from our heap.
        private void heapify(int i){//O(logn)
            //to check un-balancy in our heap we have to compare our parent node's value with its left and right child as we are talking about min-heap our parents value must be lower then childs.If not then will have to fix it in following way
            //get index of right and left child to compare them with parent node.
            int left = 2*i+1;
            int right = 2*i+2;
            //we will assume that our ith value is smallest, to compare it with its childs
            int minIdx  = i;

            //Then we will compare these parent and child nodes values and will find index of smallest of these three.As our smallest element should be at top(parent's place).
            if(left<arr.size() && arr.get(left)<arr.get(minIdx)){//we will check first whether our left index is not going out of bounds and value at its position is smaller then it parent's value only in this case we will set our minIdx = left. 
                minIdx=left;
            }
            if(right<arr.size() && arr.get(right)<arr.get(minIdx)){
                minIdx=right;
            }
            //now check whether minIdx has changed or remained same,if changed then it means that our parent was not smaller then its child nodes so we swap it with its child node whose values is smaller between all of these. 
            if(minIdx!=i){
                int temp = arr.get(i);
                arr.set(i,arr.get(minIdx));
                arr.set(minIdx , temp);
                //now after swaping we also have to check whether after swaping it,  our heap is still un-balanced or not if unbalanced then we have to fix it.As we are placing our parent node at minIdx so we will check un-balancy from this index.
                heapify(minIdx);
            }

        }
        //check empty
        public boolean isEmpty(){
            return arr.size()==0;
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

        Heap h = new Heap();
        h.add(4);
        h.add(1);
        h.add(3);
        h.add(2);

        while(!h.isEmpty()){
            System.out.print(h.peek()+" ");
            h.remove();
        }
        //here we will see that all the elements are printed in ascending order even we add them randomly.So this is how our priority queue are implementd actually.

        //This is a min-heap.
        //We can convert it into a max-heap by just inversing the conditions while comparing.
        


    }
}
