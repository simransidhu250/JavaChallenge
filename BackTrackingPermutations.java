public class BackTrackingPermutations{
    public static void main(String args[]){
        String str = "abc";
        permutations(str, new String(""));
    }

    static void permutations(String str, String sb){
        // Base Case
        if(0==str.length()){
            System.out.println(sb);
            return;
        }
        //Recursion
        for(int i=0; i<str.length(); i++){       
            char currElement = str.charAt(i);
            String Newstr = str.substring(0, i)+str.substring(i+1, str.length());
            permutations(Newstr, sb+currElement);
        }
    }
}