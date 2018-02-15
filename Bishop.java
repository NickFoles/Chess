
public class Bishop extends Piece {

	public Bishop() {
		this(1, "images2/bishop1.png");
	}

	public Bishop(int player, String imagePath) {
		super(player, imagePath);
	}

	public boolean isValidMove(Location from, Location to, Piece[][] b) {

		if (Math.abs(from.getColumn() - to.getColumn()) == Math.abs(from.getRow() - to.getRow())
				&& b[to.getRow()][to.getColumn()].getPlayer() != getPlayer()) {

				return true;
		}
		return false;
	}
}
