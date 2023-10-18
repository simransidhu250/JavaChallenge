import java.util.Scanner;

public class Strings {
    public static void main(String []args){
        // char arr[] = {'a', 'b', 'c', 'd'};
        // String str = "abcd";
        // String str2 = new String("xyz@#1234");

        // Strings are  IMMUTABLE
        // str2 ="jbc";
        // System.out.println(str2);


        // Scanner sc = new Scanner(System.in);   
        // String name;
        // name = sc.next(); // take only one word
        // // name = sc.nextLine();  // takes complete line
        // System.out.println(name);
        // sc.close();

        // String fullName ="Tony Stark";
        // System.out.println(fullName.length());

        // Concatenation

        String firstName = "Simran";
        String lastName = "Sidhu";
        String fullName = firstName+ " " + lastName;        // adding multiple strings to form single one is concatenation
        // System.out.println(fullName);
        // System.out.println(fullName.charAt(0)); // prints character at given index

        printString(fullName);

    }


    public static void printString(String str){
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i)+" ");
        }
    }
}
