package chess;

import bordgame.Board;
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessMatch {
	
	
	private Board board;

	public ChessMatch() {
		board = new Board(8,8);
		initialSetup();
	}
	
	public ChessPiece[][] getPieces(){
		ChessPiece[][] mat = new ChessPiece[board.getRow()][board.getCollumn()];
		for(int i=0; i<board.getRow();i++) {
			for(int j=0; j<board.getCollumn();j++) {
				mat[i][j] = (ChessPiece) board.piece(i, j);
				
			}
		}
		
		
		return mat;
	}
	
	private void planeNewPiece(char column, int row, ChessPiece piece) {
		board.placePiece(piece,new ChessPosition(column, row).toPosition());
	}
	
	private void initialSetup() {
		planeNewPiece('b',6, new Rook(board, Color.WHITE));
		planeNewPiece('e',8, new King(board, Color.BLACK));
		planeNewPiece('e',1, new King(board, Color.WHITE));
	}
}
