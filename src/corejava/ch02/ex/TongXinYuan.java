package corejava.ch02.ex;

//12.6

import java.awt.*;

import javax.swing.JApplet;



public class TongXinYuan extends JApplet{
  
	public void paint(Graphics g)
	{
		
		super.paint(g);
		int counter = 1;
		
		do{
			
			g.drawOval(110-counter*10,110-counter*10,counter*20,counter*20);
			
			++counter;
			
		}
		while(counter<=8);
		
	}
	

}
