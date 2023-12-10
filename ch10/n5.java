import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;


public class n5 extends JFrame {
	JLabel label; 
	n5(){
		setTitle("+,- 키로 폰트 크기 조절");
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		label= new JLabel("Love Java");
		label.setSize(200,50);
		label.setFont(new Font("Arial",Font.PLAIN,10));
		label.addKeyListener(new MyKey());
		
		add(label);
		setSize(400,200);
		setVisible(true);
		label.requestFocus();
		
	}
	public static void main(String[] args) {
		new n5();
		
	}

	class MyKey extends KeyAdapter{
		public void keyPressed(KeyEvent e) {
			Font f = label.getFont();
			int size = f.getSize();
			
			switch(e.getKeyCode()) {
				case 45:
					if(size>5) {
						label.setFont(new Font("Arial", Font.PLAIN,size-5));
					}
					break;
				case 61:
					label.setFont(new Font("Arial", Font.PLAIN,size+5));
					break;
			}
		}
	}
}