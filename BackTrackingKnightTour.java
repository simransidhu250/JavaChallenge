public class BackTrackingKnightTour {
    public static void main(String args[]){
        int n = 5;
        int chessBoard[][] = new int[n][n];

        // Initializing matrix

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                chessBoard[i][j] = -1;
            }
        }

        // assigning first step the value

            chessBoard[0][0] = 0;
            System.out.println("Original ChessBoard");
            printSteps(chessBoard, n);
            System.out.println("----------------------------");

            int count=1;
            tourSteps(chessBoard, 0, 0,count, n);

     }
    
    public static void tourSteps(int chessBoard[][], int x, int y, int count , int n){

        int DirX[] = {-2, -2, 2, 2, -1, 1, -1,1};
        int DirY[] = {-1, 1, -1, 1, -2, -2, 2, 2};

        // Base condition if all the cells are traversed
        if(count==n*n){
            printSteps(chessBoard, n);
            System.out.println("---------------------------");
            return;
        }

        for(int i=0; i<DirX.length; i++){
                if(isSafe(chessBoard, x+DirX[i], y+DirY[i], n)){        
                    int newX = x+DirX[i];
                    int newY = y+DirY[i];
                    chessBoard[x][y]=count;
                    // System.out.println(" x: "+x+ " y: "+y+" count: "+count);
                    tourSteps(chessBoard, newX, newY,count+1, n);       
                }
        }

        // right down

        chessBoard[x][y] = -1;

    }

    static boolean isSafe(int[][] Board,int i, int j, int n) {
        return (i >= 0 && j >= 0 && i < n && j < n && Board[i][j] == -1);
    }

    public static void printSteps(int chessBoard[][], int n){

        // printing the chessboard

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(chessBoard[i][j]+"  ");
            }
            System.out.println();
        }
    }
}


// class BackTrackingKnightTour {
 

//     static int DirX[] = {-2, -2, 2, 2, -1, 1, -1,1};
//     static int DirY[] = {-1, 1, -1, 1, -2, -2, 2, 2};
 

//     static boolean isSafe(int i, int j, int n, int[][] Board) {
//         return (i >= 0 && j >= 0 && i < n && j < n && Board[i][j] == 0);
//     }
 
//     static boolean isPossible = false;
 

//     static void knightTour(int[][] ChessBoard, int N, int x, int y, int count)
//     {
//         ChessBoard[x][y] = count;
//         if (count == N * N) {
//             printSteps(ChessBoard,N);
 
//             ChessBoard[x][y] = 0;
//             return;
//         }

//         for (int i = 0; i < 8; i++) {

//             int newX = x + DirX[i];
//             int newY = y + DirY[i];

//             if (isSafe(newX, newY, N, ChessBoard)) {
//                 knightTour(ChessBoard, N, newX, newY,count+ 1);
//             }
//         }
//         ChessBoard[x][y] = 0;
//     }
 
//     // Driver Code
//     public static void main(String args[]) {
//         int n=5;
//         int[][] ChessBoard = new int[n][n];

//         knightTour(ChessBoard, n, 0, 0, 1);
//     }
//     public static void printSteps(int chessBoard[][], int n){

//         // printing the chessboard

//         for(int i=0; i<n; i++){
//             for(int j=0; j<n; j++){
//                 System.out.print(chessBoard[i][j]+"  ");
//             }
//             System.out.println();
//         }
//         System.out.println("--------------------------");
//     }
// }
 

