package spring.ex.eagle.aop.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.ex.eagle.aop.service.IAccountService;

public class ProxyTests {
	private String path = null;
	@Test
	public void proxyBeforeTest(){
		try {
			path = "spring/ex/eagle/aop/before/before.xml";
			execute(path);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void proxyAroundTest(){
		try {
			path = "spring/ex/eagle/aop/around/around.xml";
			execute(path);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test
	public void proxyThrowingTest(){
		try {
			path = "spring/ex/eagle/aop/throwException/throwing.xml";
			execute(path);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test
	public void proxyAfterReturningTest() {
		try {
			path = "spring/ex/eagle/aop/after/beans.xml";
			execute(path);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void execute(String path) throws Exception {
		try {
			ApplicationContext ctx = 
					new ClassPathXmlApplicationContext(path);
			IAccountService service = 
					(IAccountService) ctx.getBean("proxy");
			service.bankAction();
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}
}
