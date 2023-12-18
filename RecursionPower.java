public class RecursionPower {
    public static void main(String args[]){
        int n = 2;
        int pow = 10;
        // System.out.println(power(n,pow));
        System.out.println(optimizedPower(n, pow));
    }


    static int power(int n, int pow){

        // Time Complexity O(n)

        if(pow==0){
            return 1;
        }
        return n*power(n, pow-1);
    }



    // Optimized approach 
    static int optimizedPower(int n, int pow){
        if(pow==0){
            return 1;
        }

        // Time complexity O(log n)
        int halfpower = optimizedPower(n, pow/2);
        int result = halfpower*halfpower;
        if(pow%2!=0){
            result = n*result;
        }
        return result;
    }
}
