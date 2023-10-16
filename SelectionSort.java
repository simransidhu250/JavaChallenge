public class SelectionSort {
    public static void main(String [] args){
        int arr[] = {5,4,1,3,2};
        selectionSort(arr);

    }
    public static void selectionSort(int arr[]){
        int minIndex=0, temp =0;

        // Time complexity of Selection sort is O(n^2)
        // Space complexity is O(1)
        for(int i=0; i<arr.length-1; i++){
            minIndex = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[minIndex]>arr[j]){                               // we find the minimum  in the array and replaced the particular index with the smallest while traversing 
                    minIndex = j;
                }
            }
            temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+"\t");
        }
    }


    
}
