import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class n1 extends JFrame{

	n1(){
		setTitle("마우스 올리기 내리기 예제");
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel label = new JLabel("Love Java");
		
		label.addMouseListener(new MyMouseAdapter());
		
		label.setSize(200,50);
		add(label);
		setSize(400,200);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new n1();
	}

}
class MyMouseAdapter extends MouseAdapter{
	public void mouseEntered(MouseEvent e) {
		JLabel l = (JLabel)e.getSource();
		l.setText("사랑해");
	}
	public void mouseExited(MouseEvent e) {
		JLabel l = (JLabel)e.getSource();
		l.setText("Love Java");
	}
}