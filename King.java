
public class King extends Piece{


	public King(int player){

	}

	public boolean isValidMove(Location from, Location to, Piece[][]b){
		try{
			if((to.row == (from.row) || to.row == (from.row + 1) || to.row == (from.row - 1)) && (to.column == (from.column) || to.column == (from.column + 1) || to.column == (from.column - 1)) && !(from.row == to.row && from.column == to.column)  && b[to.row][to.column].getPlayer() != player){
				return true;
			}
			else{
				return false;
			}
		}catch(NullPointerException e){
			if((to.row == (from.row) || to.row == (from.row + 1) || to.row == (from.row - 1)) && (to.column == (from.column) || to.column == (from.column + 1) || to.column == (from.column - 1)) && !(from.row == to.row && from.column == to.column)){
				return true;
			}
			else{
				return false;
			}
		}
	}
}
