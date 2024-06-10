
public class ChessGame {

	public static void main(String[] args) {
		Position p1 = new Position(1, 2),
				 p2 = new Position(2, 2);
		System.out.println(String.format("%s == %s is %b", p1, p2, 
				p1.equals(p2)
				));
		
		// 
		//King king = new King(PColor.WHITE, new Position(1,2));
		//  "Kb3"
	}
}