import java.util.ArrayList;
import java.util.List;


public class Queen extends Piece {

	public Queen(PColor c, Position p) {
		super(c, p);
	}
	
	public List<Position> getPossibleMoves() {
		// TODO
		return new ArrayList<Position>();
	}
	
	public String toString() {
		return (this.color == PColor.WHITE ? "♕" : "♛") + this.position;
	}
	
	
}
