public class BackTrackingPrintSubsets {
    public static void main(String args[]){
        String str = "abc";
        printSubsets(str, 0, new String());
    }

    static void printSubsets(String str, int i, String sb){
        //Base case
        if(str.length()==i){
            System.out.println(sb);
            return;
        }
        // Yes choice
        printSubsets(str, i+1, sb+(str.charAt(i)));
        // No choice
        printSubsets(str, i+1, sb);
    }
    
}
