import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.util.Vector;

public class n8 extends JFrame {
	private JRadioButton left = new JRadioButton("left");
	private JRadioButton right = new JRadioButton("right");
	private JLabel imageLabel;
	private Vector<ImageIcon> imagesVector = new Vector<ImageIcon>();

	public n8() {
		setTitle("Image Gallery Practice Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());

		File fp = new File("images");
		File[] imageFiles = fp.listFiles();
		for (File f : imageFiles) {
			if (f.isFile()) {
				ImageIcon icon = new ImageIcon(f.getPath());
				imagesVector.add(icon);
			}
		}

		c.add(new MenuPanel(), BorderLayout.NORTH);
		imageLabel=new JLabel(imagesVector.get(0));
		c.add(imageLabel, BorderLayout.CENTER);
		imageLabel.addMouseListener(new Mouse(0));
		setSize(500, 300);
		setVisible(true);
	}

	class MenuPanel extends JPanel {
		public MenuPanel() {
			setLayout(new FlowLayout());

			ButtonGroup g = new ButtonGroup();
			g.add(left);
			g.add(right);

			add(left);
			add(right);
			
			left.setSelected(true);
		}
	}

	class Mouse extends MouseAdapter {
		private int index;

		public Mouse(int startIndex) {
			index = startIndex;
		}

		public void mouseReleased(MouseEvent e) {
			if (left.isSelected()) {
				index++;
				if (index >= imagesVector.size())
					index = 0;
				
			} else {
				index--;	
				if (index == -1)
					index = imagesVector.size() - 1;
		
			}
			imageLabel.setIcon(imagesVector.get(index));
			
		}
	}

	public static void main(String[] args) {
		new n8();
	}
}

