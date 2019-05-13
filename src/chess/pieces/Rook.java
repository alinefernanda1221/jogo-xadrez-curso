package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.ColorEnum;

public class Rook extends ChessPiece{
	
	public Rook(Board board, ColorEnum color) { //Constructor from superclass
		super(board, color);
	}

	@Override
	public String toString() { //Return representation of rook piece in board
		return "R";
	}
}
