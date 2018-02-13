// class: Pawn
// written by: Chloe Cowan
// description: Pawn piece for chess
// date: 2/5/18

public class Pawn extends Piece {
	// constructors
	public Pawn(){
		super(0, "images/pawn1.png");
	}
	public Pawn(int player){
		super(0);
	}
	public Pawn(int player, String imagepath){
		super(player, imagepath);
	}

	// method: isValidMove
	// type: boolean
	// parameters: Location from, Location to, Piece [][]b
	// description: Overrides piece's isValidMove method to fit the pawn piece
	public boolean isValidMove(Location from, Location to, Piece[][]b) {
// 		// White
// 		// Initial movement: Two spaces in front or one space in front valid -> if spots are open / desired location is not taken
// 		if(getPlayer() == 1 && from.getRow() == 6 && !(b[to.getRow()][to.getColumn()].getPlayer() == 1) ||
// 				b[to.getRow() - 2][to.getColumn()].getPlayer() == 0 || b[to.getRow() - 1][to.getColumn()].getPlayer() == 0) {
// 			return true;
// 		}

// 		// Attacking diagonally - if a black piece is in the position then the move is valid, or if the spot is empty
// 		else if(getPlayer() == 1 && b[Math.abs(from.getRow() - to.getRow())][Math.abs(from.getColumn() - to.getColumn())].getPlayer() == 2 || 
// 				b[Math.abs(from.getRow() - to.getRow())][Math.abs(from.getColumn() - to.getColumn())].getPlayer() == 0 {
// 			return true;
// 		}

// 		// Black
// 		// Initial movement: Two spaces in front or one space in front valid -> if spots are open / desired location is not taken
// 		if(getPlayer() == 2 && from.getRow() == 1 && !(b[to.getRow()][to.getColumn()].getPlayer() == 2) || 
// 				b[to.getRow() + 2][to.getColumn()].getPlayer() == 0 || b[to.getRow() + 1][to.getColumn()].getPlayer() == 0) {
// 			return true;
// 		}

// 		// Attacking diagonally - if a white piece is in the position then the move is valid, or if the spot is empty
// 		else if(getPlayer() == 2 && b[Math.abs(from.getRow() - to.getRow())][Math.abs(from.getColumn() - to.getColumn())].getPlayer() == 1 || 
// 				b[Math.abs(from.getRow() - to.getRow())][Math.abs(from.getColumn() - to.getColumn())].getPlayer() == 0) {
// 			return true;
// 		}
		
			// Code 2
			if(b[to.row][to.column].getPlayer() == getPlayer())
			return false;
		if(getPlayer() == 1 && from.row == 6 && to.getRow() == (from.row - 1 | from.row - 2) && from.column == to.column && b[to.row][to.column].getPlayer() == 0)
				return true;
		else if(getPlayer() == 1 && to.getRow() == from.row - 1 && from.column == to.column && b[to.row][to.column].getPlayer() == 0)
			return true;
		else if(getPlayer() == 1 && to.row == from.row - 1 && to.getColumn() == (from.column + 1 | from.column - 1) && b[to.row][to.column].getPlayer() == 2)
			return true;
		else if(getPlayer() == 2 && from.row == 1 && to.getRow() == (from.row + 1 | from.row + 2) && from.column == to.column && b[to.row][to.column].getPlayer() == 0)
				return true;
		else if(getPlayer() == 2 && to.getRow() == from.row + 1 && from.column == to.column && b[to.row][to.column].getPlayer() == 0)
			return true;
		else if(getPlayer() == 2 && to.row == from.row + 1 && to.getColumn() == (from.column + 1 | from.column - 1) && b[to.row][to.column].getPlayer() == 1)
			return true;
		
		return false;
	}
}
