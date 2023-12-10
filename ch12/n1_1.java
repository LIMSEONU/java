import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class n1_1 extends JFrame {
	private Panel panel = new Panel();

	public n1_1() {
		setTitle("이미지 그리기 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		setSize(300, 300);
		setVisible(true);
	}

	class Panel extends JPanel {
		private JButton btn = new JButton("Hide/Show");
		private ImageIcon icon = new ImageIcon("images/back.jpg");
		private Image image = icon.getImage();

		public Panel() {
			setLayout(new FlowLayout());
			add(btn);
			btn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (image == null)
						image = icon.getImage();
					else
						image = null;
					repaint();
				}
			});
		}

		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), this);
		}
	}

	public static void main(String[] args) {
		new n1_1();
	}

}