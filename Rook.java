import java.awt.Component;
import javax.swing.ImageIcon;
public class Rook extends Piece{
	
	//Constructors
	public Rook(){
		super(0, "");
	}
	public Rook(String imagepath, int player){
		super(player, imagepath);
	}
}
