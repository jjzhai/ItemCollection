import java.awt.Component;

import javax.swing.JFrame;
import javax.swing.JTextPane;


public class ThreeMax {
	public static void main(String[] args) {
		JFrame frame = new JFrame("求最大值");
		frame.setSize(500, 500);
		JTextPane textPane = new JTextPane();
		textPane.setSize(15, 10);
		frame.add(textPane);
		frame.setVisible(true);
	}
}
