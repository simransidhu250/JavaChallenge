public class BitOperations {
    public static void main(String []args){
        int n =15;
        int i = 5;
        getIbit(n, i);
        setIbit(10, 2);
        clearIbit(10, 1);

    }

    public static void getIbit(int number, int i){
        int bitmask = 1<<i;
        if((number & bitmask)==0){
            System.out.println(i +"th bit is 0");
        }
        else{
             System.out.println(i +"th bit is 1");
        }
    }

    public static void setIbit(int number, int i){
        int bitmask = 1<<i;
        int result = number | bitmask;
        System.out.println(result);
    }

    public static void clearIbit(int number, int i){
        int bitmask = (~(1<<i));
        int result = number & bitmask;
        System.out.println(result);
    }
}
