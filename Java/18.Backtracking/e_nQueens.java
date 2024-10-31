public class e_nQueens{
    public static void setQueens(char board[][],int row){
        //base case
        if(row==board.length){
            printBoard(board);
            return;
        }
        //kaam
        for(int j=0;j<board.length;j++){
            if(isSafe(board,row,j)){
                board[row][j]='Q';
                setQueens(board,row+1);//recursion step
                board[row][j]='x';//backtracking step
            }

        }
    }
    //isSafe to set a queen here 
    public static boolean isSafe(char board[][],int row,int col){
        //rigth up
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }

        //diag left-up
        for(int i=row-1,j=col-1;i>=0&&j>=0;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }

        //diag right-up
        for(int i=row-1,j=col+1;i>=0&&j<board.length;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;

    }
    public static void printBoard(char board[][]){
        System.out.println("-----Chess board----");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
             System.out.println();
        }
        System.out.println();
    }
    public static void main(String args[]){
        int n=4;
        char board[][] = new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='x';
            }
        }
        setQueens(board,0);
    }
}