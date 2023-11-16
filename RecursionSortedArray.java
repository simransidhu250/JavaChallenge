class RecursionSortedArray{
    public static void main(String args []){
        int arr[] = {1,2,9,4,5};
        System.out.println(isSorted(arr, 0));
    }

    public static boolean isSorted(int arr[], int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){        // is current less than next element
            return false;
        }
        return isSorted(arr, i+1);
    }
}