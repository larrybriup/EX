package spring.ex.eagle.ioc.set;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.ex.eagle.bean.Person;

public class SetterTest {
	@Test
	public void IOC_set() {
		String path="spring/ex/eagle1/ioc/set/set.xml";
		ApplicationContext container=
				new ClassPathXmlApplicationContext(path);
		Person person=
				(Person) container.getBean("person");
		System.out.println(person);
	}
}
