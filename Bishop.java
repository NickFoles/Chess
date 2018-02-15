
public class Bishop extends Piece {

	public Bishop() {
		this(1, "images2/bishop1.png");
	}

	public Bishop(int player, String imagePath) {
		super(player, imagePath);
	}

	public boolean isValidMove(Location from, Location to, Piece[][] b) {
		if(b[to.row][to.column].getPlayer() == getPlayer() || from.equals(to))
			return false;
		int row;
		int column;

		//up and right
		if(to.getColumn()>from.getColumn() && to.getRow()<from.getRow() && from.getRow() + from.getColumn() == to.getRow() + to.getColumn()){
			column = from.column + 1;
			System.out.println("a");
			for(row = from.getRow() - 1; row >= 0 && b[row][column].getPlayer() == 0; row--){
				column = from.column + from.getRow() - row;
				System.out.println(new Location(row, column));
				if(to.equals(new Location(row, column))){
					return true;
				}
			}
		}				
		//down and left
		else if (to.getColumn()<from.getColumn() && to.getRow()>from.getRow() && from.getRow() + from.getColumn() == to.getRow() + to.getColumn()){
			column = from.column - 1;
			System.out.println("b");
			for(row = from.getRow() + 1; row < 8 && b[row][column].getPlayer() == 0; row++){
				column = from.column + from.getRow() - row;
				System.out.println(new Location(row, column));
				if(to.equals(new Location(row, column))){
					return true;
				}	
			}
			return false;
		}
		//up and left
		else if (to.getColumn()<from.getColumn() && to.getRow()<from.getRow() && from.row - from.column == to.row - to.column){
			column = from.column - 1;
			System.out.println("c");
			for(row = from.getRow() - 1; row >= 0 && b[row][column].getPlayer() == 0; row--){
				column = from.column + from.getRow() - row;
				System.out.println(new Location(row, column));
				if(to.equals(new Location(row, column))){
					return true;
				}
			}	
			return false;
		}
		//down and right
		else if(to.getColumn()>from.getColumn() && to.getRow()>from.getRow() && from.row - from.column == to.row - to.column){
			column = from.column + 1;
			System.out.println("d");
			for(row = from.getRow() + 1; row < 8 && b[row][column].getPlayer() == 0; row++){
				column = from.column - from.getRow() + row;
				System.out.println(new Location(row, column));
				if(to.equals(new Location(row, column))){
					return true;
				}
			}
			return false;
		}
		return false;
	}
}
