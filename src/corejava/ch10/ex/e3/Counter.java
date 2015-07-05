package corejava.ch10.ex.e3;

import java.util.ArrayList;
import java.util.List;

public class Counter extends Thread{
	private Storage storage;
	private int i;
	public Counter(Storage storage){
		this.storage=storage; 
		
	}
	 public void run() {
			for ( i = 0; i < 100; i++) {
				storage.store(i);
				try {
					sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	
}
