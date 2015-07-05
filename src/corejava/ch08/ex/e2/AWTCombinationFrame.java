package corejava.ch08.ex.e2;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class AWTCombinationFrame {
	private JFrame frame;
	private JLabel lbl;
	private Container contentPane;
	private JButton[] jbs;
	private JPanel panel;
	
	public AWTCombinationFrame(){
		frame= new JFrame("AWTCombinationFrame");
		frame.setSize(400, 500);
		frame.setLocation(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		init();
		frame.setVisible(true);
		
	}
	public void init(){
		frame.setLayout(new BorderLayout());
		contentPane=frame.getContentPane();
		lbl = new JLabel("标签 label simida");
		contentPane.add(lbl,BorderLayout.NORTH);
		panel = new JPanel();
		panel.setLayout(new GridLayout(3,4));
		jbs = new JButton[12];
		for(int i=0;i<jbs.length;i++){
			jbs[i]=new JButton("按钮"+(i+1)+"");
			panel.add(jbs[i]);
		}
		contentPane.add(panel);
	}
	
public static void main(String[] args) {
		new AWTCombinationFrame();
	}
	
}
