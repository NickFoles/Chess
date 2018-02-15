// class: Pawn
// written by: Chloe Cowan
// description: Pawn piece for chess
// date: 2/5/18

public class Pawn extends Piece {
	// constructors
	public Pawn() {
		super(0, "images/pawn1.png");
	}

	public Pawn(int player) {
		super(0);
	}

	public Pawn(int player, String imagepath) {
		super(player, imagepath);
	}

	public boolean isValidMove(Location from, Location to, Piece[][] b) {
	
	if(b[to.row][to.column].getPlayer() == getPlayer()) {
			return false;
		}

		// Cannot move rows originally
		if(from.getRow() == to.getRow() && from.getColumn() < to.getColumn() || from.getColumn() > to.getColumn()) {
			return false;
		}
		
		// White
		// Not taking a piece
		else if(getPlayer() == 1 && from.getColumn() == to.getColumn() && !(b[from.getRow()+1][from.getColumn()].getPlayer() == 0)) {
			return true;
		}

		// Two spaces in beginning or one space in beginning
		else if(getPlayer() == 1 && Math.abs(to.getRow() - from.getRow()) == 2 ||
				getPlayer() == 1 && Math.abs(to.getRow() - from.getRow()) == 1 && !(to.getRow() > from.getRow() - 2)) {
			return true;
		}

		// Taking a piece
		if(getPlayer() == 1 && Math.abs(to.getColumn() - from.getColumn()) == 1 || Math.abs(to.getRow() - from.getRow()) == 1 &&
				b[to.getRow()][to.getColumn()].getPlayer() == 0) {
			return true;
		}
		// Can't get opposing piece if it's just in front
		else if(b[to.getRow() - 1][to.column].getPlayer() != getPlayer() || b[to.getRow() - 2][to.getColumn()].getPlayer() != getPlayer()) {
			return true;
		}
		// Can't go backwards
		else if(getPlayer() == 1 && to.getRow() > from.getRow()) {
			return false;
		}

		// Black
		// Not taking a piece
		else if(getPlayer() == 2 && from.getColumn() == to.getColumn() && !(b[from.getRow()+1][from.getColumn()].getPlayer() == 0)) {
			return true;
		}

		// Two spaces in beginning or one space in beginning
		else if(getPlayer() == 2 && Math.abs(to.getRow() - from.getRow()) == 2 ||
				getPlayer() == 2 && Math.abs(to.getRow() - from.getRow()) == 1 && !(to.getRow() > from.getRow() + 2)) {
			return true;
		}

		// Taking a piece
		if(getPlayer() == 2 && Math.abs(to.getColumn() - from.getColumn()) == 1 || Math.abs(to.getRow() - from.getRow()) == 1 &&
				b[to.getRow()][to.getColumn()].getPlayer() == 0) {
			return true;
		}
		// Can't get opposing piece if it's just in front
		else if(b[to.getRow() + 1][to.getColumn()].getPlayer() != getPlayer() || b[to.getRow() + 2][to.getColumn()].getPlayer() != getPlayer()) {
			return false;
		}

		// Can't move backwards
		else if(getPlayer() == 2 && to.getRow() < from.getRow()) {
			return false;
		}
		return false;
	}	
}
