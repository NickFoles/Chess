public class Rook extends Piece{
	
	//Constructors
	public Rook(){
		super(0, "rook1.png");
	}
	
	public Rook(int player){
		super(0);
	}
	
	public Rook(int player, String imagepath){
		super(player, imagepath);
	}
	
	//isValidMove
	public boolean isValidMove(Location from, Location to, Piece[][]b){
		boolean finalLocation = false;
        boolean verticalUp = false, verticalDown = false, horizontalLeft = false, horizontalRight = false;

        //This line checks to see if the final destination of the piece contains anything but a friendly piece. This is here, because
        //anything other than a friendly piece would make the move valid, given that every space in between is blank.
        if(b[to.getRow()][to.getColumn()].getPlayer() != b[from.getRow()][from.getColumn()].getPlayer())
            finalLocation = true;
        else
            finalLocation = false;
     
        //verticalUp
        if(from.getColumn() == to.getColumn() && from.getRow() > to.getRow()){
            verticalUp = true;
            for(int i = to.getRow(); i < from.getRow() && verticalUp; i++){
                if(b[i][to.getColumn()].getPlayer() == 0){
                    verticalUp = true;
                }
                else
                    return false;
            }
        }
        //verticalDown
        else if(from.getColumn() == to.getColumn() && from.getRow() < to.getRow()){
        	verticalDown = true;
            for(int i = to.getRow(); i > from.getRow() && verticalDown; i--){
                if(b[i][from.getColumn()].getPlayer() == 0){
                	verticalDown = true;
                }
                else
                	return false;
            }
        }
        
        if(verticalUp || verticalDown && finalLocation){
            return true;
        }
        else
            return false;
	}
}