import java.util.ArrayList;
import java.util.List;


public class Knight extends Piece {

	public Knight(PColor c, Position p) {
		super(c, p);
	}
	
	public List<Position> getPossibleMoves() {
		// TODO
		return new ArrayList<Position>();
	}
	
	public String toString() {
		return (this.color == PColor.WHITE ? "♘" : "♞") + this.position;
	}
	
	
}
