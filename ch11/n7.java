import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public class n7 extends JFrame {
	private JLabel text = new JLabel("I Love Java");

	public n7() {
		setTitle("JSlider Practice Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());

		JSlider slider = new JSlider(JSlider.HORIZONTAL, 1, 100, 20);
		slider.setMajorTickSpacing(20);
		slider.setMinorTickSpacing(5);
		slider.setPaintLabels(true);
		slider.setPaintTicks(true);
		slider.setPaintTrack(true);
		c.add(slider, BorderLayout.NORTH);

		Font f = new Font("고딕", Font.PLAIN, slider.getValue());
		text.setFont(f);
		text.setHorizontalAlignment(SwingConstants.CENTER);
		c.add(text, BorderLayout.CENTER);
		slider.addChangeListener(new Change());

		setSize(500, 300);
		setVisible(true);
	}

	class Change implements ChangeListener {
		public void stateChanged(ChangeEvent e) {
			JSlider s = (JSlider) e.getSource();
			int fontSize = s.getValue();
			Font f = new Font("고딕", Font.PLAIN, fontSize);
			text.setFont(f);
		}
	}

	public static void main(String[] args) {
		new n7();
	}
}


