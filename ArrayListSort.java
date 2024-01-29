import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSort {
   public static void main(String args[]) {
        ArrayList <Integer> list = new ArrayList<>();

        // Adding elements to the ArrayList

        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);

        // List before sorting

        System.out.println(list);

        // Sorting the ArrayList in Ascending order

        // Collections.sort(list);

        // Sorting the ArrayLIst in Descending order

        Collections.sort(list, Collections.reverseOrder());

        // Printing list after sort

        System.out.println(list);


   }
}
