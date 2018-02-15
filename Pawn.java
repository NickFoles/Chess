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
	
		return true;
	}
}
