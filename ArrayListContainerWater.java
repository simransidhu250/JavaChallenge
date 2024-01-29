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


        // Brute Force Approach

        // bruteForce(heights);

        // Two Pointer Approach
        optimized(heights);

        
    }


    // Brute force approach - O(n^2)

    public static void bruteForce(ArrayList <Integer> heights){

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

        System.out.println("Maximum water contained is : "+max);
    }

    // Optimized approach - Two Pointer Approach - O(n)

    public static void optimized(ArrayList <Integer> heights){
        int frontPt = 0;
        int backPt = heights.size()-1;
        int max = Integer.MIN_VALUE;
        int capacity = 0;
        int height = heights.get(0);
        int width = 0;

        while(frontPt<backPt){

            // Calculate area
            height = Math.min(heights.get(frontPt),heights.get(backPt));
            width = backPt - frontPt;
            capacity = height*width;
            max = Math.max(capacity,max);

            //Update pointers

            if(heights.get(frontPt)<heights.get(backPt)){        
                frontPt++;
            }
            else{
                backPt--;
            }
        }
        System.out.println("Maximum water contained is: "+max);
    }
}
