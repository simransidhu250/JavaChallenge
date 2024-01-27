import java.util.ArrayList;

public class ArrayListIntro {
    public static void main(String args[]){

        // Java Collection Framework
        ArrayList <Integer> list = new ArrayList<>();
        // ArrayList <Boolean> list2 = new ArrayList<>();
        // ArrayList <String> list3 = new ArrayList<>();

        // Add Element
        list.add(1);      // O(1)
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        list.add(1,10);       // O(n)
        System.out.println(list);


        // // Get Operation -O(1)
        // int element  = list.get(2);

        // System.out.println(element);


        // //Remove Element - O(n)
        // list.remove(2);
        // System.out.println(list);

        // Set - O(n)
        // list.set(2,10);
        // System.out.println(list);

        // // Contains - O(n)
        // System.out.println(list.contains(11));
        // System.out.println(list.contains(4));

        // Print elements in ArrayList
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i)+"  ");
        }

    }
}
