package corejava.ch07.ex.e5;

import java.util.ArrayList;

public class MyQueue {
	/*
	 * 要实现的功能： 利用arraylist存储数据 入对 出对 队列长度   超级方方便的
	 */
	private int index;
	private int maxLength;

	private ArrayList<Object> list = new ArrayList<Object>();

	public MyQueue() {//初始化的时候加载
		index=0;
		list = new ArrayList<Object>();
	}

	// 入对
	public void in(int value) {
		list.add(new Integer(value));
		index++;
	}

	// 出对
	public Object out() {
		Object res = null;//当栈中没有值时返回null
		if(index>0){
			res = (Object) list.get(0);
			list.remove(0);
			index--;
		}
		return res;
	}

	// 队列长度
	public int length() {
		return list.size();
	}

}
