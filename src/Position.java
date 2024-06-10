
public class Position {
	
	
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
	
	public boolean equals(Object other) {
		if (other == null) return false;
		if (other instanceof Position) {
			Position o = (Position) other;
			if(o.x == this.x && o.y == this.y)
				return true;			
		}
		
		return false;		
	}
	
	
	@Override
	public String toString() {
		return String.format("(%d,%d)", x, y);
	}
}
