package boardgame;

public abstract class Piece {

	protected Position position;
	private Board board;

	public Piece(Board board) {
		this.board = board;
	}

	// protected para apenas classes da mesma camada{pacote/package} e/ou
	// respectivas subclasses acessem o tabuleiro associado a uma pe?a
	protected Board getBoard() {
		return board;
	}
	
	public abstract boolean[][] possibleMoves();
		
	public boolean possibleMove(Position position) {
		return possibleMoves()[position.getRow()][position.getColumn()];
	}
	
	public boolean isThereAnyPossibleMove() {
		boolean[][] mat =  possibleMoves();
		for(int i = 0;i < mat.length;i++) {
			for(int j = 0;j < mat.length;j++) {
				if(mat[i][j]) {
					return true;
				}
			}
		}
		return false;
	}

}
