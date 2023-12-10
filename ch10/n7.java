import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class n7 extends JFrame{
	JLabel label; 
	n7(){
		setTitle("마우스 휠을 굴려 폰트 크기 조절");
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		label= new JLabel("Love Java");
		label.setSize(200,50);
		label.setFont(new Font("Arial",Font.PLAIN,10));
		
		label.addMouseWheelListener(new MyMouseWheelListener());
		
		add(label);
		setSize(400,200);
		setVisible(true);
		label.requestFocus();
		
	}
	public static void main(String[] args) {
		new n7();
	}
	
	class MyMouseWheelListener implements MouseWheelListener{
		Font f;
		int size;
		int n;
		@Override
		public void mouseWheelMoved(MouseWheelEvent e) {
			f = label.getFont();
			size =f.getSize();
			n = e.getWheelRotation();
			if(n<0&&size>5)
				label.setFont(new Font("Arial", Font.PLAIN,size-5));
			else 
				label.setFont(new Font("Arial", Font.PLAIN,size+5));
		}
		
	}

}