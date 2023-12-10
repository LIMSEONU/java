import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.*;

public class n3 extends JFrame{
	JLabel label; 
	StringBuffer s = new StringBuffer("Love Java");
	n3(){
		setTitle("Left 키로 문자열 교체");
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
		new n3();
	}
	class MyKeyAdapter extends KeyAdapter{
		public void keyPressed(KeyEvent e) {
			switch(e.getKeyCode()) {
				case KeyEvent.VK_LEFT:
					if(label.getText().equals("Love Java")) {
						label.setText(s.reverse().toString()); 
					}
					else {
						label.setText(s.reverse().toString());
					}
					break;
				default:
					break;
			}
		}
	}

}