public class SpiralMatrix {
    public static void main(String []args){
        int arr[][] = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}};
        spiralMatrix(arr);
    }

    public static void spiralMatrix(int arr[][]){
        int start_row=0, start_col = 0, end_row =arr.length, end_col =arr.length ;
        while(start_row !=end_row && start_col !=end_col){
            for(int i=start_col; i<end_col; i++){
                System.out.print(arr[start_row][i]+ "\t");      // for printing the top row 
            }

            start_row++;

            for(int i=start_row; i<end_row; i++){               // for printing right column
                System.out.print(arr[i][end_col-1]+ "\t");        
            }

            end_col--;

            for(int i=end_col-1; i>=start_col; i--){            // for printing bottom row
                System.out.print(arr[end_row-1][i]+ "\t");  
            }

            end_row --;

            for(int i=end_row-1; i>=start_row;i--){             // for printing the left column
                System.out.print(arr[i][start_col]+ "\t");
            }
            start_col++;



        }
    }
    
}
