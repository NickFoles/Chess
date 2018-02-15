// Class: Rook
// Written by: Eun Won Chae
// Date: 2/14/18
// Description: The literal and metaphorical cancer of this earth
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
		//These booleans are going to be set to true if there aren't any pieces in between the origin and destination.
        boolean verticalUp = false, verticalDown = false, horizontalLeft = false, horizontalRight = false;

       //verticalUp -- This if statement determines whether or not a move is valid when the Rook tries to move upwards.
        if(from.getColumn() == to.getColumn() && from.getRow() > to.getRow()){		//If the column of both locations are the same, this implies that the piece is moving vertically. 
        																			//From here, if the row value of the origin is greater than the destination's, it means the piece starts
        																			//low and goes up.
        	
            for(int i = to.getRow()+1; i < from.getRow() && verticalUp; i++){		//Starts the check from one square shy of the destination. If all of the squares in between are blank,
                if(b[i][to.getColumn()].getPlayer() == 0)							//boolean verticalUp is set to true.
                	verticalUp = true;
            }
        }
        
        
        
        //verticalDown -- This if statement determines whether or not a move is valid when the Rook tries to move downwards.
        else if(from.getColumn() == to.getColumn() && from.getRow() < to.getRow()){	//Same thing as above, except that the piece starts higher and goes downwards.
        	
            for(int i = to.getRow()-1; i > from.getRow() && verticalDown; i--){		//Starts the check from one square shy of the destination. If all of the squares in between are blank,
                if(b[i][from.getColumn()].getPlayer() == 0)							//boolean verticalDown is set to true.
                	verticalDown = true;
            }
        }
        
        
        
        //horizontalLeft -- This if statement determines whether or not a move is valid when the Rook tries to move to the left.
        else if(from.getRow() == to.getRow() && from.getColumn() > to.getColumn()){	//If the row of both locations are the same, this implies that the piece is moving horizontally.
        																			//From here, if the column value of the origin is greater than the destination's, it means the piece starts
        																			//off to the right and goes left.
        	
        	for(int i = to.getColumn()+1; i < from.getColumn() && horizontalLeft; i++){		//Starts the check from one square shy of the destination. If all of the squares in between are
        		if(b[from.getRow()][i].getPlayer() == 0)									//blank, boolean horizontalLeft is set to true.
        			horizontalLeft = true;
        	}
        }
        
        
        
        //horizontalRight -- This if statement determines whether or not a move is valid when the Rook tries to move to the right.
        else if(from.getRow() == to.getRow() && from.getColumn() < to.getColumn()){	//Same thing as horizontalLeft, just it's moving right this time.
        	for(int i = to.getColumn()-1; i > from.getColumn() && horizontalRight; i--){	//Starts the check from one square shy of the destination. If all of the squares in between are
        		if(b[from.getRow()][i].getPlayer() == 0)									//blank, boolean horizontalLeft is set to true.
        			horizontalRight = true;
        	}
        }
        
        //This if statement checks to see if any one of the four directional booleans are true, along with whether or not the player value of the destination isn't the same as the piece
        //you're trying to move. If this player value isn't the same, this means it's either a blank square or an enemy piece, making the move valid.
        if(verticalUp || verticalDown || horizontalLeft || horizontalRight && b[to.getRow()][to.getColumn()].getPlayer() != b[from.getRow()][from.getColumn()].getPlayer()){
            return true;
        }
        //If any of the conditions don't match, the method returns false.
        else
            return false;
	}
}
