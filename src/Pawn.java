import java.util.ArrayList;
import java.util.List;

public class Pawn extends Piece {
	
	public boolean isFirstMove;
	
	public Pawn(PColor c, Position p) {
		super(c, p);
		this.isFirstMove = true;
	}
	
	public List<Position> getPossibleMoves(Board board) {
		List<Position> pms = new ArrayList<Position>();
		if(!this.isAlive) 
		 return pms;
		
		if (this.color == PColor.WHITE) {
			if (this.isFirstMove) {
				Position newPos = this.position.add(0, 2);
				if (newPos != null) {
					Piece p = board.getPiece(newPos);
					if (p == null) {
						pms.add(newPos);
					}
				}
			}

			Position newPos = this.position.add(0, 1);
			if (newPos != null) {
				Piece p = board.getPiece(newPos);
				if (p == null) {
					pms.add(newPos);
				}
			}

			newPos = this.position.add(1, 1);
			if (newPos != null) {
				Piece p = board.getPiece(newPos);
				if (p != null && p.color != this.color) {
					pms.add(newPos);
				}
			}

			newPos = this.position.add(-1, 1);
			if (newPos != null) {
				Piece p = board.getPiece(newPos);
				if (p != null && p.color != this.color) {
					pms.add(newPos);
				}
			}
		}
		else { // black
			if (this.isFirstMove) {
				Position newPos = this.position.add(0, -2);
				if (newPos != null) {
					Piece p = board.getPiece(newPos);
					if (p == null) {
						pms.add(newPos);
					}
				}
			}

			Position newPos = this.position.add(0, -1);
			if (newPos != null) {
				Piece p = board.getPiece(newPos);
				if (p == null) {
					pms.add(newPos);
				}
			}

			newPos = this.position.add(1, -1);
			if (newPos != null) {
				Piece p = board.getPiece(newPos);
				if (p != null && p.color != this.color) {
					pms.add(newPos);
				}
			}

			newPos = this.position.add(-1, -1);
			if (newPos != null) {
				Piece p = board.getPiece(newPos);
				if (p != null && p.color != this.color) {
					pms.add(newPos);
				}
			}
		}
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
