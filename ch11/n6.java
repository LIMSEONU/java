import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class n6 extends JFrame {
	private JTextArea ta = new JTextArea(4, 24);
	private JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 100, 0);

	public n6() {
		setTitle("TextArea Practice Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		c.add(ta);

		slider.setMajorTickSpacing(20);
		slider.setMinorTickSpacing(5);
		slider.setPaintLabels(true);
		slider.setPaintTicks(true);
		slider.setPaintTrack(true);
		c.add(slider);

		ta.addKeyListener(new MyKey());
		slider.addChangeListener(new MyChange());

		setSize(300, 200);
		setVisible(true);
	}

	class MyKey extends KeyAdapter {
		public void keyTyped(KeyEvent e) {
			JTextArea t = (JTextArea) e.getSource();
			String s = t.getText();
			if (s.length() <= 100)	//텍스트 길이가 100이하이면
				slider.setValue(s.length());	//슬라이더의 값 증가
			else {	//텍스트 길이가 100 초과면
				s = s.substring(0, 99);
				t.setText(s);	//100 글자까지만 쓰이도록
			}
		}
	}
	class MyChange implements ChangeListener {
		public void stateChanged(ChangeEvent e) {
			JSlider js = (JSlider) e.getSource();
			String currentString = ta.getText();
			int textLength = currentString.length();	//현재 텍스트 길이
			if (textLength > js.getValue()) { // 슬라이더 값을 감소시켰으면
				currentString = currentString.substring(0, js.getValue());
				ta.setText(currentString);
			} else // 슬라이더 값을 증가시켰으면
				js.setValue(textLength); // 원상태로
		}
	}

	public static void main(String[] args) {
		new n6();
	}
}


