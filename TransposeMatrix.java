public class TransposeMatrix {
    public static void main(String []args){
        int arr[][] ={{4,3,2},{7,1,5}};
        System.out.println("Original Matrix");
        printMatrix(arr);
        int transpose[][] = Transpose(arr);     // new matrix return in transpose array
        System.out.println("Transpose of Matrix");
        printMatrix(transpose);
    }

    public static int[][] Transpose(int arr[][]){
        int cols = arr[0].length;
        int rows  = arr.length;
        int transpose[][] = new int[cols][rows];
        for(int i=0; i<cols; i++){              // Time complexity: O(nm) where n and m are number of rows and columns in array
            for(int j=0; j<rows; j++){          // Space complexity is O(1)
                transpose[i][j] = arr[j][i];    // Changing rows to columns and colummns to rows in new matrix
            }
        }
        return transpose;
    }

        // function to print matrix
    public static void printMatrix(int arr[][]){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                System.out.print(arr[i][j]+"\t");       
            }
            System.out.println();
        }

    }
    
}
