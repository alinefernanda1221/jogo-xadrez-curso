package boardgame;

public class Board {
	private int rows;
	private int columns;
	private Piece[][] pieces;
	
	public Board(int rows, int columns) { //Programming defensive
		if(rows <1 || columns < 1) {
			throw new BoardException("Erro na criação do tabuleiro: Linha ou coluna menor que o esperado.");
		}
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns];
	}

	public int getRows() {
		return rows;
	}
	
	public int getColumns() {
		return columns;
	}
	
	public Piece piece(int row, int column) {
		if(!positionExists(row, column)) {
			throw new BoardException("Position not on the board"); //Inexistent position
		}
		return pieces[row][column];
	}
	
	public Piece piece(Position position) {
		if(!positionExists(position)) {
			throw new BoardException("Position not on the board"); //Inexistent position
		}
		return pieces[position.getRow()][position.getColumn()];
	}
	
	/**
	 * Dock pieces on the board
	 */
	public void placePiece(Piece piece, Position position) {
		if(thereIsAPiece(position)) {
			throw new BoardException("Already a piece on position " + position);
		}
		pieces[position.getRow()][position.getColumn()] = piece;
		piece.position = position; //Access protected
	}
	
	public boolean positionExists(Position position) { //Valid position by Position object
		return positionExists(position.getRow(), position.getColumn());
	}

	public boolean positionExists(int row, int column) { //Valid position by row and col
		return row >= 0 && row < rows && column >= 0 && column < columns;
	}
	
	public boolean thereIsAPiece(Position position) {
		if(!positionExists(position)) {
			throw new BoardException("Position not on the board"); //Inexistent position
		}
		return piece(position) != null;
	}
	
}
