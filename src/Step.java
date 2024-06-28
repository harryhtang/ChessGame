
public class Step {
	Piece piece;
	Position oldPos;
	Position newPos;
	Piece killedPiece;
	
	public Step(Piece p, Position newPos, Piece killedPiece) {
		this.piece = p;
		this.oldPos = p.position;
		this.newPos = newPos;
		this.killedPiece = killedPiece;
	}
}
