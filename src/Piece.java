import java.util.List;

public abstract class Piece {

	PColor color;
	// Position position;
	
	boolean isAlive;
	
	public Piece(PColor c) {
		this.color = c;
	}
	
	public abstract List<Integer> getPossibleMoves();
}