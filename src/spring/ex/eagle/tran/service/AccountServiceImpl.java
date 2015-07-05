package spring.ex.eagle.tran.service;

import spring.ex.eagle.tran.Account;
import spring.ex.eagle.tran.dao.AccountDao;

public class AccountServiceImpl implements AccountService{
	
	private AccountDao accountDao;
	
	public AccountDao getAccountDao() {
		return accountDao;
	}

	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}

	public void saveorupdate(Account account) {
		accountDao.save(account);
	}

	public void update(Account account) {
		accountDao.update(account);
	}

	public void remove(Account account) {
		boolean delete = accountDao.delete(account);
		System.out.println("delete:"+delete);
	}

}
