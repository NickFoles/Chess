//Class: King
//Written by: Jeffrey Lipson
//Date: 12/14/18
//Description: This class defines the King piece in a game of chess. If a player tries to make a move that isn't within the rules of the game, they will not be
//				able to. This does not include check.
public class King extends Piece {
	
	//Constructors
	public King() {
		this(0);
	}

	public King(int player) {
		this(player, "images2/king1.jpg");
	}

	public King(int player, String imagePath) {
		super(player, imagePath);
	}

	// Method: isValidMove
	// Return Type: boolean - if it is a valid move, returns true
	//						  if invalid move, returns false
	// Parameters: Location from - location where King begins
	//			   Location to - location King wants to move to
	//			   Piece [][]b - the 2D array that contains the pieces for the board
	// Description: Overrides piece class' isValidMove method so it is accurate for the King piece
	public boolean isValidMove(Location from, Location to, Piece[][] b) {
		if ((to.row == (from.row) || to.row == (from.row + 1) || to.row == (from.row - 1))								//First, checks to see which way the king is going, horizontally speaking.
				&& (to.column == (from.column) || to.column == (from.column + 1) || to.column == (from.column - 1))		//Then checks the up-and-down...
				&& !(from.row == to.row && from.column == to.column)													//and then makes sure that the piece isn't just staying in place.
				&& b[to.row][to.column].getPlayer() != getPlayer()) {													//Lastly, it checks the destination to make sure it's either an
																														//opposing piece or a blank space.
			return true;
		} else {
			return false;
		}
	}
}
