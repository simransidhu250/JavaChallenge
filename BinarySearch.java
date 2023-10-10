public class BinarySearch {
    public static void main(String [] args){
        int numbers[] = {1,5,9,12,14,18};
        int key = 12;
        int index = binarySearch(numbers, key);
        if(index == -1){
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
            mid = (start+end)/2;
            if(numbers[mid]==key){
            return mid;
             }
            else if(numbers[mid]>key){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }

        return -1;
    }
    
    
}
