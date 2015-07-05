package corejava.ch10.ex.e3;

public class Test {
	
	public static void main(String[] args) {
	Storage s = new Storage(100);
	Counter c = new Counter(s);
	Printer p = new Printer(s);
		c.start();
		p.start();
	}


}
