public class StringCompression {
    public static void main(String [] args){
        String str = "aaabbccc"; 
        String result = CompressString(str);
        System.out.println(result);

    }

    public static String CompressString(String str){
        int count = 0;
        StringBuilder sb = new  StringBuilder("");

        // Time complexity is O(n)
        // Space complexity is O(1)
        for(int i=0; i<str.length(); i++){
            count =1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if(count >1){       // if there is only one alphabet we will not print it
                sb.append(count);       
            }
        }
        return sb.toString();
    }
}
