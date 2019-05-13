package chess;

import boardgame.Board;

/**
 * Core of chess game
 * @author Aline
 *
 */
public class ChessMatch {
	private Board board;
	
	public ChessMatch() {
		board = new Board(8,8);
	}
	public ChessPiece[][] getPieces(){
		ChessPiece[][] mat = new ChessPiece[board.getRows()] [board.getColumns()];
		for(int i = 0; i < board.getRows(); i++) { //Line
			for(int j = 0; j< board.getColumns(); j++) { //Column
				mat[i][j] = (ChessPiece)board.piece(i,j); //DownCasting
			}
		}
		return mat;
	}
}

