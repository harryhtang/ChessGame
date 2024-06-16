import java.util.ArrayList;
import java.util.List;


public class Knight extends Piece {

	public Knight(PColor c, Position p) {
		super(c, p);
	}
	
	public List<Position> getPossibleMoves(Board board) {
		List<Position> pms = new ArrayList<Position>();
		if(!this.isAlive) 
		 return pms;
		
		Position newPos = this.position.add(1, 2);
		if(newPos != null) {
			Piece p = board.getPiece(newPos);
			if(p == null) {
				pms.add(newPos);
			}
			else if(p.color != this.color) {
				pms.add(newPos);
			}
		}
		//
		newPos = this.position.add(2, 1);
		if(newPos != null) {
			Piece p = board.getPiece(newPos);
			if(p == null) {
				pms.add(newPos);
			}
			else if(p.color != this.color) {
				pms.add(newPos);
			}
		}
		//
		newPos = this.position.add(1, -2);
		if(newPos != null) {
			Piece p = board.getPiece(newPos);
			if(p == null) {
				pms.add(newPos);
			}
			else if(p.color != this.color) {
				pms.add(newPos);
			}
		}
		//
		newPos = this.position.add(2, -1);
		if(newPos != null) {
			Piece p = board.getPiece(newPos);
			if(p == null) {
				pms.add(newPos);
			}
			else if(p.color != this.color) {
				pms.add(newPos);
			}
		}
		//
		newPos = this.position.add(-1, 2);
		if(newPos != null) {
			Piece p = board.getPiece(newPos);
			if(p == null) {
				pms.add(newPos);
			}
			else if(p.color != this.color) {
				pms.add(newPos);
			}
		}
		//
		newPos = this.position.add(-2, 1);
		if(newPos != null) {
			Piece p = board.getPiece(newPos);
			if(p == null) {
				pms.add(newPos);
			}
			else if(p.color != this.color) {
				pms.add(newPos);
			}
		}
		//
		newPos = this.position.add(-1, -2);
		if(newPos != null) {
			Piece p = board.getPiece(newPos);
			if(p == null) {
				pms.add(newPos);
			}
			else if(p.color != this.color) {
				pms.add(newPos);
			}
		}
		//
		newPos = this.position.add(-2, -1);
		if(newPos != null) {
			Piece p = board.getPiece(newPos);
			if(p == null) {
				pms.add(newPos);
			}
			else if(p.color != this.color) {
				pms.add(newPos);
			}
		}
		return pms;
		
	}
	
	public String toString() {
		return (this.color == PColor.WHITE ? "♘" : "♞") + this.position;
	}
	
	
}
