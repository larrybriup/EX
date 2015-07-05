package corejava.ch10.ex.e3;

import java.util.ArrayList;
import java.util.List;

public class Printer extends Thread {
	private Storage storage;
	public Printer(Storage storage){
		this.storage=storage;
		
	}
	 public void run() {
		 for (int i = 0; i < 100; i++) {
			
			 storage.read();
			 try {
				 sleep(1000);
			 } catch (InterruptedException e) {
				 e.printStackTrace();
			 }
		}
	}
}
