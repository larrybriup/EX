package corejava.ch08.ex.e3;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.xml.soap.Text;

public class Calculator extends JFrame implements ActionListener {
	private JFrame frame;
	// private JLabel lbl;
	private Container contentPane, container;
	private JButton[] jbs;
	private JPanel panel;
	private JTextArea ta;

	public Calculator() {
		frame = new JFrame("计算器");
		frame.setSize(250, 300);
		frame.setLocation(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		init();
		frame.setVisible(true);

	}

	public void init() {
		frame.setLayout(new BorderLayout());
		// frame.setLayout(null);
		contentPane = frame.getContentPane();
		// lbl = new JLabel("计算器");
		// contentPane.add(lbl, BorderLayout.NORTH);

		ta = new JTextArea(7, 20);
		// txt.setSize(80, 90);
		// ta.setColumns(20);
		// ta.setRows(7);
		// ta.setAutoscrolls(true);

		container = new JPanel();
		container.add(ta);
		contentPane.add(container, BorderLayout.NORTH);

		panel = new JPanel();
		panel.setLayout(new GridLayout(4, 4));
		jbs = new JButton[16];
		for (int i = 0; i < jbs.length - 6; i++) {
			jbs[i] = new JButton(i + "");
		}
		jbs[10] = new JButton(".");
		jbs[11] = new JButton("/");
		jbs[12] = new JButton("+");
		jbs[13] = new JButton("-");
		jbs[14] = new JButton("*");
		jbs[15] = new JButton("=");
		for (int i = 0; i < jbs.length; i++) {
			jbs[i].addActionListener(this);
			panel.add(jbs[i]);
		}

		contentPane.add(panel, BorderLayout.CENTER);
	}

	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		for (int i = 0; i < jbs.length; i++) {
			if (obj == jbs[i]) {
				ta.append(jbs[i].getText().trim());
			}
		}
		// int j = 0;
		//
		// while (j != 15 && j < jbs.length) {
		// ta.append(jbs[j].getText().trim());
		//
		// j++;
		// }
		if (obj == jbs[15]) {
			// String temp = ta.getText().trim();
			// temp += ta.getText().trim().split(" ");
			// ta.setText(temp);
			String[] a1 = ta.getText().trim().split("[+*/=-]");
			String[] a2 = ta.getText().trim().split("[0-9.=]");
			for (String s1 : a1) {
				ta.append(s1 + " ");
			}
			for (String s2 : a2) {
				ta.append(s2 + " ");
			}
			for (int i=0;i<a1.length;i++) {

				for (int j=0;i<a2.length;j++) {
					if (a2[j].equals("+") && !a2[j+1].equals("*")
							|| !a2[j+1].equals("/")) {
						int sum=Integer.parseInt(a1[i])+Integer.parseInt(a1[i+1]);
//						Integer.parseInt(a1[i])=sum;
					}
				}
			}
		}

	}

	public static void main(String[] args) {
		new Calculator();

	}

}
