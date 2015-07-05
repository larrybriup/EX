package corejava.ch10.ex.e2;

import java.util.ArrayList;
import java.util.List;

public class ReadThread {
//	List list = new ArrayList();
	private MyQueue queue;
	private List list;
    public String read(){
    	String str=(String)list.get(0);
    	return str;
    }
   synchronized public void remove(){
    	list.remove(0);
    }
}
