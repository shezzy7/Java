import java.util.*;
public class L_maxRectAreaHisto{
    public static void nextSmallerRight(int histo[],int nsr[]){
        Stack<Integer> s = new Stack<>();
        for(int i=histo.length-1;i>=0;i--){
            while(!s.isEmpty() && histo[s.peek()]>=histo[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i] = histo.length;
            }
            else{
                nsr[i] = s.peek();
            }
            s.push(i);
        }
    }
    public static void nextSmallerLeft(int histo[],int nsl[]){
        Stack<Integer> s = new Stack<>();
        for(int i=0;i<histo.length;i++){
            while(!s.isEmpty() && histo[s.peek()]>=histo[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i] = -1;
            }
            else{
                nsl[i]=s.peek();
            }
            s.push(i);
        }
    }
    public static int findMaxArea(int histo[]){
        //Given an array of heights integers representing the histogram's bar height where the width of each bar is 1, return the area of the largest rectangle in the histogram

        int nsl[] = new int[histo.length];
        int nsr[] = new int[histo.length];

        nextSmallerRight(histo,nsr);
        nextSmallerLeft(histo,nsl);

        int maxArea = Integer.MIN_VALUE;
        //area = height*width
        //width = nsr[i]-nsl[i]-1
        for(int i=0;i<histo.length;i++){
            int height = histo[i];
            int width = nsr[i]-nsl[i]-1;
            int currArea = height*width;
            maxArea = Math.max(maxArea,currArea);
        }
        return maxArea;
    }
    public static void main(String args[]){
        //Given question is also asked in Miscrosoft,paytm and many others
        int histo[] = {7,1,4,3,6,7};
        // int maxArea = findMaxArea(histo);
        // System.out.println("Maximum rectangle's area of our histogram is : "+maxArea);
        //overall time coplexity for this code is O(n)


        // int histo[] = {7,1,4,3,6,7};
        int msl[]=new int[histo.length];
        for(int i=histo.length-1;i>=0;i--){
            int j=i-1; //j=-1 , i=0  [-1-1,1,1 ,3, 4]
            for(;j>=0;j--){
                if(histo[j]<histo[i]){
                    break;
                }
            }
            msl[i]=j;
        }
        for(int i=0;i<msl.length;i++){
            System.out.print(msl[i]+" ");
        }
        int smr[] = new int[histo.length];
        for(int i=0;i<histo.length;i++){
            int j=i+1; //{7,1,4,3,6,7}
            for(;j<histo.length;j++){
                if(histo[i]>histo[j]){
                    break;
                }
            }
            smr[i]=j;
        }
        System.out.println();
        for(int i=0;i<smr.length;i++){
            System.out.print(smr[i]+" ");
        }

        
    }
}



