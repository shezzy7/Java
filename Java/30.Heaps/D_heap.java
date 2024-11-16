public class D_heap {
    
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

    }
}
