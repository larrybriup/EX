package spring.ex.eagle.aop.around;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.ex.eagle.aop.service.IAccountService;

public class ArroundTest {
	@Test
	public void aop_aroundAdvice(){
		
		try {
			String path = "com/briup/aop/around/around.xml";
			
			ApplicationContext container = 
				new ClassPathXmlApplicationContext(path);
			
			IAccountService proxy = 
					(IAccountService)container.getBean("proxy");
				proxy.bankAction();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
