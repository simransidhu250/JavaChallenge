public class BackTrackingSudoku {
    public static void main(String args[]){
        int arr[][] = { {0,0,8,0,0,0,0,0,0},
                        {4,9,0,1,5,7,0,0,2},
                        {0,0,3,0,0,4,1,9,0},
                        {1,8,5,0,6,0,0,2,0},
                        {0,0,0,0,2,0,0,6,0},
                        {9,6,0,4,0,5,3,0,0},
                        {0,3,0,0,7,2,0,0,4},
                        {0,4,9,0,3,0,0,5,7},
                        {8,2,7,0,0,9,0,1,3}
                    };
        if(sudoku(arr, 0,0)){
            System.out.println("Solution exists");
            printSudoku(arr);
        }
        else{
            System.out.println("Solution does not exists");
        }
    }

    static void printSudoku(int arr[][]){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }
    }

    static boolean sudoku(int arr[][],int row, int col){
        if(row==arr.length&&col==0){
            return true;
        }
        int nextRow = row, nextCol = col+1;
        if(col+1==arr.length){
            nextRow = row+1;
            nextCol=0;
        }

        // If there is already some number at current place
        if(arr[row][col]!=0){
            return sudoku(arr, nextRow, nextCol);
        }

        // If there is no number at current place
        for(int i=1; i<=9; i++){
            if(isSafe(arr, row, col,i)){
                arr[row][col]=i;
                if(sudoku(arr, nextRow, nextCol)){ //solution exists
                return true;
                }
                arr[row][col]=0;   
            }          
        }
        return false;
        
    
    }

    static boolean isSafe(int arr[][], int row, int col, int n){
        // check horizontal

        for(int i=0; i<arr.length; i++){
            if(arr[row][i]==n){
                return false;
            }
        }

        //  check vertical
        for(int i=0; i<arr.length; i++){
            if(arr[i][col]==n){
                return false;
            }
        }

        // check in its grid
            int startRow = row/3*3;
            int startCol = col/3*3;

            for(int i=startRow; i<startRow+3;i++){
                for(int j=startCol; j<startCol+3; j++){
                    if(arr[i][j]==n){
                        return false;
                    }
                }
            }

        // true if it surpass all above conditions
         return true;
    }
    
}
