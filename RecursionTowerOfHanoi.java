public class RecursionTowerOfHanoi {
    public static void main(String args[]){
        TowerOfHanoi(3, 'A', 'B', 'C');
    }

    static void TowerOfHanoi(int n, char from_rod, char to_rod, char aux_rod){
        if(n==0){
            return;
        }
        // Move n-1 disk from rod A(from_rod) to rod B(aux_rod)
        TowerOfHanoi(n-1, from_rod, aux_rod, to_rod);

        //Move nth disk from rod A(from_rod) to rodC(to_rod)
        System.out.println("Move disk "+n+" from "+from_rod+" to "+to_rod);

        //Move n-1 disk from rod B(aux_rod) to rod C (to_rod)
        TowerOfHanoi(n-1, aux_rod, to_rod, from_rod);
    }
}
