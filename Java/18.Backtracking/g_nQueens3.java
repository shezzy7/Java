import java.util.*;
public class g_nQueens3{
    public static boolean isWay(char board[][],int row){
        // base case
        if(row==board.length){//if we queens in all the rows then we will return true from here.
            return true;
        }

        // kaam
        // we are given row number and we traverse over all the colomns of this row toc check whether this column is find for setting queen
        for(int col=0;col<board.length;col++){
            // placing queen if this column is safe
            if(isSafe(board,row,col)){
                board[row][col]='Q';
                // once a queen has been setted in current row then we have to check for next row
                if(isWay(board,row+1)){//once true hase been returned then we don;t need to look for other ways we have to return from here.
                    return true;
                }
                board[row][col]='.';//if all the rows has been traversed and there comes a row where we cannot place our queen then it means that there is some wrong plaicng of queen at this row and we will place our queen at noxt column.
            }
        }
        return false;
    }
    // is safe
    public static boolean isSafe(char board[][],int row,int col){
        //  upward
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        // diag left
        for(int i=row-1,j=col-1;i>=0&&j>=0;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        // diag right
        for(int i=row-1,j=col+1;i>=0&&j<board.length;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        // We are given a chess board of n*n.We have to tell that whether there exist any way to place a queen at each row of this chess board,in such a way that any queen cannot attack other queen.
        //Return true if exists else false.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        char board[][] = new char[n][n];
        // init board by dots
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
        }
        boolean res=isWay(board,0);
        System.out.println(res);
    }
}