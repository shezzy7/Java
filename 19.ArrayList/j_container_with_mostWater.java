import java.util.*;
public class j_container_with_mostWater{
    public static int water(ArrayList<Integer> ht){
        //2 pointer approach(optimized) -> O(n)
        int lp = 0,rp = ht.size()-1;
        int maxWater = 0;
        while(lp<rp){
            int curHeight = Math.min(ht.get(lp),ht.get(rp));
            int width = rp-lp;
            int currWater = width*curHeight;
            maxWater = Math.max(maxWater,currWater);
            if(ht.get(lp)<ht.get(rp)){
                lp++;
            }
            else{
                rp--;
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

