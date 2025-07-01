import java.util.*;
public class I_nextGreaterElement{
    public static void findNextGreater(int nums[],int[] nextGreater){
        //we are going to use a stack to solve this problem efficiently with time complexity of O(n)
        //we will start traversing on our array from end.
        // To find next greater element of a specifice element we use two loops(a loop inside a loop).In which we will take an element and then will start traversing over all the elements next to this element in this array.And when we will found any element which is smaller then this selected element then we will store it at same index in our result array.Else if there is no element smaller then selected element then we will insert -1 as a result for this specific element.By doing so we can find next greater element for each element of array.
        // But this approach will take timple complexity of n^2

        // We can solve this problem in an effiecient by using a stack.

        // We will start traversing from last element of array.As we know that there is no element after last element so we can insert -1 for it directly.In our stack we will insert index of current element.
        Stack<Integer> st = new Stack<>();
        for(int i=nums.length-1;i>=0;i--){
            int curr = nums[i];
            while(!st.isEmpty() && curr>st.peek()){
                st.pop();
            }
            if(st.isEmpty()){//if all the next elements were samller then current element then we will this element's result as -1.
                nextGreater[i]=-1;
            }
            else{//else if there was some element which was greater then our curren telement then it will be at top of our stack and we will put it as next greater element of current eleemnt.
                nextGreater[i]=st.peek();
            }
            st.push(nums[i]);//after checking current element we will also push it to stack top as it may also be next greater element of any of remaining elements.
        }
    }
    public static void main(String args[]){
        //Given question is very important and has been asked in many coding interviews.
        //We are given an array of integers we have to find first greater element on the right sideof each integer and store them in a new array.If any intger does not contain any element greater then him, then we put -1 as a result for its next greater element.
        //for example given input is -> {4,1,2,9,12} then output will be -> {9,2,9,12,-1}
        int nums[] = {6,8,0,1,3};
        int nextGreater[] = new int[nums.length];
        findNextGreater(nums,nextGreater);
        //lets print the result
        for(int i=0;i<nextGreater.length;i++){
            System.out.print(nextGreater[i]+" ");
        }


    }
}