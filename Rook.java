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
        boolean verticalUp = false, verticalDown = false, horizontalLeft = false, horizontalRight = false;

        //verticalUp
        if(from.getColumn() == to.getColumn() && from.getRow() > to.getRow()){
            verticalUp = true;
            for(int i = to.getRow()+1; i < from.getRow() && verticalUp; i++){
                if(b[i][to.getColumn()].getPlayer() != 0)
                	verticalUp = false;
            }
        }
        //verticalDown
        else if(from.getColumn() == to.getColumn() && from.getRow() < to.getRow()){
        	verticalDown = true;
            for(int i = to.getRow()-1; i > from.getRow() && verticalDown; i--){
                if(b[i][from.getColumn()].getPlayer() != 0)
                	verticalDown = false;
            }
        }
        //horizontalLeft
        else if(from.getRow() == to.getRow() && from.getColumn() > to.getColumn()){
        	horizontalLeft = true;
        	for(int i = to.getColumn()+1; i < from.getColumn() && horizontalLeft; i++){
        		if(b[from.getRow()][i].getPlayer() != 0)
        			horizontalLeft = false;
        	}
        }
        //horizontalRight
        else if(from.getRow() == to.getRow() && from.getColumn() < to.getColumn()){
        	horizontalRight = true;
        	for(int i = to.getColumn()-1; i > from.getColumn() && horizontalRight; i--){
        		if(b[from.getRow()][i].getPlayer() != 0)
        			horizontalRight = false;
        	}
        }
        
        if(verticalUp || verticalDown || horizontalLeft || horizontalRight && b[to.getRow()][to.getColumn()].getPlayer() != b[from.getRow()][from.getColumn()].getPlayer()){
            return true;
        }
        else
            return false;
	}
}
