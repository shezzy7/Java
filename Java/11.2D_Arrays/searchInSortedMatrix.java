
public class searchInSortedMatrix{

    public static void main(String args[]){

        int arr[][] = {
            {10 , 20 , 30 , 40} , 
            {15 , 25 , 35 , 45} ,
            {27 , 29 , 37 , 48},
            {32 ,33 , 39 , 50}
        };

        int curr  = arr[0][arr[0].length-1];
        int row = 0;
        int col = arr[0].length-1;
        int key = 33;
        while(col>=0 && row<arr.length){
            if(key==curr){
                System.out.println("Target found at index"+row+","+col);
                break;
            }
            else if(key>curr){
                row+=1;
            }else{
                col-=1;
            }
            curr = arr[row][col];
        }

    }
}