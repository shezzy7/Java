import java.util.ArrayList;
public class n_monotonic{
    public static boolean isMonotonic(ArrayList<Integer> list){
        boolean inc = false, dec = false;
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i)==list.get(i+1)){
                continue;
            }
            if(list.get(i)<=list.get(i+1)){
                if(dec){
                    return false;
                }
                inc = true;
                continue;
            }
            else(list.get(i)>=list.get(i+1)){
                if(inc){
                    return false;
                }
                dec=true;
                continue;
            }
        }
        return true;

        //simple logic
        // boolean inc = true,dec=true;
        // for(int i=0;i<list.size()-1;i++){
        //     if(list.get(i)>list.get(i+1)){
        //         inc= false;
        //     }
        //     if(list.get(i)<list.get(i+1)){
        //         dec = false;
        //     }
        // }
        // return dec||inc;
    }

    public static void main(String args[]){
        //An Arraylist is monotonic if it is either monotone increasing or monotone decreasing.
        //An Arraylist nums is monotone increasing if for all i <= j, nums.get(i) <= nums.get(j). An
        //Arraylist nums is monotone decreasing if for all i <= j, nums.get(i) >= nums.get(j).
        //Given an integer ArrayList nums, return true if the given list is monotonic, or false otherwise.
        //Sample Input 1 : nums = [1,2,2,3]
        //Sample Output 1 : true
        //Sample Input 2 : nums = [6,5,4,4]
        //Sample Output 2 : true
        //Sample Input 3 : nums = [1,3,2]
        //Sample Output 3 : false

        ArrayList <Integer> list = new ArrayList<>();
        list.add(5);
        list.add(5);
        list.add(4);
        list.add(4);
        System.out.println(isMonotonic(list));
    }
}