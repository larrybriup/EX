package spring.ex.eagle.aop.ex;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.ex.eagle.aop.service.IAccountService;

public class pTest {
	private String path = null;
	private IAccountService service=null;
	@Test
	public void proxyWithdrawTest(){
		try {
			path = "spring/ex/eagle/aop/ex/withdraw.xml";
			IAccountService service2 = execute(path);
			service2.wd();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test
	public void proxyDepositTest(){
		try {
			path = "spring/ex/eagle/aop/ex/deposit.xml";
			IAccountService service2 = execute(path);
			service2.dp();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public IAccountService execute(String path) throws Exception {
		try {
			ApplicationContext ctx = 
					new ClassPathXmlApplicationContext(path);
			service = 
					(IAccountService) ctx.getBean("proxy");
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
		return service;
	}
}
