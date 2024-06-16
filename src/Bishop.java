import java.util.ArrayList;
import java.util.List;


public class Bishop extends Piece {

	public Bishop(PColor c, Position p) {
		super(c, p);
	}
	
	public List<Position> getPossibleMoves(Board board) {
		// TODO
		return new ArrayList<Position>();
	}
	
	public String toString() {
		return (this.color == PColor.WHITE ? "♗" : "♝") + this.position;
	}
	
	
}
