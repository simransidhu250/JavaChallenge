public class RecursionLastOccurence {
    public static void main(String args []){
        int arr[] = {8,3,6,9,5,10,2,5,3};
        int index = lastOccurence(arr, 0, 5);
        System.out.println("Key is at index: "+index);
    }
    
    static int lastOccurence(int arr[], int i, int key){
        if(i == arr.length){
            return -1;
        }

        // Time Complexity of O(n)
        // Space complexity is space occupied by function calls O(n)

        int isFound  = lastOccurence(arr, i+1, key);
        if(isFound == -1 && arr[i] == key){     // checking that the whole array has been traversed and the key is found at some position
            return i;
        }               

        return isFound;
        
    }
}
