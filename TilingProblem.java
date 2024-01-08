public class TilingProblem {
    public static void main(String args[]){
        int n =4;
        System.out.println(tiling(n));
    }

    static int tiling(int n){

        // Base case

        if(n==0|| n==1){
            return 1;
        }

        // Recursion part
        return tiling(n-1)+tiling(n-2);
    }
}
