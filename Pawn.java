// class: Pawn
// written by: Chloe Cowan
// description: Pawn piece for chess
// date: 2/5/18

public class Pawn extends Piece {
	// constructors
	public Pawn(int player) {
		super(player);
		setImageIcon("images/pawn1.jpg");
	}

	// method: isValidMove
	// type: boolean
	// parameters: Location from, Location to, Piece [][]b
	// description: Overrides piece's isValidMove method to fit the pawn piece
	public boolean isValidMove(Location from, Location to, Piece[][]b) {
		// White
		// Initial movement: Two spaces in front or one space in front valid -> if spots are open / desired location is not taken
		if(getPlayer() == 1 && from.getRow() == 6 && !(b[to.getRow()][to.getColumn()].getPlayer() == 1) ||
				b[to.getRow()][to.getColumn() - 2] == null || b[to.getRow()][to.getColumn() - 1] == null) {
			return true;
		}

		// Attacking diagonally - if a black piece is in the position then the move is valid, or if the spot is empty
		else if(getPlayer() == 1 && b[Math.abs(from.getRow() - to.getRow())][Math.abs(from.getColumn() - to.getColumn())].getPlayer() == 2 || 
				b[Math.abs(from.getRow() - to.getRow())][Math.abs(from.getColumn() - to.getColumn())] == null) {
			return true;
		}

		// Black
		// Initial movement: Two spaces in front or one space in front valid -> if spots are open / desired location is not taken
		if(getPlayer() == 2 && from.getRow() == 1 && !(b[to.getRow()][to.getColumn()].getPlayer() == 2) || 
				b[to.getRow()][to.getColumn() + 2] == null || b[to.getRow()][to.getColumn() + 1] == null) {
			return true;
		}

		// Attacking diagonally - if a white piece is in the position then the move is valid, or if the spot is empty
		else if(getPlayer() == 2 && b[Math.abs(from.getRow() - to.getRow())][Math.abs(from.getColumn() - to.getColumn())].getPlayer() == 1 || 
				b[Math.abs(from.getRow() - to.getRow())][Math.abs(from.getColumn() - to.getColumn())] == null) {
			return true;
		}

		return false;
	}
}