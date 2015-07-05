package spring.ex.eagle.ioc.extend;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.ex.eagle.bean.Dog;

public class ExtendTest {
@Test
public void IOC_extendTest(){
	String path="spring/ex/eagle1/ioc/extend/extend.xml";
	ApplicationContext container=
			new ClassPathXmlApplicationContext(path);
	Dog dog1=
			(Dog) container.getBean("dog1");
	Dog dog2=
			(Dog) container.getBean("dog2");
	System.out.println(dog1);
	System.out.println(dog2);
	
}
}
