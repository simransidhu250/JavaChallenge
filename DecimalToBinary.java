public class DecimalToBinary {
    public static void main(String [] args){
        int n = 10;
        int digit = 0;
        int result = 0;
        int power = 1;
        while(n>0){
            digit = n%2;
            result = result+digit*power;
            n = n/2;
            power = power*10;
        }
        System.out.println(result);
    }
    
}
