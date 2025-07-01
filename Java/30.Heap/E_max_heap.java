
import java.util.ArrayList;
public class E_max_heap {
    static class Heap{
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int val){
            arr.add(val);

            int x = arr.size()-1;
            int par = (x-1)/2;
            while(par<=0 && arr.get(par)<arr.get(x)){//one change we have maded (we will place larger element at top)
                int temp = arr.get(x);
                arr.set(x,arr.get(par));
                arr.set(par,temp);
                x = par;
                par = (x-1)/2;
            }
        }

        public int peek(){
            if(!isEmpty()){
                return arr.get(0);
            }
            else{
                return -1;
            }
        }

        public int remove(){
            if(!isEmpty()){
                int temp = arr.get(0);
                arr.set(0,arr.get(arr.size()-1));
                arr.set(arr.size()-1,temp);

                int res = arr.remove(arr.size()-1);

                heapify(0);
                return res;
            }
            return -1;
        }

        private void heapify(int i){
            int left = 2*i+1;
            int right = 2*i+2;
            
            int maxIdx = i;
            if(left<arr.size() && arr.get(left)>arr.get(maxIdx)){//we will find index of element with greater value instead of samaller one.
                maxIdx = left;
            }
            if(right<arr.size() && arr.get(right)>arr.get(maxIdx)){
                maxIdx = right;
            }

            if(maxIdx!=i){
                int temp = arr.get(i);
                arr.set(i,arr.get(maxIdx));
                arr.set(maxIdx,temp);
                heapify(maxIdx);
            }

            
        }
        public boolean isEmpty(){
            return arr.size()==0;
        }

    }
    public static void main(String args[]){
        //all functionality here is same here of a heap but here we are building a max-heap.
        Heap max_heap = new Heap();
        max_heap.add(1);
        max_heap.add(5);
        max_heap.add(4);
        max_heap.add(2);
        max_heap.add(3);

        while(!max_heap.isEmpty()){
            System.out.print(max_heap.peek()+" ");
            max_heap.remove();
        }

    }
}
