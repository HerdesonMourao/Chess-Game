package chess;

import boardgame.Board;
//Imports
import boardgame.Piece;

public abstract class ChessPiece extends Piece {
	private Color color;

	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	//Get
	public Color getColor() {
		return color;
	}	
}