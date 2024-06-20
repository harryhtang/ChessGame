import java.util.ArrayList;
import java.util.List;

public class Rook extends Piece {

	public Rook(PColor c, Position p) {
		super(c, p);
	}

	public List<Position> getPossibleMoves(Board board) {
		List<Position> pms = new ArrayList<Position>();
		if (!this.isAlive)
			return pms;

		// go right
		for (int i = 0; i < 8; i++) {
			Position newPos = this.position.add(0, i);
			if (newPos != null) {
				Piece p = board.getPiece(newPos);
				if (p == null) {
					pms.add(newPos);
				} else if (p.color != this.color) {
					pms.add(newPos);
					break;
				}
			}
		}
		// go left
		for (int i = 0; i < 8; i++) {
			Position newPos = this.position.add(0, -i);
			if (newPos != null) {
				Piece p = board.getPiece(newPos);
				if (p == null) {
					pms.add(newPos);
				} else if (p.color != this.color) {
					pms.add(newPos);
					break;
				}
			}
		}
		// go up
		for (int i = 0; i < 8; i++) {
			Position newPos = this.position.add(i, 0);
			if (newPos != null) {
				Piece p = board.getPiece(newPos);
				if (p == null) {
					pms.add(newPos);
				} else if (p.color != this.color) {
					pms.add(newPos);
					break;
				}
			}
		}
		// go down
		for (int i = 0; i < 8; i++) {
			Position newPos = this.position.add(-i, 0);
			if (newPos != null) {
				Piece p = board.getPiece(newPos);
				if (p == null) {
					pms.add(newPos);
				} else if (p.color != this.color) {
					pms.add(newPos);
					break;
				}
			}
		}

		return pms;
	}

	public String toString() {
		return (this.color == PColor.WHITE ? "♖" : "♜") + this.position;
	}

}
