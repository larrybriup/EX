package spring.ex.eagle.ioc.coll;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.ex.eagle.bean.CollBean;

public class CollTest {
	private Map<Integer,String> map;
	@Test
	public void IOC_collTest() {
//		map=new HashMap<Integer, String>();
//		map.put(1, "cho1");
//		map.put(2, "cho2");
//		map.put(3, "cho3");
//		
//		System.out.println(map);
//		System.out.println(map.keySet());
//		Set set = map.entrySet();
//		Iterator itr = set.iterator();
//		while(itr.hasNext()){
//			Map.Entry<Integer, String> e = (Entry<Integer, String>) itr.next();
//			System.out.println(e.getKey()+"-->"+e.getValue());
//		}
		
		String path="spring/ex/eagle1/ioc/coll/coll.xml";
		ApplicationContext container=
				new ClassPathXmlApplicationContext(path);
		CollBean coll=
				(CollBean) container.getBean("coll");
		coll.prt();
		
		
	}
}
