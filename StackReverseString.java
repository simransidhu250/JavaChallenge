import java.util.Stack;

public class StackReverseString {
    public static void main(String args[]){
        StackReverseString s = new StackReverseString();

        // In-built stack
        Stack<Character> stack = new Stack<>();

        String str = "abc";

        s.reverseString(stack, str);

        printStack(stack);
    }

    // print function
    public static void printStack(Stack<Character> stack){
        while (!stack.empty()) {
            System.out.println(stack.pop());
        }
    }

    public void reverseString(Stack<Character> stack, String str){
        int i=0;
        while(str.length()>i){
            stack.push(str.charAt(i));
            i++;
        }
    }
}

