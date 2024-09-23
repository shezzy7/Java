import java.util.*;
public class I_nextGreaterElement{
    public static void findNextGreater(int nums[],int[] nextGreater){
        //we are going to use a stack to solve this problem efficiently with time complexity of O(n)
        //we will start traversing on our array from end.
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
        //We are given an array of integers we have to find first greater element on the right sideof each integer and store them in an array.If any intger does not contain any element greater then him, then we put -1 as a result for its next greater element.
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