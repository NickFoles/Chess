
public class Knight extends Piece {
	public Knight() {
		this(1, "images2/knight1.png");
	}

	public Knight(int player, String imagePath) {
		super(player, imagePath);
	}

	public boolean isValidMove(Location from, Location to, Piece[][] b) {
		int row = Math.abs(from.getRow() - to.getRow());
		int col = Math.abs(from.getColumn() - to.getColumn());
		if(((row == 2 && col == 1) || (row == 1 && col == 2))&& b[to.getRow()][to.getColumn()].getPlayer()!=getPlayer()){
			return true;
		}
		return false;
	}
}
