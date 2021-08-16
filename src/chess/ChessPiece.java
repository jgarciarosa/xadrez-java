package chess;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;

public abstract class ChessPiece extends Piece{
	
	private Color color;
	private int moveCount;
	
	public ChessPiece(Board board, Color color, int moveCount) {
		super(board);
		this.color = color;
		this.moveCount = moveCount;
	}

	public Color getColor() {
		return color;
	}

	public int getMoveCount() {
		return moveCount;
	}

	public void setMoveCount(int moveCount) {
		this.moveCount = moveCount;
	}
	
	protected boolean isThereOpponentPiece(Position position) {
		ChessPiece p = (ChessPiece)getBoard().piece(position);
		return p != null && p.getColor() != color;		
	}

	
	
	
}
