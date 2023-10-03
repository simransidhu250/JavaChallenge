import java.util.Scanner;

public class typeConversion {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        double n = sc.nextInt(); // Java allows the storage of small data in large data type 
        sc.close();              // but does not allow the data type with large storage to be stored in less storage data type also called lossy conversion 
        System.out.println(n);
    }
    
}
