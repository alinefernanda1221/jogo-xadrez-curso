package chess;

import boardgame.Board;
import boardgame.Position;
import chess.pieces.King;
import chess.pieces.Rook;

/**
 * Core of chess game
 * @author Aline
 *
 */
public class ChessMatch {
	private Board board;
	
	public ChessMatch() { //Create new board with 8x8 position
		board = new Board(8,8);
		initialSetup();
	}
	public ChessPiece[][] getPieces(){ //DownCasting
		ChessPiece[][] mat = new ChessPiece[board.getRows()] [board.getColumns()];
		for(int i = 0; i < board.getRows(); i++) { //Line
			for(int j = 0; j< board.getColumns(); j++) { //Column
				mat[i][j] = (ChessPiece)board.piece(i,j); 
			}
		}
		return mat;
	}
	
	private void placeNewPiece(char column, int row, ChessPiece piece) {
		board.placePiece(piece, new ChessPosition(column, row).toPosition());
	}
	
	public void initialSetup() { //Init pieces for ChessMatch
		placeNewPiece('c', 1, new Rook(board, ColorEnum.WHITE));
        placeNewPiece('c', 2, new Rook(board, ColorEnum.WHITE));
        placeNewPiece('d', 2, new Rook(board, ColorEnum.WHITE));
        placeNewPiece('e', 2, new Rook(board, ColorEnum.WHITE));
        placeNewPiece('e', 1, new Rook(board, ColorEnum.WHITE));
        placeNewPiece('d', 1, new King(board, ColorEnum.WHITE));

        placeNewPiece('c', 7, new Rook(board, ColorEnum.BLACK));
        placeNewPiece('c', 8, new Rook(board, ColorEnum.BLACK));
        placeNewPiece('d', 7, new Rook(board, ColorEnum.BLACK));
        placeNewPiece('e', 7, new Rook(board, ColorEnum.BLACK));
        placeNewPiece('e', 8, new Rook(board, ColorEnum.BLACK));
        placeNewPiece('d', 8, new King(board, ColorEnum.BLACK));
	}
}

