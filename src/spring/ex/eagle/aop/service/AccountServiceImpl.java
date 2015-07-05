package spring.ex.eagle.aop.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import spring.ex.eagle.aop.dao.AccountDao;
import spring.ex.eagle.aop.pojo.Account;

@Component
public class AccountServiceImpl implements IAccountService{
	private AccountDao accountDao;
	private Account account;
	
	public AccountDao getAccountDao() {
		return accountDao;
	}
	
	@Resource(name="accountDao")
	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}


	public Account getAccount() {
		return account;
	}
	
	
	public void setAccount(Account account) {
		this.account = account;
	}

	public void bankAction(){
		accountDao.withdraw(account, 100);
		accountDao.deposit(account, 100);
//		throw new RuntimeException("差不多吃饭了！");
	}

	public void wd() {
		accountDao.withdraw(account, 100);
		
	}

	public void dp() {
		accountDao.deposit(account, 100);
		throw new RuntimeException("差不多吃过饭了！");
		
	}
}
