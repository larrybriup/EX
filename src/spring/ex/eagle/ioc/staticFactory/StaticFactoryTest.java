package spring.ex.eagle.ioc.staticFactory;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class StaticFactoryTest {
	@Test
	public void IOC_staticFactoryTest() {
		String path = "spring/ex/eagle1/ioc/staticFactory/staticFactory.xml";
		ApplicationContext ctn=
				new ClassPathXmlApplicationContext(path);
		System.out.println(ctn.getBean("random"));
	}
}
