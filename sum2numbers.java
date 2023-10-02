import java.util.Scanner;

public class sum2numbers {
    public static void main(String [] args){
        int a , b;
        int sum =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Entere number 1");
        a = sc.nextInt();
        System.out.println("Entere number 2");
        b = sc.nextInt();
        sum = a+b;
        System.out.println(sum);
    }
}
