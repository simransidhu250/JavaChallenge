// import ArrayList

import java.util.ArrayList;

// import Collections

import java.util.Collections;

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

    // Optimized Approach

    static void optimized(ArrayList <Integer> list){
        Collections.sort(list);
        
        for(int i=0; i<list.size(); i++){

            // Checking if element at previous index is equal or -1 or +1 of the current number

            if(i!=0 && list.get(i-1)!=list.get(i) || list.get(i-1)!= list.get(i)-1) {
                continue;
            }

            // Checking if element at next index is equal or -1 or +1 of the current number
            else if(i!=list.size()-1 && list.get(i+1)!=list.get(i) || list.get(i+1)!= list.get(i)+1){
                continue;
            }
            else{
                System.out.print(list.get(i)+"  ");
            }
        }
    }
}
