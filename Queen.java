// class: Queen
// written by: Chloe Cowan
// description: 
// date: 1/18/18
public class Queen extends Piece {
	// constructors
	public Queen(){
		super(0, "images/queen1.png");
	}
	
	public Queen(int player){
		super(0);
	}
	
	public Queen(String imagepath, int player){
		super(player, imagepath);
	}
	
	// method: isValidMove
	// type: boolean
	// parameters: Location from, Location to, Piece [][]b
	// description: Overrides piece's isValidMove method to fit the queen
	public boolean isValidMove(Location from, Location to, Piece[][]b) {

		return false;
	}
}
