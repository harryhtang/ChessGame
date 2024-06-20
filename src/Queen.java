import java.util.ArrayList;
import java.util.List;

public class Queen extends Piece {

	public Queen(PColor c, Position p) {
		super(c, p);
	}

	public List<Position> getPossibleMoves(Board board) {
		List<Position> pms = new ArrayList<Position>();
		if (!this.isAlive)
			return pms;

		// go up right
		for (int i = 0; i < 8; i++) {
			Position newPos = this.position.add(i, i);
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
		// go up left
		for (int i = 0; i < 8; i++) {
			Position newPos = this.position.add(i, -i);
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
		// go down right
		for (int i = 0; i < 8; i++) {
			Position newPos = this.position.add(-i, i);
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
		// go down left
		for (int i = 0; i < 8; i++) {
			Position newPos = this.position.add(-i, -i);
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
		return (this.color == PColor.WHITE ? "♕" : "♛") + this.position;
	}

}
