public class LargestString {
    public static void main(String []args){
        String fruits[] ={"apple", "banana", "mango"};
        String largest = fruits[0];

        // Time complexity is O(xn) where x denotes the number of characters in largest string of array
        // Space complexity is O(1)
        for(int i=0; i<fruits.length; i++){
            if(largest.compareTo(fruits[i])<0){
                largest = fruits[i];
            }
        }

        System.out.println(largest);
    }
    
}
