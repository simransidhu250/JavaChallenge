public class BinaryToDecimal {
    public static void main(String []args){
        int n = 10;
        int digit =0;
        int result = 0;
        int power = 1;
        while(n>0){
            digit = n%10; // extracting last number
            result = result+ power*digit; 
            power = power*2;  // increasing power to make a shift to the left for the next digit that will be extracted
            n=n/10;   // new number after removing the extracted digit from the number           
        }
        System.out.println(result);
    }
    
}
