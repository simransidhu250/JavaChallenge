public class BitOddEven {
    public static void main(String []args){
        int n =4;
        System.out.println(oddEven(n));
    }

    public static boolean oddEven(int number){
        if((number & 1) == 0){          // using bitmask of 1 to get last digit of the byte
                return true;
        }
        else{
            return false;
        }
    }
    
}
