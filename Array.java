import java.util.Scanner;
public class Array {
    public static void main(String []args){
        int marks[] = new int[3];
        System.out.println(marks[0]);  // Java initializes whole array with 0 for integers
        String str[] = new String[4];
        System.out.println(str[0]); //String is initialized as null by default for array

        Scanner sc = new Scanner(System.in);
        marks[0] = 96;
        System.out.println("Enter marks for 2nd subject");
        marks[1] = sc.nextInt();
        sc.close();
        marks[2] = 98;
        float percentage = (marks[0]+marks[1]+marks[2])/3;
        System.out.println("Percentage: "+percentage);

         
    }
}
