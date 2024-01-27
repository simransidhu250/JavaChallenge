import java.util.ArrayList;

public class ArrayListReverse {
    public static void main(String args[]){
        ArrayList <Integer> list = new ArrayList<>();
        // ArrayList <Boolean> list2 = new ArrayList<>();
        // ArrayList <String> list3 = new ArrayList<>();

        // Add Element
        list.add(1);      // O(1)
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // Reverse print
        for(int i=list.size()-1; i>=0; i--){
            System.out.print(list.get(i)+"  ");
        }
    }
}
