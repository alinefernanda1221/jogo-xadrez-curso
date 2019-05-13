package boardgame;

public class Piece {
	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
	}

	//S� pacote e subclasses acessam
	protected Board getBoard() {
		return board;
	}	
	
}
