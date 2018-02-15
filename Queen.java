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
		// Bishop
		boolean pieceInWay = true;
		int direction =0; 
		boolean finalLocation = false;
		boolean verticalUp = false, verticalDown = false, horizontalLeft = false, horizontalRight = false;
		
		if(to.getColumn()>from.getColumn() && to.getRow()<from.getRow()){
			direction = 1;
		}
		else if (to.getColumn()<from.getColumn() && to.getRow()>from.getRow()){
			direction = 2;
		}
		else if (to.getColumn()<from.getColumn() && to.getRow()<from.getRow()){
			direction = 4;
		}
		else
			direction = 3;	
		
		
		if (Math.abs(from.getColumn() - to.getColumn()) == Math.abs(from.getRow() - to.getRow())
				&& b[to.getRow()][to.getColumn()].getPlayer() != getPlayer()
				&& !pieceInWay/*b[to.getRow()][to.getColumn()].getPlayer() == 0 b[from.getRow()+1][from.getColumn()+1]*/) {

			return true;
		}
		
		// Rook

		//This line checks to see if the final destination of the piece contains anything but a friendly piece. This is here, because
		//anything other than a friendly piece would make the move valid, given that every space in between is blank.
		if(b[to.getRow()][to.getColumn()].getPlayer() != b[from.getRow()][from.getColumn()].getPlayer())
			finalLocation = true;
		else
			finalLocation = false;
		
		//verticalUp
		if(from.getRow() == to.getRow() && from.getColumn() > to.getColumn()){
			verticalUp = true;
			for(int i = to.getColumn(); i < from.getColumn() && verticalUp; i++){
				if(b[to.getRow()][i].getPlayer() == 0 && verticalUp){
					verticalUp = true;
				}
				else
					verticalUp = false;
			}
		}
		//verticalDown
		else if(from.getRow() == to.getRow() && from.getColumn() < to.getColumn()){
			verticalDown = true;
			for(int i = from.getColumn(); i < to.getColumn() && verticalDown; i++){
				if(b[from.getRow()][i].getPlayer() == 0 && verticalDown){
					verticalDown = true;
				}
				else
					verticalDown = false;
			}
		}
		//horizontalLeft
		else if(from.getColumn() == to.getColumn() && from.getRow() > to.getRow()){
			horizontalLeft = true;
			for(int i = to.getRow(); i < from.getRow() && horizontalLeft; i++){
				if(b[i][to.getColumn()].getPlayer() == 0 && horizontalLeft){
					horizontalLeft = true;
				}
				else
					horizontalLeft = false;
			}
		}
		//horizontalRight
		else if(from.getColumn() == to.getColumn() && from.getRow() < to.getRow()){
			horizontalRight = true;
			for(int i = from.getRow(); i < to.getRow() && horizontalRight; i++){
				if(b[i][from.getColumn()].getPlayer() == 0 && horizontalRight){
					horizontalRight = true;
				}
				else
					horizontalRight = false;
			}
		}
		
		if(verticalUp || verticalDown || horizontalLeft || horizontalRight && finalLocation){
			return true;
		}
		
		return false;
	}
}
