public class BinaryToDecimal {
    public static void main(String []args){
        int n = 10;
        int digit =0;
        int result = 0;
        int power = 1;
        while(n>0){
            digit = n%10;
            result = result+ power*digit;
            power = power*2;
            n=n/10;            
        }
        System.out.println(result);
    }
    
}
