import java.util.ArrayList;
import java.util.List;

public class Pawn extends Piece {
	
	public boolean isFirstMove;
	
	public Pawn(PColor c, Position p) {
		super(c, p);
		this.isFirstMove = true;
	}
	
	public List<Position> getPossibleMoves(Board board) {
		// TODO
		return new ArrayList<Position>();
	}
	
	public String toString() {
		return (this.color == PColor.WHITE ? "♙" : "♟") + this.position;
	}
	
	@Override
	public void moveTo(Position newPos) {
		super.moveTo(newPos);
		this.isFirstMove = false;
	}
}
