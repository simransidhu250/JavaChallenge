public class fnOverLoading {
    public static void main(String [] args){
        System.out.println(sum(4.8f, 9));
    }

    public static float sum(float a, float b){
        return a+b;
    }
    public static float sum(int a, int b){
        float sum = a+b;
            return  sum;
    }
}
