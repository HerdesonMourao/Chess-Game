package chess;

//Imports
import boardgame.Board;
import boardgame.Position;
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
	
	protected boolean isThereOpponentPiece(Position position) {
		ChessPiece p = (ChessPiece)getBoard().piece(position);
		
		return p != null && p.getColor() != color;
	}
}