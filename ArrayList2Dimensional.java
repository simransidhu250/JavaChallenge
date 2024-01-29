
// import ArrayList

import java.util.ArrayList;

public class ArrayList2Dimensional {
    public static void main(String args[]){

        // Create a main list which comprises of ArrayLists

        ArrayList <ArrayList<Integer>> mainList = new ArrayList<>();

        // Creating sub lists to add to the main list

        ArrayList <Integer> list1 = new ArrayList<>();
        ArrayList <Integer> list2 = new ArrayList<>();
        ArrayList <Integer> list3 = new ArrayList<>();

        // Add elements the lists

        for (int i=1; i<=5; i++){
            list1.add(i);
            list2.add(i*2);
            list3.add(i*3);
        }

        // Add the sublist to the main list

        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);

        // Printing main List

        for(int i=0; i<mainList.size(); i++){
            ArrayList <Integer> currList = mainList.get(i);
            System.out.print("List "+(i+1)+" : ");
            for(int j=0; j<currList.size(); j++){
                System.out.print(currList.get(j)+"  ");
            }
            System.out.println();
        }


    }
}
