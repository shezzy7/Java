import java.util.PriorityQueue;

public class I_weakSoldiers {
    static class Sol implements Comparable<Sol>{
        int soldiers;
        int idx;

        public Sol(int soldiers , int idx){
            this.idx = idx;
            this.soldiers =soldiers;
        }

        @Override
        public int compareTo(Sol r2){
            if(r2.soldiers==this.soldiers){
                return this.idx-r2.idx;
            }else{
                return this.soldiers-r2.soldiers;
            }
        }
    }

    public static void main(String args[]){
        int army[][] = {
            {1,0,0,0},
            {1,1,1,1},
            {1,0,0,0},
            {1,1,0,0}
        };
        int k=2;
        /*  Problem:- We are given a m*n binary matrix of 1's(soldiers) and 0's (civillians).The soldiers are positioned in front of civillians.That is  , all the 1's will appear to the left of all 0's in each row.A row i is weaker then row j if one of the following is true:
                i- The number of soldiers in row i is less then number of soldiers in row j.
                ii-Both rows have same number of soldiers and i<j.
        Find the k weakest rows.
        */

        // Approach :- We will use priority queue for solving this problem.And in this priority queue add count of soldiers in each and index of each such that when number of soldiers in a row are different from all the other rows then we will add it according to number of soldiers in it and in other.And if number of soldiers in a row are equall to number of soldiers in another row then we will compare their indexes whose index is less will come first in pq.For apply this apprach we will use override method.

        PriorityQueue<Sol> pq= new PriorityQueue<>();
        for(int i=0;i<army.length;i++){
            int count = 0;
            for(int j=0;j<army[i].length;j++){
                // in this loop we will count number of soldiers in each row
                count+= army[i][j]==1?1:0;

            }
            // now we will add this row in our pq
            pq.add(new Sol(count,i));
        }

        // now print first k row
        for(int i=0;i<k;i++){
            System.out.println("R"+pq.remove().idx);
        }

    }
}
