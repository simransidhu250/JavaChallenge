public class RecursionAllOccurences {
    public static void main(String args[]){
        int arr[] = {4,35,2,9,7,2,4,2,2,6,2};
        allOccurences(arr, 0, 2);
    }

    public static void allOccurences(int arr[], int i, int key){
        // Base Case
        if(i == arr.length){
            return;
        }
        // Comparing if the number at given position is equal to key
        if(arr[i]==key){
            System.out.println(i);
        }

        allOccurences(arr, i+1, key);

    }
}
