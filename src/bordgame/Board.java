package bordgame;

public class Board {
	private int row;
	private int collumn;
	private Piece[][] pieces;
	
	
	public Board(int row, int collumn) {
		this.row = row;
		this.collumn = collumn;
		pieces = new Piece[row][collumn ];
	}


	public int getRow() {
		return row;
	}


	public void setRow(int row) {
		this.row = row;
	}


	public int getCollumn() {
		return collumn;
	}


	public void setCollumn(int collumn) {
		this.collumn = collumn;
	}
	
	
	public Piece piece(int row, int column){
		return pieces[row][column];
		
	}
	public Piece piece(Position position){
		return pieces[position.getRow()][position.getCollumn()];
		
	}
}
