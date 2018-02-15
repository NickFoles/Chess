
// Class: GraphicsPanel
// Written by: Mr. Swope
// Date: 12/2/15
// Description: This class is the main class for this project.  It extends the Jpanel class and will be drawn on
// 				on the JPanel in the GraphicsMain class.  
//
// Since you will modify this class you should add comments that describe when and how you modified the class.  
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.Color;
import javax.swing.JPanel;
import java.io.*;

public class GraphicsPanel extends JPanel implements MouseListener {

	private final int SQUARE_WIDTH = 90; // The width of one space on the board.
											// Constant used for drawing board.
	private final int OFFSET = 30;
	private Location from; // holds the coordinates of the square that the user
							// would like to move from.
	private Location to; // holds the coordinates of the square that the user
							// would like to move to.
	private boolean click; // false until the game has started by somebody
							// clicking on the board. should also be set to
							// false
							// after an attempted move.
	private Piece[][] board; // an 8x8 board of 'Pieces'. Each spot should be
								// filled by one of the chess pieces or a
								// 'space'.
	private int turn;
	private boolean toIsValid;

	public GraphicsPanel() {
		setPreferredSize(new Dimension(SQUARE_WIDTH * 8 + OFFSET + 2, SQUARE_WIDTH * 8 + OFFSET + 2)); // Set
																										// these

		toIsValid = true;
		// dimensions
		// to
		// the
		// width
		// of your background picture.

		click = false;
		turn = 1;

		this.setFocusable(true); // for keylistener
		this.addMouseListener(this);

		board = new Piece[8][8];

		board[0][0] = new Rook(1, "images2/rook1.png");
		board[0][1] = new Knight(1, "images2/knight1.png");
		board[0][2] = new Bishop(1, "images2/bishop1.png");
		board[0][3] = new King(1, "images2/king1.png");
		board[0][4] = new Queen(1, "images2/queen1.png");
		board[0][5] = new Bishop(1, "images2/bishop1.png");
		board[0][6] = new Knight(1, "images2/knight1.png");
		board[0][7] = new Rook(1, "images2/rook1.png");

		for (int i = 0; i < 8; i++) {
			board[1][i] = new Pawn(1, "images2/pawn1.png");
		}

		for (int i = 2; i <= 5; i++) {
			for (int j = 0; j < 8; j++) {
				board[i][j] = new Piece(0, "images2/space.png");
			}
		}

		for (int i = 0; i < 8; i++) {
			board[6][i] = new Pawn(-1, "images2/pawn2.png");
		}

		board[7][0] = new Rook(-1, "images2/rook2.png");
		board[7][1] = new Knight(-1, "images2/knight2.png");
		board[7][2] = new Bishop(-1, "images2/bishop2.png");
		board[7][3] = new King(-1, "images2/king2.png");
		board[7][4] = new Queen(-1, "images2/queen2.png");
		board[7][5] = new Bishop(-1, "images2/bishop2.png");
		board[7][6] = new Knight(-1, "images2/knight2.png");
		board[7][7] = new Rook(-1, "images2/rook2.png");
	}

	// method: paintComponent
	// description: This method will paint the items onto the graphics panel.
	// This method is called when the panel is
	// first rendered. It can also be called by this.repaint()
	// parameters: Graphics g - This object is used to draw your images onto the
	// graphics panel.
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;

		// Draw the board
		g2.setColor(Color.gray);
		g2.drawLine(SQUARE_WIDTH * 8 + OFFSET, OFFSET, SQUARE_WIDTH * 8 + OFFSET, SQUARE_WIDTH * 8 + OFFSET);
		g2.drawLine(OFFSET, SQUARE_WIDTH * 8 + OFFSET, SQUARE_WIDTH * 8 + OFFSET, SQUARE_WIDTH * 8 + OFFSET);
		g2.drawLine(OFFSET, OFFSET, SQUARE_WIDTH * 8 + OFFSET, 0 + OFFSET);
		g2.drawLine(OFFSET, OFFSET, OFFSET, SQUARE_WIDTH * 8 + OFFSET);

		for (int i = 0; i < 8; i += 2)
			for (int j = 0; j < 8; j += 2) {
				g2.setColor(Color.gray);
				g2.fillRect(i * SQUARE_WIDTH + OFFSET, j * SQUARE_WIDTH + OFFSET, SQUARE_WIDTH, SQUARE_WIDTH);
			}

		for (int i = 1; i < 8; i += 2)
			for (int j = 1; j < 8; j += 2) {
				g2.setColor(Color.gray);
				g2.fillRect(i * SQUARE_WIDTH + OFFSET, j * SQUARE_WIDTH + OFFSET, SQUARE_WIDTH, SQUARE_WIDTH);
			}

		try {
			if ((turn == board[from.getRow()][from.getColumn()].getPlayer())) {
				g2.setColor(Color.yellow);
				g2.fillRect((from.getColumn() * 90) + 30, (from.getRow() * 90) + 30, 90, 90);
			}
		} catch (Exception e) {

		}

		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				board[i][j].draw(g2, this, new Location(i, j));
			}
		}

	}

	@Override
	public void mouseClicked(MouseEvent e) {

		if (click == false) {
			from = new Location(((e.getY() - OFFSET) / SQUARE_WIDTH), ((e.getX() - OFFSET) / SQUARE_WIDTH));
			System.out.println("from:" + (e.getX() - OFFSET) / SQUARE_WIDTH + (e.getY() - OFFSET) / SQUARE_WIDTH);
			if (turn == board[from.getRow()][from.getColumn()].getPlayer()) {
				click = true;
			}
			

		} else if (click == true) {		
			to = new Location(((e.getY() - OFFSET) / SQUARE_WIDTH), ((e.getX() - OFFSET) / SQUARE_WIDTH));
			
			if(board[to.getRow()][to.getColumn()].getPlayer() == board[from.getRow()][from.getColumn()].getPlayer()){
				from = to;
				toIsValid=false;
			}
			else{
				toIsValid=true;
			}
			
			if(toIsValid == true){
			System.out.println("to:" + (e.getX() - OFFSET) / SQUARE_WIDTH + (e.getY() - OFFSET) / SQUARE_WIDTH);
				if (click == true && board[from.getRow()][from.getColumn()].isValidMove(from, to, board)) {
				turn *= -1;

				board[to.getRow()][to.getColumn()] = board[from.getRow()][from.getColumn()];
				board[from.getRow()][from.getColumn()] = new Piece(0, "images2/space.png");

				click = false;
				}
			}
		}

		this.repaint();
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}
