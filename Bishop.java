
public class Bishop extends Piece {

	public Bishop() {
		this(1, "images2/bishop1.png");
	}

	public Bishop(int player, String imagePath) {
		super(player, imagePath);
	}

	public boolean isValidMove(Location from, Location to, Piece[][] b) {
		if (b[to.row][to.column].getPlayer() == getPlayer() || from.equals(to))
			return false;
		int row;
		int column;

		// up and right
		if (to.getColumn() > from.getColumn() && to.getRow() < from.getRow()
				&& from.getRow() + from.getColumn() == to.getRow() + to.getColumn()) {
			column = from.column;
			System.out.println("a");
			for (row = from.getRow() - 1; row >= 0 && b[row][column + 1].getPlayer() != getPlayer(); row--) {
				column = from.column + from.getRow() - row;
				System.out.println(new Location(row, column));
				if (to.equals(new Location(row, column))) {
					return true;
				}
				else if(b[row][column].getPlayer() == getPlayer() *-1)
					return false;
			}
		}
		// down and left
		else if (to.getColumn() < from.getColumn() && to.getRow() > from.getRow()
				&& from.getRow() + from.getColumn() == to.getRow() + to.getColumn()) {
			column = from.column;
			System.out.println("b");
			for (row = from.getRow() + 1; row < 8 && b[row][column - 1].getPlayer() != getPlayer(); row++) {
				column = from.column + from.getRow() - row;
				System.out.println(new Location(row, column));
				if (to.equals(new Location(row, column))) {
					return true;
				}
				else if(b[row][column].getPlayer() == getPlayer() *-1)
					return false;
			}
			return false;
		}
		// up and left
		else if (to.getColumn() < from.getColumn() && to.getRow() < from.getRow()
				&& from.row - from.column == to.row - to.column) {
			column = from.column;
			System.out.println("c");
			for (row = from.getRow() - 1; row >= 0 && b[row][column - 1].getPlayer() != getPlayer(); row--) {
				column = from.column - from.getRow() + row;
				System.out.println(new Location(row, column) + " " + b[row][column].getPlayer());
				if (to.equals(new Location(row, column))) {
					return true;
				}
				else if(b[row][column].getPlayer() == getPlayer() *-1)
					return false;
			}
			System.out.println(row + ", " + column + " " + b[row][column].getPlayer());
			return false;
		}
		// down and right
		else if (to.getColumn() > from.getColumn() && to.getRow() > from.getRow()
				&& from.row - from.column == to.row - to.column) {
			column = from.column;
			System.out.println("d");
			for (row = from.getRow() + 1; row < 8 && b[row][column + 1].getPlayer() != getPlayer(); row++) {
				column = from.column - from.getRow() + row;
				System.out.println(new Location(row, column));
				if (to.equals(new Location(row, column))) {
					return true;
				}
				else if(b[row][column].getPlayer() == getPlayer() *-1)
					return false;
			}

			return false;
		}
		return false;
	}
}
