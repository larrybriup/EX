package spring.ex.eagle.ioc.proEdit;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class proTest {
@Test
public void IOC_proTest(){
	String path="spring/ex/eagle1/ioc/proEdit/addEdit.xml";
	ApplicationContext ctn=
			new ClassPathXmlApplicationContext(path);
	User user=
			(User) ctn.getBean("user");
	System.out.println(user);
}
}
