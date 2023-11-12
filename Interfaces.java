public class Interfaces {
    public static void main(String []args){
        Queen q = new Queen();
        q.moves();
    }
}

// interface for different Chess Players
// as they all have different moves
interface ChessPlayers {
        void moves();
    
}

class Queen implements ChessPlayers{
    public void moves(){
        System.out.println("Moves left, right, up, down, diagnol (in all directions)");
    }
}

class Rook implements ChessPlayers{
    public void moves(){
        System.out.println("Moves left, right, up, down");
    }
}

class King implements ChessPlayers{
    public void moves(){
        System.out.println("Moves left, right, up, down, diagnol (by one step)");
    }
}


