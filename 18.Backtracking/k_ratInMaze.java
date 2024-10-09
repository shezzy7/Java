public class k_ratInMaze {

    public static int countWays(int board[][],int row,int col){
        //base case
        if(row==board.length-1 && col==board.length-1){
            return 1;
        }
        if(row==board.length || col==board.length){
            return 0;
        }
        if(board[row][col]==0){
            return 0;
        }
        // kaam
        int way1 = countWays(board,row,col+1);
        int way2 = countWays(board,row+1,col);
        return way1+way2;
    }
    public static void main(String[] args) {
        
        int board[][] = {
            {1,1,0,0},
            {1,1,0,1},
            {1,0,0,0},
            {1,1,1,1}
        };
        System.out.println(countWays(board,0,0));
    }
}
