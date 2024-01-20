public class BackTrackingGridWays {
    public static void main(String args[]){
        int n=3, m=3;
        System.out.println(gridWays(0,0,m,n));
    }
    
    static int gridWays(int i, int j, int m, int n){
        if(m-1==i && n-1==j){   // condition for target reached
            return 1;
        }
        if(m==i || n==j){   // boundary cross condition
            return 0;
        }
        int w1 =gridWays(i+1, j, m, n);
        int w2 = gridWays(i, j+1, m, n);

        return w1+w2;
    }
}
