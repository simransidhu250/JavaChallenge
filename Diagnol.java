public class Diagnol {
    public static void main(String [] args){
        int arr [][] ={{1,2,3}, {4,5,6}, {7,8,9}};
        // diagnolMatrix(arr);
        sumDiagnolMatrix(arr);
    }

    public static void diagnolMatrix(int arr[][]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i][i]+"\t");
        }
    }

    public static void sumDiagnolMatrix(int arr[][]){
        int sum =0;
        for(int i=0; i<arr.length; i++){

            // to find sum of primary diagnol
            sum= sum+arr[i][i];

            if(arr[i][i]!=arr[i][arr.length-1-i]){      //  if the length of square matrix is odd

                // to find the sum of the secondary diagnol
                sum = sum + arr[i][arr.length-1-i];
            }

        }
        System.out.println(sum);
    }
    
}
