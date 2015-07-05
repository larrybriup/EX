package corejava.ch11.ex.water;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class FileReaderGui extends JFrame implements ActionListener {
	/**
	 * src\ch11\ex\water\FileReaderGui.java
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton rdBtn, expBtn;
	private JTextField iptTfd, expTfd;
	private JTextArea ta;
	private JFrame frame;
	private Container contentPane;
	private ScrollPane sp;
	FileInputStream fis = null;
	FileOutputStream fos = null;
	BufferedInputStream bis = null;
	BufferedOutputStream bos = null;

	public FileReaderGui() {
		frame = new JFrame("文件浏览器");
		contentPane = frame.getContentPane();

		frame.setBounds(200, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		init();
		frame.setVisible(true);
	}

	private void init() {
		frame.setLayout(null);
        //字符串src\ch11\ex\water\FileReaderGui.java中的\要用\转义
		iptTfd = new JTextField("src\\ch11\\ex\\water\\FileReaderGui.java");
		iptTfd.setBounds(20, 10, 300, 30);

		rdBtn = new JButton("开始阅览");
		rdBtn.setBounds(340, 10, 100, 30);
		rdBtn.addActionListener(this);

		contentPane.add(iptTfd);
		contentPane.add(rdBtn);

		ta = new JTextArea("要显示的阅览内容");
		ta.setBackground(Color.BLACK);
		ta.setForeground(Color.YELLOW);
		ta.setFont(getFont());
		sp = new ScrollPane();
		// Font font= new Font("SERIF", Font.ITALIC, 17);
		// sp.setFont(font );
		sp.setFont(new Font("SERIF", Font.ITALIC, 17));
		sp.setBounds(10, 50, 770, 500);
		sp.add(ta);
		contentPane.add(sp, "South");

		expBtn = new JButton("输出文本到：");
		expBtn.setBounds(450, 10, 110, 30);
		contentPane.add(expBtn);
		expBtn.addActionListener(this);

		expTfd = new JTextField("D:\\360data\\重要数据\\桌面\\FileReaderGui.java.bak");
		expTfd.setBounds(570, 10, 200, 30);
		contentPane.add(expTfd);

	}

	public static void main(String[] args) {
		new FileReaderGui();
	}

	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		String inStr = iptTfd.getText().trim();
		
		if (obj == rdBtn) {

			try {
				fis = new FileInputStream(inStr);
				bis = new BufferedInputStream(fis);
				byte[] buff = new byte[128];
				int len = 0;
				String str1 = null;
				while ((len = bis.read(buff)) != -1) {
					str1 += new String(buff, 0, len);
					ta.setText(str1);
				}
				

			} catch (FileNotFoundException e1) {
				e1.printStackTrace();
			} catch (IOException e1) {
				e1.printStackTrace();
			} finally {
				try {
					if (fis != null)
						fis.close();
					if (bis != null)
						bis.close();
				} catch (IOException e2) {
					e2.printStackTrace();
				}
			}

		}
		if (obj == expBtn) {
			String outStr = expTfd.getText().trim();
			String taStr= ta.getText().trim();
			System.out.println(taStr+"hhe");
			try {
//				File file = new File(taStr);
//				fis = new FileInputStream(inStr);
				fis = new FileInputStream(taStr);
				bis = new BufferedInputStream(fis);
				File file=new File(outStr);
				file.createNewFile();
				fos = new FileOutputStream(file);
				bos = new BufferedOutputStream(fos);

				byte[] buff = new byte[128];
				int len = 0;
				while ((len = bis.read(buff)) != -1) {
					bos.write(buff, 0, len);
				}
				bos.flush();

			} catch (FileNotFoundException e1) {
				e1.printStackTrace();
			} catch (IOException e1) {
				e1.printStackTrace();
			} finally {
				try {
					if (fos != null)
						fos.close();
					if (bos != null)
						bos.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}

		}

	}
}
