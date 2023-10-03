import java.util.Scanner;

public class fnPalidromeNumber {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
       if( palidromeNumber(n)){
            System.out.println("Number is Palidrome");
       }
       else{
            System.out.println("NUmber is not Palidrome");
       }
    }
    
    public static boolean palidromeNumber(int num){
        int rem=0,digit;
        int originalNUM = num;

        while(num>0){
            digit = num%10;
            rem = rem*10+ digit;
            num = num/10;
        }
        if(originalNUM==rem){
            return true;
        }
        else{
            return false;
        }
    }
}
