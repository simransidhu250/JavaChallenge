public class BinarySearch {
    public static void main(String [] args){
        int numbers[] = {1,5,9,12,14,18};   // Binary prequiste : Array should be sorted
        int key = 12;


        // Binary Search always performs better than Linear Search

        int index = binarySearch(numbers, key);             // Time Complexity is O(log n base 2)  
        if(index == -1){                                    // Space complexity O(1)
            System.out.println("Key not found");
        }
        else{
            System.out.println(index);
        }
    }

    public static int binarySearch(int numbers[],int key){
        int mid, start, end;
        start = 0;
        end = numbers.length-1;
        
        while(start<=end){
            mid = (start+end)/2;    //diving the array into to half and checking if middle element is the key
            if(numbers[mid]==key){      
            return mid;
             }
            else if(numbers[mid]>key){  // if the key is less than mid it means the element is on left of the middle element
                end = mid-1;
            }
            else{                   // if the key is greater than mid it means the element is on right of the middle element
                start = mid+1;
            }
        }

        return -1;
    }
    
    
}
