package bordgame;

public class Board {
	private int row;
	private int collumn;
	private Piece[][] pieces;
	
	
	public Board(int row, int collumn) {
		if(row<1 || collumn<1) {
			throw new BoardException("� necess�rioa que haja pelo menos uma linha e uma  coluna");
		}
		this.row = row;
		this.collumn = collumn;
		pieces = new Piece[row][collumn ];
	}


	public int getRow() {
		return row;
	}


	public int getCollumn() {
		return collumn;
	}

	
	public Piece piece(int row, int column){
		if(!positionExists(row, column)) {
			throw new BoardException("posi��o n�o existe");
		}
		return pieces[row][column];
		
	}
	public Piece piece(Position position){
		if(!positionExists(position)) {
			throw new BoardException("posi��o n�o existe");
		}
		return pieces[position.getRow()][position.getCollumn()];
		
	}
	
	public void placePiece(Piece piece,Position position) {
		if(thereIsAPiece(position)) {
			throw new BoardException("j� tem uma pe�a nessa posi��o:"+position);
		}
		pieces[position.getRow()][position.getCollumn()] = piece;
		piece.position = position;
	}
	
	private boolean positionExists(int row, int column) {
		return row>=0 && row < this.row && column>=0 && column< this.collumn;
		
	}
	public boolean positionExists(Position position) {
		return positionExists(position.getRow(), position.getCollumn());
	}
	public boolean thereIsAPiece(Position position) {
		if(!positionExists(position)) {
			throw new BoardException("posi��o n�o existe");
		}
		return piece(position) != null;
		
	}
	
}
