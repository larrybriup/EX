package corejava.ch07.ex.e5;

import java.util.ArrayList;

public class MyStack {
	/*
	 * 要实现的功能： 利用arraylist存储数据 入栈 出栈 栈长度
	 */
	private int index;
	private int maxLength;

	private ArrayList<Object> list = new ArrayList<Object>();

	public MyStack() {
		index = 0;
		list = new ArrayList<Object>();
	}

	// 入栈
	public void push(int value) {
		list.add(new Integer(value));
		index++;
	}

	// 出栈
	public Object pop() {
		Object res = null;
		if (index > 0) {
			res = (Object) list.get(index - 1);
			list.remove(--index);
		}
		return res;
	}

	// 栈长度
	public int length() {
		return list.size();
	}

}
