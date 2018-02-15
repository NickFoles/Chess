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
		else if (getPlayer() == 1 && to.equals(new Location(from.row + 1, from.column))
				&& b[to.row][to.column].getPlayer() != 0){
			System.out.println("faLSe");
			return false;
		}

	
	
	
		
		// this works
		else if (getPlayer() == -1
					&& (to.equals(new Location(from.row - 1, from.column - 1))
							|| to.equals(new Location(from.row + 1, from.column - 1)))
					&& (b[to.row][to.column].getPlayer() != 1)){
				System.out.println("False");
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

		else if (getPlayer() == -1 && to.equals(new Location(from.row - 1, from.column))
				&& b[to.row][to.column].getPlayer() != 0){
			System.out.println("falSe");
			return false;
		}
		
		
	
		System.out.println("True");
		return true;
		
	}
}
