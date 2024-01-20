public class BackTrackingNQueens{
    public static void main(String args[]){
        int n=2;
        char board[][] =new char[n][n];
        // Initializing
        for(int i=0; i<board.length; i++){
           for(int j=0; j<board.length; j++ ){
                board[i][j] = 'X';
           }
         }
        nQueens(board,0);

    }

    public static void printBoard(char board[][]){
        System.out.println("---------------Chess Board----------------");
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++ ){
                 System.out.print(board[i][j]+"  ");
            }
            System.out.println();
          }
    }

    public static boolean isSafe(char board[][],int row, int col){
        // vertical up
        for(int i=row-1; i>=0; i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }

        // look left diagnol
        for(int i=row-1, j=col-1;i>=0 && j>=0;i--, j--){
                if(board[i][j]=='Q'){
                    return false;
                }
        }

        // look right diagnol
        for(int i=row-1, j=col+1;i>=0 && j<board.length;i--, j++){
                if(board[i][j]=='Q'){
                    return false;
                }
        }  
        return true;
    }

    public static void nQueens(char board[][], int row){
        if(row==board.length){
            printBoard(board);
            return;
        }
         for(int j=0; j<board.length; j++){
            if(isSafe(board, row, j)){
                board[row][j]='Q';
                nQueens(board, row+1);
                board[row][j] ='x';
            }
        }
    }

   
}