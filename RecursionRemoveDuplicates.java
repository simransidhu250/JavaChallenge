public class RecursionRemoveDuplicates {
    public static void main(String args[]){
        String str = "appnnacollege";
        removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);
    }

    static void removeDuplicates(String str,int i, StringBuilder sb, boolean arr[]){
        // base case
        if(i==str.length()){
            System.out.println(sb);
            return;
        }

        //Check if the character at given position already exists or not 
        if(arr[str.charAt(i)-'a']==true){
            removeDuplicates(str, i+1, sb, arr);
        }
        else{
            arr[str.charAt(i)-'a'] = true; 
            removeDuplicates(str, i+1, sb.append(str.charAt(i)), arr);
        }
    }
    
}
