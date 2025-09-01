import java.util.*;
public class i_chocola_problem {
    
    public static int cutChocola(Integer vertCost[], Integer horCost[], int m, int n){

        // We are given a bar of chocolate composed of m × n square pieces. One should break the chocolate into single squares. Parts of the chocolate may be broken along the vertical and horizontal lines as indicated by the broken lines in the picture.A single break of a part of the chocolate along a chosen vertical or horizontal line divides that part into two smaller ones. Each break of a part of the chocolate is charged a cost expressed by a positive integer. This cost does not depend on the size of the part that is being broken but only depends on the line the break goes along. Let us denote the costs of breaking along consecutive vertical lines with x1, x2 ... xm-1 and along horizontal lines with y1, y2 ... yn-1.

        // The cost of breaking the whole bar into single squares is the sum of the successive breaks. One should compute the minimal cost of breaking the whole chocolate into single squares.


        // here in our vertCost array we have the costs of breaking along consecutive vertical lines and in our horCost array we have the costs of breaking along consecutive horizontal lines.If we want to break the chocolate through a specific vertical point then it will cost us value present at this index in vertCost array multiply number of horizental pieces it will cut.Similarly if we want to break the chocolate through a specific horizontal point then it will cost us value present at this index in horCost array multiply number of vertical pieces it will cut.
        // So as we cut chocoloate in vertical direction then the number of horizontal pieces will increase and as we cut in horizontal direction then the number of vertical pieces will increase.
        // As we make a cut we know that number of pieces will go up.So if we first cutt the pieces with high values first then the our higher costs are being utilized on small count of pieces so laterly our small cost will be applied to large number of pieces , so this sequence will help us in calculating the minimum cost to break the chocolate.

        // There things that we need to keep in mind
        /*
            i- We can't skip a line from cutting , we have to break each line vertically and horizentally both
            ii - As number of pieces increase our number of cuts increase so if we make more cuts with higher costs first then our lower costs will be applied to large number of pieces so this sequence will help us in calculating the minimum cost to break the chocolate.
            iii- So to follow this sequence we need to sort our arrays , so that we can keep track of sequence of costs
             
         */

        //  so here we will sort our array in descending order so that we can get cuts with higher cost first
         Arrays.sort(vertCost , Collections.reverseOrder());
         Arrays.sort(horCost , Collections.reverseOrder());

        //  Now we will start cutting the chocolate from the highest cost vertical and horizontal lines
        // We will compare from which side to cut(vertical or horizental) on the basis of which cost is higher , then we multiply this cost to number of pieces of opposite side. For example let suppose we find that we need to make a cut horizentaly with some cost 2 then we will multiply this cost to number of vertical pieces and add it to our total cost. Because this cutt will go through each vertical piece present. This same strategy will be applied to vertical cuts.So for this we need to keep track of vertical pieces and horizental pieces for this we are going to use two variables vp and hp , at first as we know there is only one vertical piece and one horizental piece so we will initialize them with 1.
         int vp = 1 , hp = 1;
         int h=0 , v=0; //to keep track of index of vertCost and horCost array
         int totalCost = 0;

         while(h<horCost.length && v<vertCost.length){
            if(horCost[h]>vertCost[v]){
                totalCost+=(horCost[h]*vp);
                h++; 
                hp++; //as we will make cut horizentally then number of horizental pieces will increase by1
            }
            else{
                totalCost+=(vertCost[v]*hp);
                v++;
                vp++; //as we will make cut vertically then number of vertical pieces will increase by 1
            }
         }

        //  then at last we also need to check if any of pieces are remaing from vertial or horizental side then we will complete them

        while(h<horCost.length){  
            totalCost+=horCost[h]*vp;
            vp++;
            h++;  
        }

        while(v<vertCost.length){
            totalCost+=vertCost[v]*hp;
            hp++;
            v++;
        }

        return totalCost;

    }
    public static void main(String[] args) {
        int m=6,n=4;
        Integer vertCost[] = {2,1,3,1,4};
        Integer horCost[] = {4,1,2};

        int totalCost = cutChocola(vertCost, horCost, m, n);
        System.out.println(totalCost);
       
    }
}
