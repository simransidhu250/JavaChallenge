public class BackTrackingRatMaze {
    public static void main(String args[]){
        int maze[][] = { { 1, 0, 0, 0 },{ 1, 1, 0, 1 },{ 0, 1, 1, 0 },{ 1, 1, 1, 1 } };
        int n=maze.length;
        int sol [][] = new int[n][n];
        for(int i=0; i<n;i++){
            for(int j=0; j<n; j++){
                sol[i][j] =0;
            }
        }
        sol[0][0] =1;
        ratMaze(maze,0,0, sol);
    }
    
    static void printSolution(int maze[][]){
        for(int i=0; i<maze.length; i++){
            for(int j=0; j<maze.length; j++){
                System.out.print(maze[i][j]+"  ");
            }
            System.out.println();
        }
        System.out.println("-----------------");
    }

    static void ratMaze(int maze[][], int x, int y, int solution[][]){
        if(x==maze.length-1 && y==maze.length-1){
            printSolution(solution);
            return;  
        }

        // left

        if(isSafe(maze, x, y-1, solution)){
            solution[x][y-1] = 1;
            ratMaze(maze, x, y-1, solution);
            solution[x][y-1] =0;
        }

        // right

        if(isSafe(maze, x, y+1, solution)){
            solution[x][y+1] = 1;
            ratMaze(maze, x, y+1, solution);
            solution[x][y+1] =0;
        }

        // up

        if(isSafe(maze, x-1, y, solution)){
            solution[x-1][y] = 1;
            ratMaze(maze, x-1, y, solution);
            solution[x-1][y] =0;
        }

        // down
        if(isSafe(maze, x+1, y, solution)){
            solution[x+1][y] = 1;
            ratMaze(maze, x+1, y, solution);
            solution[x+1][y] =0;
        }



    }

    static boolean isSafe(int maze[][], int x, int y, int solution[][]){
        // Check if the coordinates are out of bound

        if(x<0 || x>=maze.length ||y<0 || y>=maze.length){
            return false;
        }

        // if the next movement cell contains 0

        if(maze[x][y] == 0 || solution[x][y]==1){
            return false;
        }

        return true;
    }
}
