import java.util.*;
public class i_container_with_mostWater{
    public static int water(ArrayList<Integer> ht){
        //Brute force approach -> O(n^2)
        int maxWater = 0;
        for(int i=0;i<ht.size()-1;i++){
            for(int j=i+1;j<ht.size();j++){
                int curHeight = Math.min(ht.get(i),ht.get(j));
                int width = j-i;
                int currWater = width*curHeight;
                maxWater = Math.max(maxWater,currWater);
            }
        }
        return maxWater;
    }
    public static void main(String args[]){
        //Given n lines on X-axis,use 2 lines to form a container such that it holds maximum water
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        System.out.print(water(height));
    }
}

