package corejava.ch06.ex.ex2;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest2 {

	public static void main(String[] args) {
		int i1[] = { 1, 3, 5, 7, 9 };
		int i2[] = { 2, 4, 6, 8, 10 };
//		int[] it = new int[10];
		
		TreeSet ts = new TreeSet(new Comparator<Object>() {

			public int compare(Object o1, Object o2) {
				int s1 = (Integer) o1;
				int s2 = (Integer) o2;
				return s1 - s2;
			}
		});
		TreeSet ts2 = new TreeSet(new Comparator<Object>() {

			public int compare(Object o1, Object o2) {
				int i1 = (Integer) o1;
				int i2 = (Integer) o2;
				return i2 - i1;
			}
		});
		for (int i = 0; i < i1.length; i++) {
			ts.add(i1[i]);
		}
		for (int i = 0; i < i2.length; i++) {
			ts2.add(i2[i]);
		}
		/*for(int i=0;i<it.length;i++){
			it[i]=i+1;
			ts.add(it[i]);
		}
		int c,d;
		int[] cc=new int[5];
		for(int n=0;n<=4;n++){
			c=2*n+1;
			d=2*n;
			
			cc[n]=it[c];
			
		}
		Iterator itr = ts.iterator();
		while(itr.hasNext()){
			int s = (int)itr.next();
			
		}*/
		Iterator it = ts.iterator();
		while (it.hasNext()) {
			int s = (Integer) it.next();
			System.out.print(s+" ");
		}
		Iterator it2 = ts2.iterator();
		while (it2.hasNext()) {
			int ii = (Integer) it2.next();
			System.out.print(ii+" ");
		}

	}
}