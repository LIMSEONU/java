import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class n3 extends JFrame {
	private ImageIcon appleIcon = new ImageIcon("images/apple.jpg");
	private JLabel appleLabel = new JLabel(appleIcon);

	public n3() {
		setTitle("이미지 레이블 드래깅 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(null);

		appleLabel.setLocation(50, 50);
		appleLabel.setSize(appleIcon.getIconWidth(), appleIcon.getIconHeight());
		c.add(appleLabel);

		appleLabel.addMouseMotionListener(new MouseMotionAdapter() {
			public void mouseDragged(MouseEvent e) {
				Point p = e.getPoint();
				appleLabel.setLocation(p);
			}
		});

		setSize(500, 500);
		setVisible(true);
	}

	public static void main(String[] args) {
		new n3();
	}

}