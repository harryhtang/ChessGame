import java.util.List;

public abstract class Piece {

	private PColor color;
	private Position position;
	
	boolean isAlive;
	
	public Piece(PColor c, Position p) {
		this.color = c;
		this.position = p;
	}
	
	public abstract List<Integer> getPossibleMoves();
	public abstract String toString();
}