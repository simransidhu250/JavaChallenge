import java.util.ArrayList;
public class StackUsingArrayList{
    ArrayList <Integer> list = new ArrayList<>();
    public static void main(String args[]){
        // Creating instance of class
        StackUsingArrayList stack = new StackUsingArrayList();

        // adding elements to the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        // printing stack
        stack.printStack();

        // remove from the stack
        stack.pop();

        // printing stack
        stack.printStack();

        
    }

    public void push(int data){
        list.add(data);
    }
    public int top(){
        return list.get(list.size()-1);
    }

    public int pop(){
        if(list.size()==0){
            return -1;
        }
        int element = list.get(list.size()-1);
        list.remove(list.size()-1);
        return element;
    }

    public void printStack(){
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i)+"  ");
        }
        System.out.println();
    }


}