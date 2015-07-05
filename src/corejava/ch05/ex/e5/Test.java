package corejava.ch05.ex.e5;

public class Test 
{
	public static void main(String[] args) 
	{
		Stack stack = new Stack();
		//stack.pop();
		for(int i=1; i<=200; i++){
			stack.push(i);
			//System.out.println("push:"+stack.push(i));
		}
		for(int i=1; i<=100; i++){
			System.out.println("第"+i+"次pop:" + stack.pop());
		}
		for(int i=201; i<=300; i++){
		stack.push(i);
		//	System.out.println("push:"+stack.push(i));
		}
		for(int i=1; i<=200; i++){
		//	System.out.println("pop:" + stack.pop());
			System.out.println("第"+i+"次pop:" + stack.pop());
		}
	}
}
