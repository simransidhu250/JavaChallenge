import java.util.Stack;
public class StackStockSpan {
    public static void main(String args[]){
        StackStockSpan sp = new StackStockSpan();


        int arr[] = {100,80,60,70,60,85,100};
        sp.stockSpan(arr);



    }

    public Stack<Integer> stockSpan(int arr[]){
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<arr.length; i++){
            while(stack.empty()|| )
        }
        return stack;
    }

    // print function
    public static void printStack(Stack<Integer> stack){
        while (!stack.empty()) {
            System.out.println(stack.pop());
        }
    }
    
}
