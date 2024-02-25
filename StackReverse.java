import java.util.Stack;

public class StackReverse {
    public static void main(String args[]){

        StackReverse s = new StackReverse();

        // In-built stack
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        // Push at the bottom
        s.reverse(stack);

        // print the stack
        printStack(stack);


    }

    public void reverse(Stack<Integer> stack){
        if(stack.empty()){
            return;
        }
        int top = stack.pop();
        reverse(stack);
        bottomPush(stack, top);
    }

    // print function
    public static void printStack(Stack<Integer> stack){
        while (!stack.empty()) {
            System.out.print(stack.pop()+"  ");
        }
        System.out.println();
    }

    // Push at bottom of stack
    public void bottomPush(Stack<Integer> stack, int val){
        if(stack.empty()){
            stack.push(val);
            return;
        }
        int element = stack.pop();
        bottomPush(stack, val);
        stack.push(element);
    }
}
