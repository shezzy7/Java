import java.util.*;
public class trapingWater {
    public static int trapedWater(int height[]) {
        int n = height.length;
//first of all we have to find the long  left boundry of each element
        //left Boundry
        int leftBoundary[]=new int[n];
        leftBoundary[0]=height[0];//as the left boundry of first elemnt in noen so we take itselgf as its long left boundry
       
        for(int i=1;i<n;i++){
            leftBoundary[i]=Math.max(leftBoundary[i-1],height[i]);//the left boundary for an element will be a boundary 
                                                                  //whic is maximum in size then this element otherwise
                                                                  //this elemnt itelsf will be its left boundary
        }
//then we have to find long right boundry of each elemnt 
        //rightBoundry
        int rightBoundary[]=new int [n];
        rightBoundary[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){//the right boundary for an element will be a boundary 
                               //which is maximum in size then this element otherwise
                              //this elemnt itelsf will be its right boundary
            rightBoundary[i]=Math.max(rightBoundary[i+1],height[i]);
        }

        //loop
        int waterTraped = 0;
        for(int i=0;i<n;i++){
            int waterLevel = Math.min(leftBoundary[i],rightBoundary[i])-height[i];//we will find whether elements left boundary is minimm in size or elements right boundary is minimum.This will be equall to height of water for this element

            waterTraped+=waterLevel;

        }
        return waterTraped;

    }
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        int height[]=new int[n];
        System.out.print("Enter elements of array : ");
        for(int i=0;i<n;i++){
            System.out.print("Enter element "+(i+1)+" : ");
            height[i]=sc.nextInt();
        }
        System.out.println("Trapped water = "+trapedWater(height));
    }
}   
