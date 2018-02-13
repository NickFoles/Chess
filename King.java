
public class King extends Piece {

	public King() {
		this(0);
	}

	public King(int player) {
		this(player, "images2/king1.jpg");
	}

	public King(int player, String imagePath) {
		super(player, imagePath);
	}

	public boolean isValidMove(Location from, Location to, Piece[][] b) {
//		boolean upOrDown = false;
//		boolean rightOrLeft = false;
//		if (Math.abs(from.getColumn() - to.getColumn()) == 1) {
//			rightOrLeft = true;
//		} else if (Math.abs(from.getRow() - to.getRow()) == 1) {
//			upOrDown = true;
//		}
//
//		if (((upOrDown && (to.getColumn() == from.getColumn())) || (rightOrLeft && (to.getRow() == from.getRow()))
//				|| (upOrDown && rightOrLeft)) && (b[from.getRow()][from.getColumn()].getPlayer() != b[to.getRow()][to.getColumn()].getPlayer())) {
//			return true;
//		}
//
//		return false;

		 if ((to.row == (from.row) || to.row == (from.row + 1) || to.row ==
		 (from.row - 1))
		 && (to.column == (from.column) || to.column == (from.column + 1) ||
		 to.column == (from.column - 1))
		 && !(from.row == to.row && from.column == to.column)
		 && b[to.row][to.column].getPlayer() != getPlayer()) {
		 return true;
		 } else {
		 return false;
		 }
	}
		 }
//	}
//}
