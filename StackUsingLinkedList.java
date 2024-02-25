import java.util.LinkedList;
public class StackUsingLinkedList {

    public static LinkedList<Integer> ll = new LinkedList<>();
    public static void main(String args[]){

        // Creat an instance of the class
        StackUsingLinkedList stack = new StackUsingLinkedList();

        // Add elements the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        // print stack
        System.out.println(ll);

        // Remove element
        stack.pop();

         // print stack
         System.out.println(ll);

         // Peek
         System.out.println(stack.top());

    }

    // Push operation
    public void push(int val){
        ll.addFirst(val);
    }

    // Pop operation
    public int top(){
        if(ll==null){ 
            return -1;
        }
        return ll.getFirst();
    }

    // Peek Operation
    public int pop(){
        if(ll==null){
            return -1;
        }
        int element  = ll.getFirst();
        ll.poll();
        return element;

    }

}
