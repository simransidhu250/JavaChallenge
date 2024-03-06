import java.util.Stack;

public class StackStockSpan {
    public static void main(String args[]) {
        StackStockSpan sp = new StackStockSpan();

        int arr[] = { 100, 80, 60, 70, 60, 85, 100 };
        sp.stockSpan(arr);

    }

    public void stockSpan(int arr[]) {
        Stack<Integer> stack = new Stack<>();
        int span[] = new int[arr.length];
        stack.push(0);
        span[0] = 1;
        for (int i = 1; i < arr.length; i++) {
            System.out.println(arr[stack.peek()] + " < " + arr[i]);
            while (!stack.empty() && arr[stack.peek()] < arr[i]) {
                stack.pop();
            }
            if (stack.empty()) {
                span[i] = i;
            } else {
                span[i] = i - stack.peek();
            }
            stack.push(i);

            System.out.print(span[i] + "\t");
        }
    }

    // print function
    public static void printStack(Stack<Integer> stack) {
        while (!stack.empty()) {
            System.out.print(stack.pop());
        }
    }

}
