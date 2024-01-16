public class BinarySearchSortedArray {
    public static void main(String args[]){
        int arr[] = {4,5,6,7,0,1,2};
        int tar =0;
        System.out.println(searchArray(arr, 0, arr.length-1, tar));
    }

    static int  searchArray(int arr[], int si, int ei, int target){
        if(si>ei){
            return -1;
        }
        int mid = si+(ei-si)/2;

        // target lying at mid
        if(arr[mid]==target){
            return mid;
        }
        // target lying at L1
        else if(arr[si]<=arr[mid]){
            // left part
            if(arr[si]<=target && target <= arr[mid]){
                return searchArray(arr, si, mid, target);
            }
            // right part
            else{
                return searchArray(arr, mid, ei, target);
            }
        }
        // target lying at L2
        else{
            // left part
            if(target<=arr[si]&&target<=arr[mid]){
                return searchArray(arr, si, mid, target);
            }
            // right part
            else{
                return searchArray(arr, mid, ei, target);
            }
        }
    }
    
}
