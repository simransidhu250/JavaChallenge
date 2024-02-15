// import linked list
import java.util.LinkedList;

public class LinkListInbuilt {
    public static void main(String args[]){

        // Using Linked List from Java Collection Framework

        // Create a Linked List
        LinkedList<Integer> ll = new LinkedList<>();

        // Add elements to Link List
        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(0);

        // print the list
        System.out.println(ll);

        // remove
        ll.removeFirst();
        ll.removeLast();

        // print the list
        System.out.println(ll);


    }

    
}
