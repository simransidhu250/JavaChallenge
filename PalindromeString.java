public class PalindromeString {
    public static void main(String []args){
        String str = "rcecar";
        if(palindrone(str)){
            System.out.println("String is palindrome");
        }
        else{
            System.out.println("String is not palindrome");
        }

    }

    public static boolean palindrone(String str){

        // Run the loop till half to compared the indices on one side of half to the indices in the other half
        // Time complexity will be O(n/2) which is O(n)
        // Space complexity will be O(1)

        for(int i=0; i<str.length()/2; i++){
            if(str.charAt(i)!= str.charAt(str.length()-1-i)){
                return false;
            }
        }
        return true;
    }
    
}
