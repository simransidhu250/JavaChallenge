public class Diagnol {
    public static void main(String [] args){
        int arr [][] ={{1,2,3,4}, {5,6,7,8}, {9,10,11,12},{13,14,15,16}};
        diagnolMatrix(arr);
    }

    public static void diagnolMatrix(int arr[][]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i][i]+"\t");
        }
    }
    
}
