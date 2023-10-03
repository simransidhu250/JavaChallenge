import java.util.Scanner;

public class fnOddEven {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        if(isEven(n)){
            System.out.println("The number is even");
        }
        else{
            System.out.println("The number is odd");
        }
    }
    public static boolean isEven(int number){
        if(number%2==0){
            return true;
        }
        else{
            return false;
        }

    }
    
}
