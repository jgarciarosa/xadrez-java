package chess;

import boardgame.Board;
import boardgame.Position;
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessMatch {
	
	private Board board;
	
	public ChessMatch() {
		board = new Board (8,8);
		initialSetup();
	}
	
	//retornar matrix de pe�as de xadrez {N�O PE�AS DE TABULEIRO!} correspondentes a partida instaciada!
	public ChessPiece[][] getPieces(){
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		for (int i = 0;i < board.getRows();i++) {
			for (int j = 0; j < board.getColumns();j++) {
				mat[i][j] = (ChessPiece) board.piece(i, j);
			}
		}
		return mat;
	}
	
	private void initialSetup() {
		board.placePiece(new Rook(board, Color.WHITE, 0), new Position(2, 1));
		board.placePiece(new King(board, Color.BLACK, 0), new Position(4, 1));
	}

}
