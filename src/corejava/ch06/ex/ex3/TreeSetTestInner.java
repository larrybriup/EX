package corejava.ch06.ex.ex3;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTestInner {

	// 静态内部类
	static class Comparator {
		public int compare(Object o1, Object o2) {
			String s1 = (String) o1;
			String s2 = (String) o2;
			return s1.compareTo(s2);// 升序
			// return s2.compareTo(s1);//降序
		}
	}

	public static void main(String[] args) {
		/*
		 * 匿名内部类 TreeSet<String> ts = new TreeSet<String>(new
		 * Comparator<Object>() {
		 * 
		 * public int compare(Object o1, Object o2) { String s1 = (String) o1;
		 * String s2 = (String) o2; return s1.compareTo(s2); } });
		 */

		TreeSet<String> ts = new TreeSet<String>();
		ts.add("HashSet");
		ts.add("ArrayList");
		ts.add("TreeMap");
		ts.add("HashMap");
		ts.add("LinkedList");

		Iterator it = ts.iterator();
		while (it.hasNext()) {
			String s = (String) it.next();
			System.out.println(s);
		}

	}

}