import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class n6 extends JFrame {
	private Panel panel = new Panel();

	public n6() {
		setTitle("격자 그리기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		setSize(300, 300);
		setVisible(true);
	}

	class Panel extends JPanel {
		private int gridWidth = this.getWidth() / 10;
		private int gridHeight = this.getHeight() / 10;

		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			for (int i = 1; i < 10; i++) {
				g.drawLine(0, (this.getHeight() / 10) * i, this.getWidth(), (this.getHeight() / 10) * i);
				g.drawLine((this.getWidth() / 10) * i, 0, (this.getWidth() / 10) * i, this.getHeight());
			}
		}
	}

	public static void main(String[] args) {
		new n6();
	}

}