package corejava.ch10.ex.e2;

import java.util.List;
import java.util.ArrayList;

public class InsertThread {
//	static List list = new ArrayList();
private MyQueue queue;
private List list;
	synchronized public void insert(String str) {
		list.add(str);
	}
}
