
public class Bishop extends Piece {

	public Bishop() {
		this(1, "images2/bishop1.png");
	}

	public Bishop(int player, String imagePath) {
		super(player, imagePath);
	}

	public boolean isValidMove(Location from, Location to, Piece[][] b) {
		boolean pieceInWay = true;
	
		//if direction = 1 moving towards (0,8)
		//if direction = 2 moving towards (8,8)
		//if direction = 3 moving towards (8,0)
		//if direction = 4 moving towards (0,0)
		int direction =0; 
		
		if(to.getColumn()>from.getColumn() && to.getRow()<from.getRow()){
			direction = 1;
		}
		else if (to.getColumn()<from.getColumn() && to.getRow()>from.getRow()){
			direction = 2;
		}
		else if (to.getColumn()<from.getColumn() && to.getRow()<from.getRow()){
			direction = 4;
		}
		else
			direction = 3;
		
		
//		for(int i = 0; i<8; i++){
//			for(int j = 0; j<8; j++){
//				if(to.getRow()-from.getRow())
//			}
//			
//		}
//		
		
		
		if (Math.abs(from.getColumn() - to.getColumn()) == Math.abs(from.getRow() - to.getRow())
				&& b[to.getRow()][to.getColumn()].getPlayer() != getPlayer()
				&& !pieceInWay/*b[to.getRow()][to.getColumn()].getPlayer() == 0 b[from.getRow()+1][from.getColumn()+1]*/) {

			return true;
		}
		return false;
	}
}
