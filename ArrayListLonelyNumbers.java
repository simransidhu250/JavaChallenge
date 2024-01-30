// import ArrayList

import java.util.ArrayList;

public class ArrayListLonelyNumbers {
    public static void main(String args[]){

        // Creat a new list

        ArrayList <Integer> list = new ArrayList<>();

        // add elements to the list

        list.add(10);
        list.add(6);
        list.add(5);
        list.add(8);

        // printing ArrayList elements

        System.out.println(list);

        // Brute force approach

        bruteForce(list);

    }


    // Brute Force approach  O(n^2)

    static void bruteForce(ArrayList <Integer> list){

        boolean dec= true;

        for(int i=0; i<list.size(); i++){
            dec = true;
            for(int j=0; j<list.size(); j++){
                if(i==j){
                    continue;
                }

                // Checking if its lonely number

                int curr = list.get(i);
                if(curr == list.get(j) || list.get(j)== curr+1 ||  list.get(j) == curr-1){
                    dec =false;
                }
                
            }

            // Printing if its lonely number

            if(dec== true){
                System.out.println(list.get(i));
            }
        }

    }
}
