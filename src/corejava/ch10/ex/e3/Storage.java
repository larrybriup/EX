package corejava.ch10.ex.e3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Storage {
	
	private int i=-1;
	private List list = new ArrayList(10);

	public Storage(int i) {
		this.i = i;
		
	}
	synchronized public void store(int i){
			
			this.i=i;
			System.out.println("写入:"+i);
			notify();
	}

	synchronized public  void read(){
		if(i<0){
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("读取:"+i);
	}
	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

}
