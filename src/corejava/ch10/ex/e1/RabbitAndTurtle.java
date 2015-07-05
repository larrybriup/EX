package corejava.ch10.ex.e1;

public class RabbitAndTurtle extends Thread {
//	private String name;
	private int sum;
	private static boolean end=false;
	public RabbitAndTurtle(String name) {
		super(name);
	}

	public void run() {
		while (sum < 100) {
			if (end)
				break;
			double s = Math.random();
			if (Thread.currentThread().getName().equals("rabbit")) {
				if (s <=0.3) {
					sum += 2;
					System.out.println("兔子跑了:"+sum);
					if (sum == 100) 
						break;
					
				}
				Thread.yield();
			} else if (Thread.currentThread().getName().equals("turtle")) {
				if (s >= 0.3 ) {
					sum++;
					System.out.println("乌龟跑了:"+sum);
					if (sum ==100) 
						break;
					
				}
				Thread.yield();
			}
		}
		if(!end){
			System.out.println(Thread.currentThread().getName() + " win!!!");
			end = true; 
		}
	}
}
