package spring.ex.eagle.ioc.instanceFactory;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InstanceFactoryTest {
	@Test
	public void IOC_instanceFactoryTest() {
		String path = "spring/ex/eagle1/ioc/instanceFactory/instanceFactory.xml";
		ApplicationContext ctn=
				new ClassPathXmlApplicationContext(path);
		System.out.println(ctn.getBean("time"));
	}
}
