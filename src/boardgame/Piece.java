package boardgame;

public class Piece {
	
	protected Position position;
	private Board board;
	
	public Piece() {
	}

	public Piece(Board board) {
		this.board = board;
	  //position = null; {comentado pois se n�o explicitar a inicializa��o o java ir� fazer automaticamente!}
	}

	//protected para apenas classes da mesma camada{pacote/package} e/ou respectivas subclasses acessem o tabuleiro associado a uma pe�a
	protected Board getBoard() {
		return board;
	}
		
}
