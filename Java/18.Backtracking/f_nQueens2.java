public class f_nQueens2{
    public static boolean setQueens(char board[][],int row){
        //base case
        if(row==board.length){
            
            return true;
        }
        //kaam
        for(int j=0;j<board.length;j++){
            if(isSafe(board,row,j)){
                board[row][j]='Q';
                if(setQueens(board,row+1)){
                    return true;
                }
                board[row][j]='x';
            }

        }
        return false;
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
        // In this question we have to check whether there eixist a way to place our queens in n*n matrix.
        //If there exist some ways to place queens then we have to print only one of them.
        int n=4;
        char board[][] = new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='x';
            }
        }
       if (setQueens(board,0)){
         System.out.println("Solution exists for this board");
         printBoard(board);
       }
       else{
         System.out.println("Solution does not exists for this board");

       }
    }
}