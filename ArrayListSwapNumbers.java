import java.util.ArrayList;

public class ArrayListSwapNumbers {
    public static void main(String args[]){
        int idx1 =1;
        int idx2 = 3;
        ArrayList <Integer> list = new ArrayList<>();

        // Adding elements to ArrayList
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);;


        // List before swapping
        System.out.println(list);

        // swap
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);

        // List after swapping
        System.out.println(list);

    }
}
