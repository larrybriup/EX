package corejava.ch07.ex.e5;

import java.util.Iterator;

public class Test {
	public static void main(String[] args) {
		MyStack stack = new MyStack();
		stack.push(new Integer(1));
		System.out.println(new Integer(1) + " 入栈，");
		stack.push(new Integer(2));
		System.out.println(new Integer(2) + " 入栈，");
		stack.push(new Integer(3));
		System.out.println(new Integer(3) + " 入栈，");
		System.out.print(stack.pop());
		System.out.println(" 出栈，");
		stack.push(new Integer(4));
		System.out.println(new Integer(1) + " 入栈，");
		System.out.print(stack.pop());
		System.out.println(" 出栈，");
		System.out.print(stack.pop());
		System.out.println(" 出栈，");
		System.out.print(stack.pop());
		System.out.println(" 出栈，");
		System.out.print(stack.pop());
		stack.push(new Integer(5));
		System.out.println(new Integer(5) + " 入栈，");
		System.out.print(stack.pop());
		System.out.println(" 出栈，");
		System.out.println(stack.pop());
		System.out.println(stack.length());
		System.out
				.println("===========================================================================");

		MyQueue queue = new MyQueue();
		queue.in(new Integer(1));
		queue.in(new Integer(2));
		queue.in(new Integer(3));
		System.out.println(queue.out());
		queue.in(new Integer(4));
		System.out.println(queue.out());
		System.out.println(queue.out());
		System.out.println(queue.out());
		System.out.println(queue.out());
		queue.in(new Integer(5));
		System.out.println(queue.out());
		System.out.println(queue.out());
	}
}