package spring.ex.eagle.tran.hibernate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.ex.eagle.tran.Account;
import spring.ex.eagle.tran.service.AccountService;

public class HibernateTest {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"spring/ex/eagle/tran/hibernate/spring_hibernate.xml");
 		Account account = (Account) ctx.getBean("account");
		AccountService service = (AccountService) ctx.getBean("accountService");
		service.saveorupdate(account);
//		service.update(account);
//		service.remove(account);

	}
}
