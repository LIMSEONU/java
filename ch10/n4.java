import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class n4 extends JFrame{

	JLabel label; 
	String text = "Love Java";
	n4(){
		setTitle("Left 키로 문자열 이동");
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		label= new JLabel("Love Java");
		
		label.addKeyListener(new MyKeyAdapter());
		
		label.setSize(200,50);
		add(label);
		setSize(400,200);
		setVisible(true);
		label.requestFocus();
		
	}
	public static void main(String[] args) {
		new n4();
	}
	class MyKeyAdapter extends KeyAdapter{
		public void keyPressed(KeyEvent e) {
			switch(e.getKeyCode()) {
				case KeyEvent.VK_LEFT: 
					label.setText(text);
					text = text.substring(1)+text.substring(0, 1);
					break;
				default:
					break;
			}
		}
	}

}