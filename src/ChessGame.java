
public class ChessGame {

	public static void main(String[] args) {
		Position p1 = new Position(1, 2),
				 p2 = new Position(2, 2);
		System.out.println(String.format("%s == %s is %b", p1, p2, 
				p1.equals(p2)
				));
		
		
		Position p3 = Position.fromString("a3"); // Position(4, 3), x=4,y=3
		System.out.println(p3.getX());
		System.out.println(p3.getY());

		 
		Piece knight = new Knight(PColor.BLACK, new Position(1,2));
		System.out.println(knight); //  "♔b3" 
		
		knight.moveTo(new Position(2,4));
		System.out.println(knight); //  "♔b3" 
		
	}
}