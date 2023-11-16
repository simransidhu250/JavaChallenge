public class RecursionFirstOccurence {
    public static void main(String args[]){
        int arr[] = {8,3,6,9,5,10,2,5,3};
        int index = firstIndex(arr, 0, 5);
        System.out.println("Key is at index: "+index);
    }
    
    
    static int firstIndex(int arr[], int i, int key){
        if(i==arr.length){      // if the key is not present in array
            return -1;
        }
        if(arr[i]==key){        // if key is found at current index
            return i;
        }
        return firstIndex(arr, i+1, key);
    }
}
