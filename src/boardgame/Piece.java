package boardgame;

public class Piece {

	protected Position position;
	private Board board;

	public Piece(Board board) {
		this.board = board;
	}

	// protected para apenas classes da mesma camada{pacote/package} e/ou
	// respectivas subclasses acessem o tabuleiro associado a uma peça
	protected Board getBoard() {
		return board;
	}

}
