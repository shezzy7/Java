import java.util.PriorityQueue;

public class H_connectRopes {
    
    public static int calCost(int ropes[], int n){
        //We are given n ropes of different lengths ,the task is to connect these ropes into one rope with minimum cost.we can connect 2 ropes at a time and cost to connect them is equall to sum of length of both these ropes.
         
        // Approach --If we get two smallest ropes and connect them and then after connecting add the resultant rope in the list of ropes.After this again get the two ropes with smallest length and add resultant rope in list ropes.And go on doing this until there remain only single rope in the list which will e resultant rope of all the given ropes.
        //For getting smaller rope each time we will use a priority queue.As its first two elements will be smaller of all  the elements.
        PriorityQueue<Integer> pq= new PriorityQueue<>();
        for(int i=0;i<n;i++){
            pq.add(ropes[i]);
        }
        //Now we will traverse over pq and will pick top two elements as pq by default is a min-heap with smallest elments at top add them and after adding remove them from the pq and add the result rope in pq.Loop the process untill pq contains only single item
        int tCost =0;
        while(pq.size()>1){
            int temp = pq.remove() + pq.remove();
            tCost+=temp;
            pq.add(temp); 
        }
        return tCost;
        

    }
    public static void main(String args[]){
        int ropes [] = {4,2,3,6};
        int n = ropes.length;
        
        
        int cost = calCost(ropes , n);
        System.out.println("Minimum Cost to connect thes ropes is : "+cost);
    }
}
