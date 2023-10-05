public class fnRangeofPrime {
    public static void main(String []args){
        int num = 10;
        primeInRange(num);

    }    

    public static void primeInRange(int n){
        for(int i=1; i<=n; i++){
            if(isPrime(i)){
            System.out.print(i+ "  ");
            }

        }
    }
    public static boolean isPrime(int n){
        if(n==1){
            return false;
        }
        if(n==2){
            return true;
        }
        for(int i=2; i<=Math.sqrt(n); i++){
            if(i%2==0){
                return false;
            }
        }
        return true;
    } 
}
