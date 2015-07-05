package corejava.ch10.ex.e1;

public class Race {
public static void main(String[] args) {
	RabbitAndTurtle rabbit = new RabbitAndTurtle("rabbit");
	RabbitAndTurtle turtle = new RabbitAndTurtle("turtle");
		rabbit.start();
		turtle.start();
}
}
