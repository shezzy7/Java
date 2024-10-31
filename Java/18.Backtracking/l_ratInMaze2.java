public class l_ratInMaze2 {
    public static void printSol(int board[][]){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.err.print(board[i][j]+" ");
            }
            System.err.println();
        }
    }
   
    public static int count=0;
    public static boolean isSafe(int board[][],int row,int col){
        return row>=0 && row<board.length && col>=0 && col<board.length && board[row][col]==1;
    }
    public static void boardUtility(int board[][],int row,int col,int sol[][]){
        if(row==board.length-1 && col==board.length-1 &&board[row][col]==1){//*
            sol[row][col]=1;
            count++;
            System.err.println("Solution "+count);
            printSol(sol);
            sol[row][col]=0;
            return;  
        }
        if(isSafe(board,row,col)){
            sol[row][col]=1;
            boardUtility(board, row+1, col, sol);
            boardUtility(board, row, col+1, sol);
            sol[row][col]=0;
            
        }   
    }
    public static void main(String[] args) {
        // //we are given a board of n*n.We have to go from (0,0) to (n-1,n-1).Board is filled by 0's and 1's.We have can only move thorugh one's.Print all the possible ways through which we can go to our destination.
        // Note : We have to print all the ways not count.
        int board[][] = {
            {1,0,1,1},
            {1,1,1,1},
            {1,0,0,1},
            {1,1,1,1}  
        };
        int n=board.length;
        int sol[][] = new int[n][n];
        boardUtility(board,0,0,sol);
        System.out.println(count==0?"No solution exists":"");
        printSol(sol);
    }
}
