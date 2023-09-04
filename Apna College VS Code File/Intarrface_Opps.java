public class Intarrface_Opps {
    public static void main(String[] args) {// creat object
        Rook q = new Rook();
        q.moves();
        
    }
    
}

interface ChessPlayer {
    // Creat blue print 
    // by default public / Abstract / 
    void moves() ; // not write implementations because  abstract ko implemetations krna hai
}
 class Queen implements ChessPlayer {
    public void moves(){
        System.out.println("up, down, right, left and diagonal (in all 4 directions) ");
    }
 }
 class Rook implements ChessPlayer {
    public void moves (){
        System.out.println("up, down, left, right");
    }
 }

 class King implements ChessPlayer {
    public void moves (){
        System.out.println("left, right, up, down and diagonal - (by 1 step)");
    }
 }