
public class Bishop extends Piece {

	public Bishop() {
		this(1, "images2/bishop1.png");
	}

	public Bishop(int player, String imagePath) {
		super(player, imagePath);
	}

	public boolean isValidMove(Location from, Location to, Piece[][] b) {
		boolean upRight = false;
		boolean upLeft = false;
		boolean downRight = false;
		boolean downLeft = false;
		boolean inTheWay = false;

		if (from.getRow() < to.getRow() && from.getColumn() < to.getColumn()) {
			for (int i = from.getRow() - 1; i > to.getRow(); i--) {
				for (int j = from.getColumn() - 1; i > to.getColumn(); i--) {
					if (b[i][j].getPlayer() == 1 || b[i][j].getPlayer() == 2) {
						inTheWay = true;
					} else {
						inTheWay = false;
					}
				}
			}

		} else if (from.getRow() > to.getRow() && from.getColumn() < to.getColumn()) {
			for (int i = from.getRow() - 1; i > to.getRow(); i--) {
				for (int j = from.getColumn() - 1; i < to.getColumn(); i++) {
					if (b[i][j].getPlayer() == 1 || b[i][j].getPlayer() == 2) {
						inTheWay = true;
					} else {
						inTheWay = false;
					}
				}
			}
		} else if (from.getRow() < to.getRow() && from.getColumn() > to.getColumn()) {
			for (int i = from.getRow() - 1; i < to.getRow(); i++) {
				for (int j = from.getColumn() - 1; i > to.getColumn(); i--) {
					if (b[i][j].getPlayer() == 1 || b[i][j].getPlayer() == 2) {
						inTheWay = true;
					} else {
						inTheWay = false;
					}
				}
			}
		} else if (from.getRow() > to.getRow() && from.getColumn() > to.getColumn()) {
			for (int i = from.getRow() - 1; i < to.getRow(); i++) {
				for (int j = from.getColumn() - 1; i < to.getColumn(); i++) {
					if (b[i][j].getPlayer() == 1 || b[i][j].getPlayer() == 2) {
						inTheWay = true;
					} else {
						inTheWay = false;
					}
				}
			}
		}

		if (Math.abs(from.getColumn() - to.getColumn()) == Math.abs(from.getRow() - to.getRow())
				&& b[to.getRow()][to.getColumn()].getPlayer() != getPlayer() && (!inTheWay)) {
			return true;
		}

		return false;
	}

}
