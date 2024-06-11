
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
}
