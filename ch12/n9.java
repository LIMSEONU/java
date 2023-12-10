import javax.swing.*;
import java.awt.*;

public class n9 extends JFrame {
	public n9() {
		setTitle("마우스로 원 그리기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		Label label1 = new Label("hello");
		label1.setFont(new Font("고딕", Font.PLAIN, 10));
		label1.setForeground(Color.YELLOW);
		label1.setOpaque(true);

		Label label2 = new Label("Big hello");
		label2.setFont(new Font("고딕", Font.ITALIC, 50));
		label2.setForeground(Color.MAGENTA);
		label2.setOpaque(true);

		c.add(label1);
		c.add(label2);

		setSize(350, 300);
		setVisible(true);
	}

	class Label extends JLabel {
		public Label(String s) {
			setText(s);
			setBackground(Color.BLUE);
		}

		@Override
		public void setBackground(Color color) {
			super.setBackground(Color.BLUE);
		}
	}

	public static void main(String[] args) {
		new n9();
	}

}