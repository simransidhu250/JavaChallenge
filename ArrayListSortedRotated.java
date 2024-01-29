// import ArrayList

import java.util.ArrayList;

public class ArrayListSortedRotated {

    public static void main(String args[]){

        // Create an ArrayList

        ArrayList <Integer> list = new ArrayList<>();

        // add elements to the ArrayList

        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        // Printing the list

        System.out.println(list);

        int target = 16;

        // Brute Force

        bruteForce(list, target);
    }


    // Brute force approach - O(n^2)

    static void bruteForce(ArrayList <Integer> list, int target){


        for(int i=0; i<list.size(); i++){
            for(int j=i+1; j<list.size(); j++){
                if(list.get(i)+list.get(j)== target){
                    System.out.println("Pairs are: "+i+ " and "+j);
                }
            }
        }

    }
}
