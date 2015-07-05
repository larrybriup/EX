package spring.ex.eagle.ioc.factory;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FactoryTest {
	@Test
	public void IOC_instanceFactoryTest() {
		String path = "spring/ex/eagle1/ioc/factory/factory.xml";
		ApplicationContext ctn=
				new ClassPathXmlApplicationContext(path);
		System.out.println(ctn.getBean("double"));
	}
}
