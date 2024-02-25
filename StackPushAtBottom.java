import java.util.Stack;

public class StackPushAtBottom {
     public static void main(String args[]){

        StackPushAtBottom s = new StackPushAtBottom();

        // In-built stack
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        // Push at the bottom
        s.bottomPush(stack, 4);

        // print the stack
        printStack(stack);


    }

    // print function
    public static void printStack(Stack<Integer> stack){
        while (!stack.empty()) {
            System.out.print(stack.pop()+"  ");
        }
        System.out.println();
    }

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
