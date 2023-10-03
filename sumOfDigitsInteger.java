import java.util.Scanner;

public class sumOfDigitsInteger {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close(); 
        System.out.println(sumOfDigits (n));
    }

    public static int sumOfDigits(int num){
        int sum=0, digit;
        while(num>0){
            digit = num%10;
            sum= sum+digit;
            num = num/10;
            
        }
        return sum;
    }
}
