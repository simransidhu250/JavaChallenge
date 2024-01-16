public class RecursionBinaryStrings {
    public static void main(String args[]){
        binaryString(3,new String(),0);
    }

    static void binaryString(int n,String sb ,int lastPlace){
;
        if(n==0){
            System.out.println(sb);
            return;
        }
        if(lastPlace==0){
            binaryString(n-1, sb+("0"), 0);
            binaryString(n-1, sb+("1"), 1);
        }
        else{
            binaryString(n-1, sb+("0"), 0);
        }
        
    }
    
}
