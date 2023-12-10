import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class n1 extends JFrame {
	private JButton testButton = new JButton("test button");
	
	public n1() {
		setTitle("CheckBox Practice");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JCheckBox enabledButton = new JCheckBox("버튼 비활성화");
		JCheckBox invisibleButton = new JCheckBox("버튼 감추기");
		
		c.add(enabledButton);
		c.add(invisibleButton);
		c.add(testButton);
		
		enabledButton.addItemListener(new Enabled());
		invisibleButton.addItemListener(new Invisible());
		
		setSize(300,150);
		setVisible(true);
	}
	
	class Enabled implements ItemListener{
		public void itemStateChanged(ItemEvent e) {
			JCheckBox cb = (JCheckBox)e.getSource();
			if(cb.isSelected()==true)
				testButton.setEnabled(false);
			else
				testButton.setEnabled(true);
		}
	}
	
	class Invisible implements ItemListener{
		public void itemStateChanged(ItemEvent e) {
			JCheckBox cb = (JCheckBox)e.getSource();
			if(cb.isSelected()==true)
				testButton.setVisible(false);
			else
				testButton.setVisible(true);
		}
	}
	
	public static void main(String[] args) {
		new n1();
	}
}

