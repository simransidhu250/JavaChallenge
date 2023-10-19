public class UpperCaseConversion {
    public static void main(String []args){
        String str = "hi my name is simran";
        String res = toUpperCase(str);
        System.out.println(res);
    }

    public static String toUpperCase(String str){
        StringBuilder sb = new StringBuilder("");


        // Time complexity is O(n)
        // Space complexity is O(1)
        
        sb.append(Character.toUpperCase(str.charAt(0)));    //Making the first letter capital for each sentence
        for(int i=1; i<str.length(); i++){      
            if(str.charAt(i) == ' '){
                sb.append(str.charAt(i));       
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    
}
