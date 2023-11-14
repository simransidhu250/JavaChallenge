public class RecursionFactorial {
    public static void main(String args[]){
       System.out.println( Factorial(5));  
    }

    static int Factorial(int n){  
        if(n<0){
            return -1;  // Factorial does not exists for negative numbers
        }  
        if(n==0){
            return 1;   // Base condition
        }
        int fact = Factorial(n-1)*n;
        return fact;

    }
    
}
