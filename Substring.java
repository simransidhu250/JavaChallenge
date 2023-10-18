public class Substring {
    public static void main(String []args){
        String str = "HelloWordl";
        System.out.println(str.substring(0, 5));  // in-built substring function
        substr(str, 0, 5); // user defined function
    }

    public static void substr(String str, int start, int end){
        String subst="";
        for(int i=start; i<end; i++){
            subst += str.charAt(i); 
        }
        System.out.println(subst);
    }
    
}
