import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;

public class n5 extends JFrame {
	private JSlider slider = new JSlider(JSlider.HORIZONTAL, 100, 200, 150);
	private JLabel label;

	public n5() {
		setTitle("JSlider Practice Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		slider.setMajorTickSpacing(20);
		slider.setPaintLabels(true);
		slider.setPaintTicks(true);
		slider.setPaintTrack(true);
		c.add(slider);

		label = new JLabel(Integer.toString(slider.getValue()));
		label.setOpaque(true);
		label.setBackground(Color.GREEN);
		c.add(label);

		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				label.setText(Integer.toString(slider.getValue()));
			}
		});

		setSize(300, 150);
		setVisible(true);
	}

	public static void main(String[] args) {
		new n5();
	}
}