public class HollowRectangle {
    public static void main(String []args){
        int r = 4;
        int col =6;
        for(int i=0; i<r; i++){
            for(int j=0; j<col; j++){
                // for printing the stars at the borders
                if(i==0||j==0||i==r-1||j==col-1){
                    System.out.print("*  ");
                }
                // for printing the hollow spaces within the rectangle
                else{
                    System.out.print("   ");
                }
                
            }
            System.out.println();
        }
    }
    
}
