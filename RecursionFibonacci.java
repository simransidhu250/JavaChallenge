public class RecursionFibonacci {

    public static void main(String []args){
        // Calculate n th term in fibonacci series
        System.out.println(fibonacci(8));
    }

    static int fibonacci(int n){
        if(n==0 || n==1){   // Base Condition
            return n;
        }

        int num = fibonacci(n-1)+fibonacci(n-2);
        return num;

    }
    
}
