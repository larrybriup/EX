package corejava.ch10.ex.e2;

import java.util.ArrayList;
import java.util.List;

public class MyQueue {
	public MyQueue(){
		List list = new ArrayList();
		InsertThread it = new InsertThread();
		ReadThread rt = new ReadThread();
	}
}
