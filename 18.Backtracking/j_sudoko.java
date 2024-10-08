public class j_sudoko {
    public static boolean sudokoSolver(int sudoko[][],int row,int col){
        // base case
        if(row==9){
            return true;
        }
        //determine next box to be checked
        int nextRow = row,nextCol=col+1;//as our column will always be increased each time
        if(col+1==9){//if we are at last column then it means that we have to shift on another row
            nextRow=row+1;
            nextCol=0;
        }
        // if current box is already filled then we don't need to check it
        if(sudoko[row][col]!=0){
            return sudokoSolver(sudoko,nextRow,nextCol);
        }
        //kaam
        for(int digit=1;digit<=9;digit++){
            if(isSafe(sudoko,row,col,digit)){
                sudoko[row][col]=digit;
                if(sudokoSolver(sudoko, nextRow, nextCol)){
                    return true;
                }
                sudoko[row][col]=0;
            }
        }
        //if our loop ends and we cannot solve our sudoko completely then our loop will be ended and we will return false from here.
        return false;
    }
    //is Safe
    public static boolean isSafe(int sudoko[][],int row,int col,int digit){
        //check colomns
        for(int i=0;i<9;i++){
            if(sudoko[i][col]==digit){
                return false;
            }
        }

        //check row
        for(int i=0;i<9;i++){
            if(sudoko[row][i]==digit){
                return false;
            }
        }

        //check complete grid
        int startRow = (row/3)*3;
        int startCol = (col/3)*3;
        for(int i=startRow;i<startRow+3;i++){
            for(int j=startCol;j<startCol+3;j++){
                if(sudoko[i][j]==digit){
                    return false;
                }
            }
        }
        return true;
    }

    // printSudoko
    public static void printSudoko(int sudoko[][]){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                System.out.print(sudoko[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int sudoko[][]={
            {0,0,8,0,0,0,0,0,0},
            {4,9,0,1,5,7,0,0,2},
            {0,0,3,0,0,4,1,9,0},
            {1,8,5,0,6,0,0,2,0},
            {0,0,0,0,2,0,0,6,0},
            {9,6,0,4,0,5,3,0,0},
            {0,3,0,0,7,2,0,0,4},
            {0,4,9,0,3,0,0,5,7},
            {8,2,7,0,0,9,0,1,3}   
        };

        boolean isWay = sudokoSolver(sudoko, 0, 0);
        if(isWay){
            System.out.println("Solution exists for this sudoko");
            printSudoko(sudoko);
        }
        else{
            System.out.println("Solution does not exists for this sudoko");
            
        }
    }
}
