import java.util.ArrayList;
import java.util.List;

public class Position {
	private static String files = "abcdefgh", ranks = "12345678";
	
	private int x;
	private int y;
	
	public Position(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public Position add(int dx, int dy) {
		int newX = this.x+dx;
		int newY = this.y+dy;
		if(newX >= 0 && newX < 8 && newY >= 0 && newY < 8) {
			return new Position(newX, newY);
		}
		return null;
	}
	
	public boolean equals(Object other) {
		if (other == null) return false;
		if (other instanceof Position) {
			Position o = (Position) other;
			if(o.x == this.x && o.y == this.y)
				return true;			
		}
		
		return false;		
	}
	
	public static Position fromString(String s) {
		int x = files.indexOf(s.charAt(0));
		int y = ranks.indexOf(s.charAt(1));
		return new Position(x,y);
	}
	
	@Override
	public String toString() {
//		return String.format("(%d,%d)", x, y);		
		return "" + files.charAt(x) + ranks.charAt(y);
	}
	
	public static List<Position> getPositionBetween(Position startingPoint, Position endingPoint) {
		int x0 = startingPoint.getX();
		int y0 = startingPoint.getY();
		int x1 = endingPoint.getX();
		int y1 = endingPoint.getY();
		int minY = Math.min(y0, y1);
		int maxY = Math.max(y0, y1);
		int minX = Math.min(x0, x1);
		int maxX = Math.max(x0, x1);
		List<Position> positionsBetween = new ArrayList<>();
		if(x0 == x1) {
			for(int y = minY+1; y<maxY; y++ ) {
				positionsBetween.add(new Position(x0, y));
			}
		}
		else if(y0 == y1) {
			for(int x = minX+1; x<maxX; x++) {
				positionsBetween.add(new Position(x, y0));
			}
		}
		// TODO diagonal 
		else {
			for(int x = minX+1, y = minY+1; x<maxX && y<maxY; x++, y++) {
				positionsBetween.add(new Position(x, y));
			}
		}
		
		return positionsBetween;
	}
}
