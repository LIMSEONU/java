import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class n6_1 extends JFrame {
	private Panel panel = new Panel();

	public n6_1() {
		setTitle("그래픽 다각형 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		setSize(300, 300);
		setVisible(true);
	}

	class Panel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			int w = this.getWidth();
			int h = this.getHeight();
			int[] x = { w / 2, 0, w / 2, w };
			int[] y = { 0, h / 2, h, h / 2 };
			int xSpace = (int) this.getWidth() / 30;
			int ySpace = (int) this.getHeight() / 30;
			g.drawPolygon(x, y, 4);
			for (int i = 1; i < 10; i++) {
				y[0] += ySpace;
				x[1] += xSpace;
				y[2] -= ySpace;
				x[3] -= xSpace;
				g.drawPolygon(x, y, 4);
			}
		}
	}

	public static void main(String[] args) {
		new n6_1();
	}

}
