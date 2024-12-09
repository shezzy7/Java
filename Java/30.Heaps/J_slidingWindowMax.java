import java.util.PriorityQueue;

public class J_slidingWindowMax {
    static class Pair implements Comparable<Pair>{
        int idx;
        int val;
        public Pair(int val,int idx){
            this.idx = idx;
            this.val = val;
        }

        @Override
        public int compareTo(Pair r2){
            return r2.val-this.val;
        }
    }
    public static void main(String[] args) {
        int nums[] = { 1, 3, -1, -3, 5, 3, 6, 7 };
        int k = 3;
        // You are given an array of integers nums, there is a sliding window of size k which is moving from the very left of the array to the very right. You can only see the k numbers in the window. Each time the sliding window moves right by one position.
        //Find the maximum value from each sliding window.
        /* 
        Example:
        Input: nums = [1,3,-1,-3,5,3,6,7], k = 3
        Output: [3,3,5,5,6,7]
        Explanation: 
            Window position                Max
            ---------------               -----
            [1  3  -1] -3  5  3  6  7       3
            1 [3  -1  -3] 5  3  6  7        3
            1  3 [-1  -3  5] 3  6  7        5
            1  3  -1 [-3  5  3] 6  7        5
            1  3  -1  -3 [5  3  6] 7        6
            1  3  -1  -3  5 [3  6  7]       7
        */

        
        //Appraoch:-Create a PQ in which store value of each elements wiht its index.Then sent the compareTo function for placing greaer elements at top of pq.
        //Create a result array of size nums.length-k+1


        PriorityQueue<Pair> pq = new PriorityQueue<>();
        for(int i=0;i<k;i++){
            pq.add(new Pair(nums[i] , i));
        }

        int res[] = new int[nums.length-k+1];
        res[0] = pq.peek().val;

        for(int i=k;i<nums.length;i++){
            while(pq.size()>0 && pq.peek().idx<=(i-k)){//-1,-3 , 5
                pq.remove();
            }
            pq.add(new Pair(nums[i] , i));
            res[i-k+1] = pq.peek().val;
        }

        //result
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }




    }
}
