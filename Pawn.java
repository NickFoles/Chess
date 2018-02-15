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

	// method: isValidMove
	// type: boolean
	// parameters: Location from, Location to, Piece [][]b
	// description: Overrides piece's isValidMove method to fit the pawn piece
	public boolean isValidMove(Location from, Location to, Piece[][] b) {
		// // White
		// // Initial movement: Two spaces in front or one space in front valid
		// -> if spots are open / desired location is not taken
		// if(getPlayer() == 1 && from.getRow() == 6 &&
		// !(b[to.getRow()][to.getColumn()].getPlayer() == 1) ||
		// b[to.getRow() - 2][to.getColumn()].getPlayer() == 0 || b[to.getRow()
		// - 1][to.getColumn()].getPlayer() == 0) {
		// return true;
		// }

		// // Attacking diagonally - if a black piece is in the position then
		// the move is valid, or if the spot is empty
		// else if(getPlayer() == 1 && b[Math.abs(from.getRow() -
		// to.getRow())][Math.abs(from.getColumn() -
		// to.getColumn())].getPlayer() == 2 ||
		// b[Math.abs(from.getRow() - to.getRow())][Math.abs(from.getColumn() -
		// to.getColumn())].getPlayer() == 0 {
		// return true;
		// }

		// // Black
		// // Initial movement: Two spaces in front or one space in front valid
		// -> if spots are open / desired location is not taken
		// if(getPlayer() == 2 && from.getRow() == 1 &&
		// !(b[to.getRow()][to.getColumn()].getPlayer() == 2) ||
		// b[to.getRow() + 2][to.getColumn()].getPlayer() == 0 || b[to.getRow()
		// + 1][to.getColumn()].getPlayer() == 0) {
		// return true;
		// }

		// // Attacking diagonally - if a white piece is in the position then
		// the move is valid, or if the spot is empty
		// else if(getPlayer() == 2 && b[Math.abs(from.getRow() -
		// to.getRow())][Math.abs(from.getColumn() -
		// to.getColumn())].getPlayer() == 1 ||
		// b[Math.abs(from.getRow() - to.getRow())][Math.abs(from.getColumn() -
		// to.getColumn())].getPlayer() == 0) {
		// return true;
		// }

		// // Code 2
		// if(b[to.row][to.column].getPlayer() == getPlayer())
		// return false;
		// if(getPlayer() == 1 && from.row == 6 && to.getRow() == (from.row - 1
		// | from.row - 2) && from.column == to.column &&
		// b[to.row][to.column].getPlayer() == 0)
		// return true;
		// else if(getPlayer() == 1 && to.getRow() == from.row - 1 &&
		// from.column == to.column && b[to.row][to.column].getPlayer() == 0)
		// return true;
		// else if(getPlayer() == 1 && to.row == from.row - 1 && to.getColumn()
		// == (from.column + 1 | from.column - 1) &&
		// b[to.row][to.column].getPlayer() == 2)
		// return true;
		// else if(getPlayer() == 2 && from.row == 1 && to.getRow() == (from.row
		// + 1 | from.row + 2) && from.column == to.column &&
		// b[to.row][to.column].getPlayer() == 0)
		// return true;
		// else if(getPlayer() == 2 && to.getRow() == from.row + 1 &&
		// from.column == to.column && b[to.row][to.column].getPlayer() == 0)
		// return true;
		// else if(getPlayer() == 2 && to.row == from.row + 1 && to.getColumn()
		// == (from.column + 1 | from.column - 1) &&
		// b[to.row][to.column].getPlayer() == 1)
		// return true;

		// Code 3
		// White
		// Cannot move rows originally
		// if(getPlayer() == 1 && from.getRow() > to.getRow() || to.getRow() >
		// from.getRow()) {
		// return true;
		// }
		//
		// // Not taking a piece
		// else if(getPlayer() == 1 && from.getColumn() == to.getColumn() &&
		// !(b[from.getRow()+1][from.getColumn()].getPlayer() == 0)) {
		// return true;
		// }
		//
		// // Two spaces in beginning or one space in beginning
		// else if(getPlayer() == 1 && Math.abs(to.getRow() - from.getRow()) ==
		// 2 ||
		// getPlayer() == 1 && Math.abs(to.getRow() - from.getRow()) == 1) {
		// return true;
		// }
		//
		// // Taking a piece
		// if(getPlayer() == 1 && Math.abs(to.getColumn() - from.getColumn()) ==
		// 1 || Math.abs(to.getRow() - from.getRow()) == 1 &&
		// b[to.getRow()][to.getColumn()].getPlayer() == 0) {
		// return true;
		// }
		// // Can't get piece if it's just in front
		// else if(b[to.getRow() - 1][to.column].getPlayer() != getPlayer() ||
		// b[to.getRow() - 2][to.getColumn()].getPlayer() != getPlayer()) {
		// return false;
		// }
		//
		// // Black
		// // Cannot move rows originally
		// if(getPlayer() == 2 && from.getRow() > to.getRow() || to.getRow() >
		// from.getRow()) {
		// return true;
		// }
		//
		// // Not taking a piece
		// else if(getPlayer() == 2 && from.getColumn() == to.getColumn() &&
		// !(b[from.getRow()+1][from.getColumn()].getPlayer() == 0)) {
		// return true;
		// }
		//
		// // Two spaces in beginning or one space in beginning
		// else if(getPlayer() == 2 && Math.abs(to.getRow() - from.getRow()) ==
		// 2 ||
		// getPlayer() == 2 && Math.abs(to.getRow() - from.getRow()) == 1) {
		// return true;
		// }
		//
		// // Taking a piece
		// if(getPlayer() == 2 && Math.abs(to.getColumn() - from.getColumn()) ==
		// 1 || Math.abs(to.getRow() - from.getRow()) == 1 &&
		// b[to.getRow()][to.getColumn()].getPlayer() == 0) {
		// return true;
		// }
		// // Can't get piece if it's just in front
		// else if(b[to.getRow() + 1][to.column].getPlayer() != getPlayer() ||
		// b[to.getRow() + 2][to.getColumn()].getPlayer() != getPlayer()) {
		// return false;
		// }
		//
		
		
		
		
		
		// return false;
		System.out.println("cheese" + b[to.row][to.column].getPlayer());
		if (b[to.row][to.column].getPlayer() == getPlayer()){
			System.out.println("FALSE");
			return false;
		}
		
		// this works
		 if (getPlayer() == 1
					&& (to.equals(new Location(from.row + 1, from.column - 1))
							|| to.equals(new Location(from.row + 1, from.column + 1)))
					&& !(b[to.row][to.column].getPlayer() == -1)){
				System.out.println("falSE");
				return false;
			}
			// this is the code for attacking, the third portion of the compound
			// boolean part isn't working right and idk why
			else if (getPlayer() == 1
					&& (to.equals(new Location(from.row + 1, from.column - 1))
							|| to.equals(new Location(from.row + 1, from.column + 1)))
					&& (b[to.row][to.column].getPlayer() == -1)){
				System.out.println("tRRue");
				return true;
			}
		else if (getPlayer() == 1 && !(to.equals(new Location(from.row + 1, from.column))
				|| to.equals(new Location(from.row + 2, from.column))
				|| to.equals(new Location(from.row + 1, from.column - 1))
				|| to.equals(new Location(from.row + 1, from.column + 1)))){
			System.out.println("FAlse");
			return false;
		
		}
		else if (getPlayer() == 1 && to.equals(new Location(from.row + 2, from.column)) && from.row != 1
				/*|| b[to.row][to.column].getPlayer() != 0*/){
			System.out.println("fALse");
			return false;
			
		}
		else if (getPlayer() == 1 && to.equals(new Location(from.row + 1, from.column))
				&& b[to.row][to.column].getPlayer() != 0){
			System.out.println("faLSe");
			return false;
		}

	
	
	
		
		// this works
		else if (getPlayer() == -1
					&& (to.equals(new Location(from.row - 1, from.column - 1))
							|| to.equals(new Location(from.row + 1, from.column - 1)))
					&& !(b[to.row][to.column].getPlayer() > 0)){
				System.out.println("FalsE");
				return false;
			}
		// same problem as above
			else if (getPlayer() == -1
					&& (to.equals(new Location(from.row - 1, from.column - 1))
							|| to.equals(new Location(from.row + 1, from.column - 1)))
					&& (b[to.row][to.column].getPlayer() == 1)){
				System.out.println("true");
				return true;
			}
			
		else if (getPlayer() == -1 && !(to.equals(new Location(from.row - 1, from.column))
				|| to.equals(new Location(from.row - 2, from.column))
				|| to.equals(new Location(from.row - 1, from.column - 1))
				|| to.equals(new Location(from.row - 1, from.column + 1)))){
			System.out.println("fAlse");
			return false;
		}
		else if (getPlayer() == -1 && to.equals(new Location(from.row - 2, from.column))  && from.row != 6
				|| b[to.row][to.column].getPlayer() != 0){
			System.out.println("faLse");
			return false;
		}
		else if (getPlayer() == -1 && to.equals(new Location(from.row - 1, from.column))
				&& b[to.row][to.column].getPlayer() != 0){
			System.out.println("falSe");
			return false;
		}
		else if((getPlayer() == -1) && (to.equals(new Location(from.row + 1, from.column+1))) && b[to.row][to.column].getPlayer() ==0){
			System.out.println("fAlSe");
		return false;
		}
	
		System.out.println("True");
		return true;
		
	}
}
____________________________________________
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

	// method: isValidMove
	// type: boolean
	// parameters: Location from, Location to, Piece [][]b
	// description: Overrides piece's isValidMove method to fit the pawn piece
	public boolean isValidMove(Location from, Location to, Piece[][] b) {

		// return false;
		System.out.println("cheese" + b[to.row][to.column].getPlayer());
		if (b[to.row][to.column].getPlayer() == getPlayer()) {
			System.out.println("FALSE");
			return false;
		}

		// this works
		if (getPlayer() == 1
				&& (to.equals(new Location(from.row + 1, from.column - 1))
						|| to.equals(new Location(from.row + 1, from.column + 1)))
				&& !(b[to.row][to.column].getPlayer() == -1)) {
			System.out.println("falSE");
			return false;
		}
		// this is the code for attacking, the third portion of the compound
		// boolean part isn't working right and idk why
		else if (getPlayer() == 1
				&& (to.equals(new Location(from.row + 1, from.column - 1))
						|| to.equals(new Location(from.row + 1, from.column + 1)))
				&& (b[to.row][to.column].getPlayer() == -1)) {
			System.out.println("tRRue");
			return true;
		} else if (getPlayer() == 1 && !(to.equals(new Location(from.row + 1, from.column))
				|| to.equals(new Location(from.row + 2, from.column))
				|| to.equals(new Location(from.row + 1, from.column - 1))
				|| to.equals(new Location(from.row + 1, from.column + 1)))) {
			System.out.println("FAlse");
			return false;

		} else if (getPlayer() == 1 && to.equals(new Location(from.row, from.column + 2)) && from.column != 1
		/* || b[to.row][to.column].getPlayer() != 0 */) {
			System.out.println("fALse");
			return false;

		} else if (getPlayer() == 1 && to.equals(new Location(from.row + 1, from.column))
				&& b[to.row][to.column].getPlayer() != 0) {
			System.out.println("faLSe");
			return false;
		}

		else if (getPlayer() == 1 && to.equals(new Location(from.row + 2, from.column)) && from.row != 1
				|| b[to.row][to.column].getPlayer() != 0) {
			System.out.println("faLSEE");
			return false;
		}

		else if (getPlayer() == -1 && (to.equals(new Location(from.row - 1, from.column + 1))

		/* && (b[to.row][to.column].getPlayer() != 1) */)) {
			System.out.println("FalsE");
			return false;
		}

		// this works
		else if (getPlayer() == -1
				&& (to.equals(new Location(from.row - 1, from.column - 1))
						|| to.equals(new Location(from.row + 1, from.column - 1)))
				&& !(b[to.row][to.column].getPlayer() == 1)) {
			System.out.println("FalsE");
			return false;
		}

		// same problem as above
		else if (getPlayer() == -1
				&& (to.equals(new Location(from.row - 1, from.column - 1))
						|| to.equals(new Location(from.row + 1, from.column - 1)))
				&& (b[to.row][to.column].getPlayer() == 1)) {
			System.out.println("true");
			return true;
		}

		else if (getPlayer() == -1 && !(to.equals(new Location(from.row - 1, from.column))
				|| to.equals(new Location(from.row - 2, from.column))
				|| to.equals(new Location(from.row - 1, from.column - 1))
				|| to.equals(new Location(from.row - 1, from.column + 1)))) {
			System.out.println("fAlse");
			return false;
		} else if (getPlayer() == -1 && to.equals(new Location(from.row - 2, from.column)) && from.row != 6
				|| b[to.row][to.column].getPlayer() != 0) {
			System.out.println("faaaLse");
			return false;
		} else if (getPlayer() == -1 && to.equals(new Location(from.row - 1, from.column))
				&& b[to.row][to.column].getPlayer() != 0) {
			System.out.println("falSe");
			return false;
		} else if ((getPlayer() == -1) && (to.equals(new Location(from.row + 1, from.column + 1)))
				&& b[to.row][to.column].getPlayer() == 0) {
			System.out.println("fAlSe");
			return false;
		}

		System.out.println("TruE");
		return true;

	}
}
