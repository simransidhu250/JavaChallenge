public class Call{

    public static void update(int marks[], int n){
        n = 48;     // call by value
        for(int i=0; i<marks.length; i++){
            marks[i] = marks[i]+1;      // call by reference
        }
    }
    public static void main(String [] args){
        int marks [] = {97,98,99};
        int nonChangeable = 8;
        
        update(marks, nonChangeable); // Arrays are passed with reference
        for(int i=0; i<marks.length; i++){
            System.out.print(marks[i]+"\t");
        }
        System.out.println();
        System.out.println(nonChangeable);  // The integer vale is passed by value
    } 
}