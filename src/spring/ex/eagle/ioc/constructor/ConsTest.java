package spring.ex.eagle.ioc.constructor;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.ex.eagle.bean.DateBean;

public class ConsTest {
	@Test
	public void IOC_consTest() {
		String path = "spring/ex/eagle1/ioc/constructor/constructor.xml";
		ApplicationContext container=
				new ClassPathXmlApplicationContext(path);
		DateBean date=
				(DateBean) container.getBean("date");
		System.out.println(date);
	}
}
