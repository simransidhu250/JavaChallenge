public class BackTrackingKeypad {
    public static void main(String args[]){
        char var[][]= {{},{}, {'a', 'b', 'c'}, {'d', 'e', 'f'}, {'g', 'h', 'i'},{'j', 'k', 'l'}, {'m', 'n', 'o'}, {'p', 'q', 'r', 's'},
                        {'t', 'u', 'v'}, {'w', 'x','y', 'z'}};
        String str = "236";
        keypad(str,0, var, new String());
    }
    
    static void keypad(String str, int i,char var[][], String sol){
        if(str.length()==i){
            System.out.println(sol.toString());
            return;
        }
        // Changing character from given index of string to numeric so that it can be used in array.
        

        char[] pos = var[Character.getNumericValue(str.charAt(i))];
        for(int j=0; j<pos.length; j++){
            keypad(str, i+1, var, sol+(pos[j]));
        }


    }
}
