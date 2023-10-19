public class BitManipulation {
    public static void main(String []args){
       bitwiseOperators(); 
    }

    public static void bitwiseOperators(){
        System.out.println("5 & 6 : "+(5&6));   // Logical AND operator
        System.out.println("5 | 6 : "+(5|6)); // Logical OR operator
        System.out.println("5 ^ 6 : "+(5^6));   // XOR operator
        System.out.println("~5 :"+ (~5));    // NOT operator
        System.out.println("5 << 2 : "+(5<<2));  // Left Shift Operator
        System.out.println("6 >> 1 : "+(6>>1));  // Right Shift Operator
        
        
    }
    
}
