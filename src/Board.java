import java.util.*;


public class Board {
	
	public List<Piece> playerWhite, playerBlack;	
	public Piece[][] grid; 
	
	public Board() {
		grid = new Piece[8][8];
		initPlayer();
		updateGrid();
	}
	
	public void initPlayer() {
		this.playerWhite = new ArrayList<>();
		playerWhite.add(new King(PColor.WHITE, new Position(4, 0)));
		playerWhite.add(new Queen(PColor.WHITE, new Position(3, 0)));
		playerWhite.add(new Bishop(PColor.WHITE, new Position(2, 0)));
		playerWhite.add(new Bishop(PColor.WHITE, new Position(5, 0)));
		playerWhite.add(new Knight(PColor.WHITE, new Position(1, 0)));
		playerWhite.add(new Knight(PColor.WHITE, new Position(6, 0)));
		playerWhite.add(new Rook(PColor.WHITE, new Position(0, 0)));
		playerWhite.add(new Rook(PColor.WHITE, new Position(7, 0)));
		for(int i = 0; i < 8; i++) {
			playerWhite.add(new Pawn(PColor.WHITE, new Position(i, 1)));
		}
		
		this.playerBlack = new ArrayList<>();
		playerBlack.add(new King(PColor.BLACK, new Position(4, 7)));
		playerBlack.add(new Queen(PColor.BLACK, new Position(3, 7)));
		playerBlack.add(new Bishop(PColor.BLACK, new Position(2, 7)));
		playerBlack.add(new Bishop(PColor.BLACK, new Position(5, 7)));
		playerBlack.add(new Knight(PColor.BLACK, new Position(1, 7)));
		playerBlack.add(new Knight(PColor.BLACK, new Position(6, 7)));
		playerBlack.add(new Rook(PColor.BLACK, new Position(0, 7)));
		playerBlack.add(new Rook(PColor.BLACK, new Position(7, 7)));
		for(int i = 0; i < 8; i++) {
			playerBlack.add(new Pawn(PColor.BLACK, new Position(i, 6)));
		}
	}
	
	public void updateGrid() {
		
	}
	
	public void printBoard() {
		
	}
	

	
}
