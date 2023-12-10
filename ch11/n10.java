import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class n10 extends JFrame {
	private int nextClickNumber = 0;
	private JLabel[] numbers = new JLabel[10];

	public n10() {
		setTitle("Ten 레이블 클릭");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);

		setSize(300, 300);
		setVisible(true);
		
		Font f = new Font("고딕",Font.ITALIC,15);
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = new JLabel(Integer.toString(i));
			numbers[i].setForeground(Color.MAGENTA);
			numbers[i].setFont(f);
			c.add(numbers[i]);
			numbers[i].addMouseListener(new Mouse());
		}
		gameSetting();

	}

	public void gameSetting() {
		for (int i = 0; i < numbers.length; i++) {
			int x = (int) (Math.random() * 230);
			int y = (int) (Math.random() * 230);
			numbers[i].setLocation(x, y);
			numbers[i].setSize(20, 20);
		}
	}

	class Mouse extends MouseAdapter {
		public void mouseReleased(MouseEvent e) {
			JLabel nowClickedLabel = (JLabel) e.getSource();
			int nowClickedNum = Integer.valueOf(nowClickedLabel.getText());
			
			if (nowClickedNum == nextClickNumber) {
				nowClickedLabel.setVisible(false);
				nextClickNumber++;
			}
			
			if (nextClickNumber == 10) {
				gameSetting();
				for(int i=0;i<numbers.length;i++)
					numbers[i].setVisible(true);
				nextClickNumber = 0;
			}
		}
	}

	public static void main(String[] args) {
		new n10();
	}
}


