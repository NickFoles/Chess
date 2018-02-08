// class: Queen
// written by: Chloe Cowan
// description: 
// date: 1/18/18
public class Queen extends Piece {
	// constructors
	public Queen(int player) {	
		super(player);
		setImageIcon("images/queen1.png");
	}
	
	// method: isValidMove
	// type: boolean
	// parameters: Location from, Location to, Piece [][]b
	// description: Overrides piece's isValidMove method to fit the queen
	public boolean isValidMove(Location from, Location to, Piece[][]b) {
		
		// Did not move
		if(from.getRow() != to.getRow() && from.getColumn() != to.getColumn()) {
			return false;
		}
		
		// Rook movement here
		
		// Bishop movement here
		
		return false;
	}
}