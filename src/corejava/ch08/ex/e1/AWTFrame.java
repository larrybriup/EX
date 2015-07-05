package corejava.ch08.ex.e1;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class AWTFrame {
	private JFrame frame;
	private JLabel lbl;
	private JPanel panel;
	private Container contentPane;
	private JButton btn1, btn2;

	public AWTFrame() {
		frame = new JFrame("AWTFrame");
		contentPane = frame.getContentPane();
		frame.setSize(400, 90);
		frame.setLocation(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		init();
		frame.setVisible(true);
	}

	public void init() {
		frame.setLayout(new BorderLayout());
		lbl = new JLabel("标签 label simida");
		contentPane.add(lbl, BorderLayout.NORTH);

		JPanel centerPanel = new JPanel();
		centerPanel.setLayout(new FlowLayout());
		btn1 = new JButton("按钮 1");
		btn2 = new JButton("按钮 2");
		centerPanel.add(btn1);
		centerPanel.add(btn2);

		contentPane.add(centerPanel, BorderLayout.SOUTH);

	}

	public static void main(String[] args) {
		new AWTFrame();
	}

}
