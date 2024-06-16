import java.util.*;


public class King extends Piece {

	public King(PColor c, Position p) {
		super(c, p);
	}
	
	public List<Position> getPossibleMoves(Board board) {
		// TODO
		return new ArrayList<Position>();
	}
	
	public String toString() {
		return (this.color == PColor.WHITE ? "♔" : "♚") + this.position;
	}
	
	
}
