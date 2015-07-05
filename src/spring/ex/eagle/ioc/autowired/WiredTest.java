package spring.ex.eagle.ioc.autowired;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.ex.eagle.bean.Person;

public class WiredTest {
	@Test
	public void IOC_wiredTest() {
		String path="spring/ex/eagle1/ioc/autowired/autowired.xml";
		ApplicationContext container=
				new ClassPathXmlApplicationContext(path);
		Person person=(Person) container.getBean("person");
		System.out.println(person);
	}
}
