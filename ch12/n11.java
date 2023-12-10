import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class n11 extends JFrame {
	private Panel chart = new Panel();
	private String[] fruits = { "apple", "cherry", "strawberry", "prune" };
	private JTextField[] ft = new JTextField[4];
	private int[] sales = { 0, 0, 0, 0 };
	private int[] rate = { 0, 0, 0, 0 };

	public n11() {
		setTitle("그래픽 이미지 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());

		JPanel menu = new JPanel();
		menu.setLayout(new FlowLayout());
		menu.setBackground(Color.LIGHT_GRAY);
		for (int i = 0; i < fruits.length; i++) {
			menu.add(new JLabel(fruits[i]));
			ft[i] = new JTextField(5);
			menu.add(ft[i]);
			ft[i].addActionListener(new Action());
		}
		c.add(menu, BorderLayout.NORTH);
		c.add(chart, BorderLayout.CENTER);

		setSize(500, 400);
		setVisible(true);
	}

	class Panel extends JPanel {
		public void paintComponent(Graphics g) {
			int x = getWidth() / 4;
			int y = getHeight() / 5;

			g.setColor(Color.RED);
			g.fillArc(x, y, 200, 200, 0, rate[0]);
			g.setColor(Color.BLUE);
			g.fillArc(x, y, 200, 200, rate[0], rate[1]);
			g.setColor(Color.MAGENTA);
			g.fillArc(x, y, 200, 200, rate[0] + rate[1], rate[2]);
			g.setColor(Color.YELLOW);
			g.fillArc(x, y, 200, 200, rate[0] + rate[1] + rate[2], rate[3]);
		}
	}

	class Action implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			int totalSales = 0;
			for (int i = 0; i < 4; i++) {
				sales[i] = Integer.valueOf(ft[i].getText());
				totalSales += sales[i];
			}
			for (int i = 0; i < 4; i++) {
				rate[i] = (int) ((sales[i] / (double) totalSales) * 360);
			}
			repaint();
		}
	}

	public static void main(String[] args) {
		new n11();
	}

}