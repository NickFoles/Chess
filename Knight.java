
public class Knight extends Piece{
	public Knight() {
		this(1, "images2/knight1.png");
	}

	public Knight(int player, String imagePath) {
		super(player, imagePath);
	}

	public boolean isValidMove(Location from, Location to, Piece[][] b) {		
		
		return false;
	}
}
