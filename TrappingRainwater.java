public class TrappingRainwater {
    public static void main(String [] args){
        int arr[] = {3,2,0,5,3,2,6};
        int totalWater = WaterTrapped(arr);
        System.out.println("Total amount of trapped water is: "+totalWater);    

    }

    public static int WaterTrapped(int bars[]){
        int leftMax=Integer.MIN_VALUE;
        int rightMax =Integer.MIN_VALUE;
        int waterLevel=0;
        int height, sum = 0;
        int leftMaxArray[] = new int[bars.length];      // new array to store the max of left side elements for each element
        int rightMaxArray[] = new int[bars.length];     // new array to store the max of right side elements for each element
        if(bars.length<2){
            return 0;
        }
        // Time complexity is 3n which is O(n)
        // Space complexity is 2n which is O(n)

        for(int i=0; i<bars.length; i++){
            if(bars[i]>leftMax){
                leftMax = bars[i];
            }
            leftMaxArray[i] = leftMax;      // Storing max in leftMaxArray after comparison
            // LeftMaxArray[] = {3, 3, 3, 5, 5, 5, 6}
        }
        for(int i=bars.length-1; i>=0; i--){
            if(bars[i]>rightMax){
                rightMax = bars[i];
            }
            rightMaxArray[i] = rightMax;     // Storing max in rightMaxArray after comparison
        }
            //  rightMaxArray[] = {6, 6, 6, 6, 6, 6, 6}


        for(int i=0; i<bars.length; i++){
            waterLevel = Integer.min(leftMaxArray[i], rightMaxArray[i]);  // Comparing the maximum to identify what is the lowest maximum that will decide the water level
            height = waterLevel -bars[i];       // Height of water stored above each bar
            sum = sum+height;       // Taking out the sum of all the units of water that are stored above the bars
        }

        return sum;  //  returns total amcount of Trapped Water  
    }
    
}
