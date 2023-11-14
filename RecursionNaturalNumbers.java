public class RecursionNaturalNumbers {
    public static void main(String args[]){

        // Calculate sum of n natural numbers
        System.out.println(naturalNumbersSum(4));
    }

    static int naturalNumbersSum(int n){
        if(n == 1){         // Base condition
            return n;
        }
        int sum = naturalNumbersSum(n-1)+n;
        return sum;
    }
}
