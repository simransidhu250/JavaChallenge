public class Largest {
    public static void main(String []args){
        int numbers[] ={1,2,3,6,4,5}; 
        int largest = largest(numbers);
        System.out.println("Largest number is : "+largest); // prints largest returned value from the array;
    }
    public static int largest(int numbers[] ){
        int largest = Integer.MIN_VALUE;    // Assigning smallest integer
        int smallest = Integer.MAX_VALUE;  // Assinging largest integer
        for(int i =0; i<numbers.length; i++){
            if(largest<numbers[i]){
                largest = numbers[i];
            }
            if(smallest>numbers[i]){
                smallest = numbers[i];
            }
        }
        System.out.println("Smallest number is "+ smallest);
        return largest;
    }
    
    
}
