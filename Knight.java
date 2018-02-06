
public class Knight extends Piece {
	public Knight() {
		this(1, "images2/knight1.png");
	}

	public Knight(int player, String imagePath) {
		super(player, imagePath);
	}

	public boolean isValidMove(Location from, Location to, Piece[][] b) {
		boolean vertical1 = false;
		boolean vertical2 = false;
		boolean horizontal1 = false;
		boolean horizontal2 = false;

		if (Math.abs(from.getRow() - to.getRow()) == 1) {
			vertical1 = true;
		} else if (Math.abs(from.getRow() - to.getRow()) == 2) {
			vertical2 = true;
		} else if (Math.abs(from.getColumn() - to.getColumn()) == 1) {
			horizontal1 = true;
		} else if (Math.abs(from.getColumn() - to.getColumn()) == 2) {
			horizontal2 = true;
		}

		if (b[to.getRow()][to.getColumn()].getPlayer() != getPlayer()
				&& ((horizontal1 && vertical2) || (horizontal2 && vertical1))) {
			return true;
		}
		return false;
	}
}
