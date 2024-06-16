import java.util.List;

public abstract class Piece {

	public PColor color;
	public Position position;
	public boolean isAlive;
	
	public Piece(PColor c, Position p) {
		this.color = c;
		this.position = p;
		this.isAlive = true;
	}
	
	public abstract List<Position> getPossibleMoves();
	public abstract String toString();
	
	public void moveTo(Position newPos) {
		this.position = newPos;
	}
}