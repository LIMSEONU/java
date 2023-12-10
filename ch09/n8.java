import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.TextField;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


	class North extends JPanel{
		public North() {
			setBackground(Color.LIGHT_GRAY);
			add(new JButton("Open"));
			add(new JButton("Close"));
			add(new JButton("Exit"));
		}
	}
	class Center extends JPanel{
		public Center() {
			setLayout(null);
			for (int i = 0; i < 20; i++) {
				int x = (int)(Math.random()*250);
				int y = (int)(Math.random()*250);
				JLabel label=new JLabel("*");
                label.setForeground(Color.GREEN);
				label.setLocation(x,y);
				label.setSize(20, 20);
				label.setOpaque(true);
				add(label);
				}
		}
	}
	class South extends JPanel{
			public South() {
			setBackground(Color.YELLOW);
			add(new JButton("Integer Input"));
			add(new TextField(15));
		}
	}
	
public class n8 extends JFrame{
		n8(){
			setTitle("여러 개의 패널을 가진 프레임");
			setSize(300, 300);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
	North nP=new North();
    Center nC=new Center();
	South nS=new South();
	add(nP, BorderLayout.NORTH);
	add(nS, BorderLayout.SOUTH);
	add(nC);
	setVisible(true);
	}	

	public static void main(String[] args) {
		new n8();
	}
}
