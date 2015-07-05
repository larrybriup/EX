package spring.ex.eagle.aop.service.service;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LoginTest {
	@Test
	public void proxyLoginTest(){
		try {
			ApplicationContext ctx = 
					new ClassPathXmlApplicationContext
					("spring/ex/eagle/aop/service/service/login.xml");
			LoginService service=
					(LoginService) ctx.getBean("proxy");
			
			service.login("eagle", "pass");
		} catch (Exception e) {
//			e.printStackTrace();
		}
	}
}
