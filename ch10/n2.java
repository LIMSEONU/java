import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class n2 extends JFrame{
	JPanel contentPane = new JPanel();
	n2(){
		setTitle("드래깅동안 YELLO");
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setContentPane(contentPane);
		contentPane.setBackground(Color.GREEN);
		contentPane.addMouseMotionListener(new MyMouseMotionAdapter());
		contentPane.addMouseListener(new MyMouseAdapter2());
		setSize(400,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new n2();
	}
	class MyMouseMotionAdapter extends MouseMotionAdapter{
		public void mouseDragged(MouseEvent e) {

			contentPane.setBackground(Color.YELLOW);
		}
	}
	class MyMouseAdapter2 extends MouseAdapter{
		public void mouseReleased(MouseEvent e) {

			contentPane.setBackground(Color.GREEN);
		}
	}
}