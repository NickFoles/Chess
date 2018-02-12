
public class King extends Piece{

	public King(){
		this(0);
	}
	public King(int player){
		this(player, "images2/king1.jpg");
	}
	public King(int player, String imagePath){
		super(player, imagePath);
	}

	public boolean isValidMove(Location from, Location to, Piece[][]b){
		if((to.row == (from.row) || to.row == (from.row + 1) || to.row == (from.row - 1)) && (to.column == (from.column) || to.column == (from.column + 1) || to.column == (from.column - 1)) && !(from.row == to.row && from.column == to.column)  && b[to.row][to.column].getPlayer() != getPlayer()){
			return true;
		}
		else{
			return false;
		}
	}
}
