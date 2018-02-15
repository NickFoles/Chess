public class Rook extends Piece {

	public Rook() {
		super(0, "rook1.png");
	}

	public Rook(int player) {
		super(0);
	}

	public Rook(int player, String imagepath) {
		super(player, imagepath);
	}

	public boolean isValidMove(Location from, Location to, Piece[][] b){
		boolean finalLocation = false;
		boolean verticalUp = false, verticalDown = false, horizontalLeft = false, horizontalRight = false;

		//This line checks to see if the final destination of the piece contains anything but a friendly piece. This is here, because
		//anything other than a friendly piece would make the move valid, given that every space in between is blank.
		if(b[to.getRow()][to.getColumn()].getPlayer() != b[from.getRow()][from.getColumn()].getPlayer())
			finalLocation = true;
		else
			finalLocation = false;
		
		//horizontal left
		if(from.getRow() == to.getRow() && from.getColumn() > to.getColumn()){
			for(int i = to.getColumn(); i <= from.getColumn(); i++){
				if(b[to.getRow()][i].getPlayer() != 0){
					horizontalLeft = false;
				}
				else
					horizontalLeft = true;
			}
		}
		//horizontal right
		else if(from.getRow() == to.getRow() && from.getColumn() < to.getColumn()){
			for(int i = from.getColumn(); i <= to.getColumn(); i++){
				if(b[from.getRow()][i].getPlayer() != 0){
					horizontalRight = false;
				}
				else
					horizontalRight = true;
			}
		}
		//vertical up
		else if(from.getColumn() == to.getColumn() && from.getRow() > to.getRow()){
			for(int i = to.getRow(); i <= from.getRow(); i++){
				if(b[i][to.getColumn()].getPlayer() != 0){
					verticalUp = false;
				}
				else
					verticalUp = true;
			}
		}
		//vertical down
		else if(from.getColumn() == to.getColumn() && from.getRow() < to.getRow()){
			for(int i = from.getRow(); i <= to.getRow()+1; i++){
				if(b[i][from.getColumn()].getPlayer() != 0){
					verticalDown = false;
				}
				
				else
					verticalDown = true;
			}
		}
		
		
		if((verticalUp || verticalDown || horizontalLeft || horizontalRight) && finalLocation){
			return true;
		}
		else
			return false;
	
	}
}
