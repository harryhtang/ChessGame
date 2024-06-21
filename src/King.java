import java.util.*;

public class King extends Piece {

	public King(PColor c, Position p) {
		super(c, p);
	}

	public List<Position> getPossibleMoves(Board board) {
		List<Position> pms = new ArrayList<Position>();
		if (!this.isAlive)
			return pms;

		for (int x : new int[] { -1, 0, 1 }) {
			for (int y : new int[] { -1, 0, 1 }) {
				Position newPos = this.position.add(x, y);
				if (newPos != null) {
					Piece p = board.getPiece(newPos);
					if (p == null) {
						pms.add(newPos);
					} else if (p.color != this.color) {
						pms.add(newPos);
					}
				}
			}
		}
		return pms;
	}

	public String toString() {
		return (this.color == PColor.WHITE ? "♔" : "♚") + this.position;
	}

}
