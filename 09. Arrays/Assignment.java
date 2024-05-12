public class Assignment {
    //Q1->Given an integer array nums,return true if any value appears at least twice in the array 
    //    and return false if every element is distinct
    public static boolean twice(int nums[]){
        int n=nums.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]==nums[j]){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String args[]){
        int nums[]={1,2,5,7,1,3};
        System.out.println(twice(nums));
    }
}
