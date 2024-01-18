public class BackTrackingArrays {
    public static void main(String args[]){
        int arr[] =new int[5];
        changeArr(arr,0,1);
        printArray(arr);
    }

    static void changeArr(int arr[], int i, int val){
        // Base case
        if(i== arr.length){
            printArray(arr);
            return;
        }
        arr[i] = val;   // assigning values
        changeArr(arr, i+1, val+1); // recursion step
        arr[i] = arr[i]-2;  // backtracking step
    }

    static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+"  ");
        }
        System.out.println();
    }
    
}
