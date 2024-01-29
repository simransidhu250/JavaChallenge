// Import Arraylist
import java.util.ArrayList;

public class ArrayListContainerWater {
    public static void main(String args[]){

        // Create the Arrayheights to store heights of the lines

        ArrayList <Integer> heights = new ArrayList<>();

        // add heigths to the Arrayheights

        heights.add(1);
        heights.add(8);
        heights.add(6);
        heights.add(2);
        heights.add(5);
        heights.add(4);
        heights.add(8);
        heights.add(3);
        heights.add(7);

        // Print the Arrayheights

        System.out.println(heights);

        // Stores the maximum water

        int max =  Integer.MIN_VALUE;
        int capacity = 0;
        int height = heights.get(0);
        int width = 0;

        for(int i=0; i<heights.size(); i++){
            for(int j=i+1; j<heights.size(); j++){

                //capacity = height * width
                height = Math.min(heights.get(i), heights.get(j));
                width = j-i;
                capacity = height*width;
                max = Math.max(capacity, max);
            }
        }

        System.out.println("Maximum water contained: "+max);
    }
}
