import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class n4 extends JFrame {
	private Panel panel = new Panel();
	private ImageIcon appleIcon = new ImageIcon("images/apple.jpg");
	private Image appleImage = appleIcon.getImage();
	private int x = 50;
	private int y = 50;
	private int width = appleImage.getWidth(this);
	private int height = appleImage.getHeight(this);

	public n4() {
		setTitle("이미지 레이블 드래깅 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		setSize(500, 500);
		setVisible(true);
	}

	class Panel extends JPanel {
		boolean okayToMove = false;

		public Panel() {
			setFocusable(true);
			requestFocus();

			addMouseListener(new MouseAdapter() {
				public void mousePressed(MouseEvent e) {
					Point startP = e.getPoint();
					if (startP.getX() >= x && startP.getX() <= x + width)
						if (startP.getY() >= y && startP.getY() <= y + height)
							okayToMove = true;
				}

				public void mouseReleased(MouseEvent e) {
					if (okayToMove == true) { 
						Point endP = e.getPoint();
						x = (int) endP.getX() - width / 2;
						y = (int) endP.getY() - height / 2;
						okayToMove = false;
						repaint();
					}
				}
			});
		}

		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(appleImage, x, y, width, height, this);
		}
	}

	public static void main(String[] args) {
		new n4();
	}

}