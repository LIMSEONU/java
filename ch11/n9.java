import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class n9 extends JFrame {

	private ImageIcon[] images = {
			new ImageIcon("images/scissor.png"),
			new ImageIcon("images/rock.png"),
			new ImageIcon("images/paper.png") };
	private JButton[] buttons = new JButton[images.length];
	private JLabel myLabel = new JLabel(images[0]);
	private JLabel comLabel = new JLabel(images[0]);
	private JLabel resultLabel = new JLabel();

	public n9() {
		setTitle("가위 바위 보 게임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());

		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new FlowLayout());
		buttonPanel.setBackground(Color.GRAY);
		for (int i = 0; i < images.length; i++) {
			buttons[i] = new JButton(images[i]);
			buttonPanel.add(buttons[i]);
			buttons[i].addActionListener(new MyActionListener());

		}
		c.add(buttonPanel, BorderLayout.NORTH);
		resultLabel.setForeground(Color.RED);
		c.add(new ResultPanel(), BorderLayout.CENTER);

		setSize(400, 300);
		setVisible(true);
	}

	class ResultPanel extends JPanel {	
		public ResultPanel() {
			setLayout(new FlowLayout());
			setBackground(Color.YELLOW);
			add(myLabel);
			add(new JLabel("me"));
			add(comLabel);
			add(new JLabel("com"));
			add(resultLabel);
		}
	}

	class MyActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JButton selectedButton = (JButton) e.getSource();
			
			int myIndex;
			if (selectedButton == buttons[0])
				myIndex = 0;
			else if (selectedButton == buttons[1])
				myIndex = 1;
			else
				myIndex = 2;
		
			myLabel.setIcon(images[myIndex]);

			int comIndex = (int) (Math.random() * 3);	
			comLabel.setIcon(images[comIndex]);	

			if (myIndex == comIndex)
				resultLabel.setText("Same !!!");
			else if ((myIndex + 2) % 3 == comIndex)
				resultLabel.setText("Me !!!");
			else	//졌을 때
				resultLabel.setText("Computer !!!");
		}
	}

	public static void main(String[] args) {
		new n9();
	}
}

