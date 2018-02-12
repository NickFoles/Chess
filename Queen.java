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
		
		// Did not move
		if(from.getRow() != to.getRow() && from.getColumn() != to.getColumn()) {
			return false;
		}
		
		// Rook movement
		boolean finalLocation = false;

		//This line checks to see if the final destination of the piece contains anything but a friendly piece. This is here, because
		//anything other than a friendly piece would make the move valid, given that every space in between is blank.
		if(b[to.getRow()][to.getColumn()].getPlayer() != b[from.getRow()][from.getColumn()].getPlayer()) 
			finalLocation = true;
		else
			finalLocation = false;
		
		//verticalUp
		if(from.getRow() == to.getRow() && from.getColumn() > to.getColumn()){
			for(int i = to.getColumn(); i < from.getColumn(); i++){
				if(b[to.getRow()][i].getPlayer() == 0 && finalLocation){
					return true;
				}
			}
		}
		//verticalDown
		else if(from.getRow() == to.getRow() && from.getColumn() < to.getColumn()){
			for(int i = from.getColumn(); i < to.getColumn(); i++){
				if(b[from.getRow()][i].getPlayer() == 0 && finalLocation){
					return true;
				}
			}
		}
		//horizontalLeft
		else if(from.getColumn() == to.getColumn() && from.getRow() > to.getRow()){
			for(int i = to.getRow(); i < from.getRow(); i++){
				if(b[i][to.getColumn()].getPlayer() == 0 && finalLocation){
					return true;
				}
			}
		}
		//horizontalRight
		else if(from.getColumn() == to.getColumn() && from.getRow() < to.getRow()){
			for(int i = from.getRow(); i < to.getRow(); i++){
				if(b[i][from.getColumn()].getPlayer() == 0 && finalLocation){
					return true;
				}
			}
		}
		
		// Bishop movement
		boolean upRight = false;
		boolean upLeft = false;
		boolean downRight = false;
		boolean downLeft = false;
		boolean inTheWay = false;

		if (from.getRow() < to.getRow() && from.getColumn() < to.getColumn()) {
			for (int i = from.getRow() - 1; i > to.getRow(); i--) {
				for (int j = from.getColumn() - 1; i > to.getColumn(); i--) {
					if (b[i][j].getPlayer() == 1 || b[i][j].getPlayer() == 2) {
						inTheWay = true;
					} else {
						inTheWay = false;
					}
				}
			}

		} else if (from.getRow() > to.getRow() && from.getColumn() < to.getColumn()) {
			for (int i = from.getRow() - 1; i > to.getRow(); i--) {
				for (int j = from.getColumn() - 1; i < to.getColumn(); i++) {
					if (b[i][j].getPlayer() == 1 || b[i][j].getPlayer() == 2) {
						inTheWay = true;
					} else {
						inTheWay = false;
					}
				}
			}
		} else if (from.getRow() < to.getRow() && from.getColumn() > to.getColumn()) {
			for (int i = from.getRow() - 1; i < to.getRow(); i++) {
				for (int j = from.getColumn() - 1; i > to.getColumn(); i--) {
					if (b[i][j].getPlayer() == 1 || b[i][j].getPlayer() == 2) {
						inTheWay = true;
					} else {
						inTheWay = false;
					}
				}
			}
		} else if (from.getRow() > to.getRow() && from.getColumn() > to.getColumn()) {
			for (int i = from.getRow() - 1; i < to.getRow(); i++) {
				for (int j = from.getColumn() - 1; i < to.getColumn(); i++) {
					if (b[i][j].getPlayer() == 1 || b[i][j].getPlayer() == 2) {
						inTheWay = true;
					} else {
						inTheWay = false;
					}
				}
			}
		}

		if (Math.abs(from.getColumn() - to.getColumn()) == Math.abs(from.getRow() - to.getRow())
				&& b[to.getRow()][to.getColumn()].getPlayer() != getPlayer() && (!inTheWay)) {
			return true;
		}
		
		return false;
	}
}
