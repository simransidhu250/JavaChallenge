public class ShortestPath {
    public static void main(String []args){
        String str ="WNEENESENNN";
        double path = path(str);
        System.out.println(path);
    }

    public static float  path(String str){
        int x =0, y=0;

        // Time complexity is O(n)
        // Space complexity is O(1)
        for(int i=0; i<str.length(); i++){
            if((str.charAt(i)) == 'W'){
                x--;
            }
            else if((str.charAt(i)) == 'E'){
                x++;
            }
            else if((str.charAt(i)) == 'N'){
                y++;
            }
            else if((str.charAt(i)) == 'S'){
                y--;
            }
            else{
                
                return -1 ;
            }
        }
        int x2 = (x-0)*(x-0);
        int y2 = (y-0)*(y-0);
        float path = (float)Math.sqrt(x2+y2);
        return path;
    } 
    
}
