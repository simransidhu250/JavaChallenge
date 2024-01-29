// Import ArrayList
import java.util.ArrayList;

public class ArrayListMultiDimensionalArrayList {
    public static void main(String args[]){
        
        // Creating 2D ArrayList

        ArrayList <ArrayList<Integer>> mainList = new ArrayList<>();

        // creating arrayList to add to main list

        ArrayList <Integer> list1 = new ArrayList<>();

        // add elements to the list

        list1.add(1);
        list1.add(2);

        // Adding the list to the mainList

        mainList.add(list1);

        // creating other ArrayList to add to the main list

        ArrayList <Integer> list2 = new ArrayList<>();

        list2.add(3);
        list2.add(4);


        // Adding the list to the main list
        mainList.add(list2);

        // Printing the main list

        System.out.println(mainList);

        // Printing the main list
        for(int i=0; i<mainList.size(); i++){
            ArrayList <Integer> currList = mainList.get(i);
            for(int j=0; j<currList.size(); j++){
                System.out.print(currList.get(j)+" ");
            }
            System.out.println();
        }

    }
}
