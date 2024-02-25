import java.util.Stack;

public class StackIntro {
    public static void main(String args[]){

        // In-built stack
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        printStack(stack);
    }

    // print function
    public static void printStack(Stack<Integer> stack){
        while (!stack.empty()) {
            System.out.println(stack.pop());
        }
    }
}
