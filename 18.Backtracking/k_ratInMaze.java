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
        //we are given a board of n*n.We have to go from (0,0) to (n-1,n-1).Board is filled by 0's and 1's.We have can only move thorugh one's.Print count of all the possible ways through which we can go to our destination.
        int board[][] = {
            {1,1,1,1},
            {1,1,0,1},
            {1,0,0,1},
            {1,1,1,1}
        };
        System.out.println(countWays(board,0,0));
    }
}
