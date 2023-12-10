import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class n6 extends JFrame{
	JLabel label; 
	n6(){
		setTitle("클릭 연습용 응용프로그램");
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		label= new JLabel("Love Java");
		label.setSize(100,50);
		label.setLocation(100,100);
		label.addMouseListener(new MyMouse());
		
		add(label);
		setSize(500,500);
		setVisible(true);
		label.requestFocus();

		
	}
	public static void main(String[] args) {
		new n6();
	}
	
	class MyMouse extends MouseAdapter{
		int x,y;
		public void mousePressed(MouseEvent e) {
			x = (int)(Math.random()*400);
			y = (int)(Math.random()*400);
			label.setLocation(x,y);
		}
	}
}