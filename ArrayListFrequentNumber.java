// import ArrayList

import java.util.ArrayList;

public class ArrayListFrequentNumber {
    public static void main(String args[]){

        // Create an ArrayList

        ArrayList <Integer> list = new ArrayList<>();


        // Add elements to the ArrayList
        list.add(1);
        list.add(100);
        list.add(200);
        list.add(1);
        list.add(100);

        // print the elements of ArrayList

        System.out.println(list);

        int key = 1;

        frequentNumber(list, key);
    }

    static void frequentNumber(ArrayList <Integer> list, int key){
        int result[] = new int[1001];
        int idx;

        // Checking if previous number was key

        for(int i=1; i<list.size(); i++){
            if(list.get(i-1)==key){
                idx = list.get(i);
                result[idx]++;
            }
        }
        int max = 0;
        int ans = 0;

        // Check the largest number in the result array
        
        for(int j=0; j<result.length; j++){
            if(max<result[j]){
                max = result[j];
                ans = j;
            }
        }

        System.out.println(ans);
    }
}
