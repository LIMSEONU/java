import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class n2 extends JFrame {
	private JComboBox<String> cb = new JComboBox<String>();
	
	public n2() {
		setTitle("JTextField and JComboBox Practice");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JTextField jt = new JTextField(12);
		
		c.add(jt);
		jt.addActionListener(new MyActionListener());
		c.add(cb);
		
		setSize(300,300);
		setVisible(true);
	}
	
	class MyActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			JTextField t = (JTextField)e.getSource();
			cb.addItem(t.getText());
		}
	}
	
	public static void main(String[] args) {
		new n2();
	}
}
