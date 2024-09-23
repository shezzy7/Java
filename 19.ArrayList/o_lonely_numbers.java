import java.util.*;
public class o_lonely_numbers{
    public static void lonelyNumbers(ArrayList<Integer>list){

        //if there is only single element then just return it
        if(list.size()==1){
            System.out.print(list.get(0));
            return;
        }

        //sorting list 
        Collections.sort(list)

        ArrayList <Integer> list2 = new ArrayList<>();
        for(int i=1;i<list.size()-1;i++){
            if(list.get(i-1)+1<list.get(i) && list.get(i)+1<list.get(i+1)){
                list2.add(list.get(i));
            }
        }
        //as first and last element were not checked so cheking them and adding if lonely
        if(list.get(0)+1<list.get(1)){
            list2.add(list.get(0));
        }
        if(list.get(list.size()-2)+1<list.get(list.size()-1)){
            list2.add(list.get(list.size()-1));
        }
        
        //now printing resulting list
        for(int i=0;i<list2.size();i++){
            System.out.print(list2.get(i)+" ");
        }

    }
    
    public static void main(String args[]){
        // Lonely Numbers in ArrayList (MEDIUM)
        // You are given an integer arraylist nums. A number x is lonely when it appears only once, and
        // no adjacent numbers (i.e. x + 1 and x - 1) appear in the arraylist.
        // Return all lonely numbers in nums. You may return the answer in any order.
        // Sample Input 1 : nums = [10,6,5,8]
        // Sample Output 1 : [10,8]
        // Explanation :
        // - 10 is a lonely number since it appears exactly once and 9 and 11 does not appear in nums.
        // - 8 is a lonely number since it appears exactly once and 7 and 9 does not appear in nums.
        //- 5 is not a lonely number since 6 appears in nums and vice versa.
        // Hence, the lonely numbers in nums are [10, 8].
        // Note that [8, 10] may also be returned.
        // Sample Input 2 : nums = [1,3,5,3]
        // Sample Output 2 : [1,5]
        // Explanation :
        // - 1 is a lonely number since it appears exactly once and 0 and 2 does not appear in nums.
        // - 5 is a lonely number since it appears exactly once and 4 and 6 does not appear in nums.
        // - 3 is not a lonely number since it appears twice.
        // Hence, the lonely numbers in nums are [1, 5].
        // Note that [5, 1] may also be returned.
        // Constraints :
        // ● 1 <= nums.size() <= 105
        // ● 0 <= nums.get(i) <= 106
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(3);
        lonelyNumbers(list);
   }
}